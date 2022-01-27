package com.java.review.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.taglibs.standard.extra.spath.AbsolutePath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.java.aop.LogAspect;
import com.java.img.dto.ImgDto;
import com.java.review.dao.ReviewDao;
import com.java.review.dto.ReviewDto;

@Component
public class ReviewServiceImp implements ReviewService {
	@Autowired
	private ReviewDao reviewDao;
	
	@Override
	public void reviewList(ModelAndView mav) {
		Map<String, Object> map=mav.getModel();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber == null) pageNumber="1";
		
		int currentPage=Integer.parseInt(pageNumber);
		LogAspect.logger.info(LogAspect.LogMsg+currentPage);
		
		int boardSize=4;
		int startRow=(currentPage-1)*boardSize+1;
		int endRow=currentPage*boardSize;
		
		int count=reviewDao.getCount();
		LogAspect.logger.info(LogAspect.LogMsg+count);
		
		List<ReviewDto> reviewList=null;
		if(count > 0) {
			reviewList=reviewDao.reviewList(startRow, endRow);
			LogAspect.logger.info(LogAspect.LogMsg+reviewList.size());	
		}
		
		mav.addObject("boardSize", boardSize);
		mav.addObject("currentPage",currentPage);
		mav.addObject("ReviewList", reviewList);
		mav.addObject("count", count);
		
		mav.setViewName("community/ReviewList");
	}
	
	@Override
	public void reviewWrite(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		
		int RVnumber=0;
		
		if(request.getParameter("RVnumber") !=null) {
			RVnumber=Integer.parseInt(request.getParameter("RVnumber"));
		}
		
		mav.addObject("RVnumber", RVnumber);
		
		mav.setViewName("community/ReviewWrite");
	}
	
	@Override
	public void reviewWriteOk(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		ReviewDto reviewDto=(ReviewDto) map.get("reviewDto");
		ImgDto imgDto=(ImgDto) map.get("ImgDto");
		MultipartHttpServletRequest request=(MultipartHttpServletRequest) map.get("request");
		
		reviewWriterNumber(reviewDto);
		
		MultipartFile upFile=request.getFile("file");
		LogAspect.logger.info(LogAspect.LogMsg+upFile.getName());
		if(upFile.getSize() !=0) {
			String Iname=Long.toString(System.currentTimeMillis())+"_"+upFile.getOriginalFilename();
			String Icategory=reviewDto.getRVnumber();
			long Isize=upFile.getSize();
			LogAspect.logger.info(LogAspect.LogMsg+Iname+","+Isize);
			
			File path=new File("/YMJJtest/src/main/webapp/resources/img");
			path.mkdir();
			
			if(path.exists() && path.isDirectory()) {
				File file=new File(path, Iname);
				
				try {
					upFile.transferTo(file);
					
					imgDto.setIname(Iname);
					imgDto.setIsize(Isize);
					imgDto.setIpath(file.getAbsolutePath());
					imgDto.setIcategory(Icategory);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		LogAspect.logger.info(LogAspect.LogMsg+reviewDto.toString());
		int check=reviewDao.reviewWriteNumber(reviewDto, imgDto);
		LogAspect.logger.info(LogAspect.LogMsg+check);
		
		mav.addObject("check",check);
		mav.setViewName("community/ReviewWriteOk");
		
	}
	
	public void reviewWriterNumber(ReviewDto reviewDto) {
		String RVnumber=reviewDto.getRVnumber();
	}
}
