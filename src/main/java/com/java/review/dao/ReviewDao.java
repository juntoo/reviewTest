package com.java.review.dao;

import java.util.List;

import com.java.review.dto.ReviewDto;

public interface ReviewDao {
	
	public int getCount();
	
	public List<ReviewDto> reviewList(int startRow, int endRow);
}
