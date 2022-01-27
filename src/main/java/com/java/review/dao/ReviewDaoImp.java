package com.java.review.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.img.dto.ImgDto;
import com.java.review.dto.ReviewDto;

@Component
public class ReviewDaoImp implements ReviewDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<ReviewDto> reviewList(int startRow, int endRow) {
		HashMap<String, Integer> hMap=new HashMap<String, Integer>();
		hMap.put("startRow", startRow);
		hMap.put("endRow", endRow);

		return sqlSessionTemplate.selectList("reviewList", hMap);
	}
	
	@Override
	public int getCount() {
		return sqlSessionTemplate.selectOne("reviewCount");
	}
	
	@Override
	public int reviewWriteNumber(HashMap<String, Integer> hMap) {
		
		return sqlSessionTemplate.update("hMap", hMap);
	}
	
	@Override
	public int reviewWriteNumber(ReviewDto reviewDto, ImgDto imgDto) {
		
		int check = 0;
		
		int reviewInsertCheck=sqlSessionTemplate.insert("reviewInsert", reviewDto);
		int imgInsertCheck=sqlSessionTemplate.insert("imgInsert", imgDto);
		
		if(reviewInsertCheck>0 && imgInsertCheck>0) {
			check=1;
		}
		
		return check;
	}
}
