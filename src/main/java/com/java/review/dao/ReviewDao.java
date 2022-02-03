package com.java.review.dao;

import java.util.List;

import com.java.img.dto.ImgDto;
import com.java.review.dto.ReviewDto;

public interface ReviewDao {
	
	public int getCount();
	
	public String getRTname();
	
	public List<ReviewDto> reviewList(int startRow, int endRow);
	
	public int reviewWriteOk(ReviewDto reviewDto);
	
	public ReviewDto read(int RVnumber);
	
	public int reviewWriteNumber(ReviewDto reviewDto);
}
