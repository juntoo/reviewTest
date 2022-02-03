package com.java.review.dto;

import java.util.Date;

public class ReviewDto {
	private int RVnumber;	//글번호
	private String Mid;		//회원아이디
	private int RTnumber;	//레스토랑 고유번호
	private String RTname;
	
	private String RVtitle;	//글제목
	private String RVcontent;	//글내용
	private int RVcount;	//조회수
	private Date RVdate;	//작성일
	
	private String RVimgname;
	private String RVimgpath;
	private Long RVimgsize;
	public int getRVnumber() {
		return RVnumber;
	}
	public void setRVnumber(int rVnumber) {
		RVnumber = rVnumber;
	}
	public String getMid() {
		return Mid;
	}
	public void setMid(String mid) {
		Mid = mid;
	}
	public int getRTnumber() {
		return RTnumber;
	}
	public void setRTnumber(int rTnumber) {
		RTnumber = rTnumber;
	}
	public String getRTname() {
		return RTname;
	}
	public void setRTname(String rTname) {
		RTname = rTname;
	}
	public String getRVtitle() {
		return RVtitle;
	}
	public void setRVtitle(String rVtitle) {
		RVtitle = rVtitle;
	}
	public String getRVcontent() {
		return RVcontent;
	}
	public void setRVcontent(String rVcontent) {
		RVcontent = rVcontent;
	}
	public int getRVcount() {
		return RVcount;
	}
	public void setRVcount(int rVcount) {
		RVcount = rVcount;
	}
	public Date getRVdate() {
		return RVdate;
	}
	public void setRVdate(Date rVdate) {
		RVdate = rVdate;
	}
	public String getRVimgname() {
		return RVimgname;
	}
	public void setRVimgname(String rVimgname) {
		RVimgname = rVimgname;
	}
	public String getRVimgpath() {
		return RVimgpath;
	}
	public void setRVimgpath(String rVimgpath) {
		RVimgpath = rVimgpath;
	}
	public Long getRVimgsize() {
		return RVimgsize;
	}
	public void setRVimgsize(Long rVimgsize) {
		RVimgsize = rVimgsize;
	}
	@Override
	public String toString() {
		return "ReviewDto [RVnumber=" + RVnumber + ", Mid=" + Mid + ", RTnumber=" + RTnumber + ", RTname=" + RTname
				+ ", RVtitle=" + RVtitle + ", RVcontent=" + RVcontent + ", RVcount=" + RVcount + ", RVdate=" + RVdate
				+ ", RVimgname=" + RVimgname + ", RVimgpath=" + RVimgpath + ", RVimgsize=" + RVimgsize + "]";
	}
	
	
}
