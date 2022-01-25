package com.java.review.dto;

import java.util.Date;

public class ReviewDto {
	private int RVnumber;	//글번호
	private int RTnumber;	//레스토랑 고유번호
	
	private String Mid;		//회원아이디
	private String RVtitle;	//글제목
	private String RVcontent;	//글내용
	private int RVcount;	//조회수
	private Date RVdate;	//작성일
	
	private String RVfilename;
	private String RVfilepath;
	private long RVfilesize;
	
	public int getRVnumber() {
		return RVnumber;
	}
	public void setRVnumber(int rVnumber) {
		RVnumber = rVnumber;
	}
	public int getRTnumber() {
		return RTnumber;
	}
	public void setRTnumber(int rTnumber) {
		RTnumber = rTnumber;
	}
	public String getMid() {
		return Mid;
	}
	public void setMid(String mid) {
		Mid = mid;
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
	public String getRVfilename() {
		return RVfilename;
	}
	public void setRVfilename(String rVfilename) {
		RVfilename = rVfilename;
	}
	public String getRVfilepath() {
		return RVfilepath;
	}
	public void setRVfilepath(String rVfilepath) {
		RVfilepath = rVfilepath;
	}
	public long getRVfilesize() {
		return RVfilesize;
	}
	public void setRVfilesize(long rVfilesize) {
		RVfilesize = rVfilesize;
	}
	@Override
	public String toString() {
		return "ReviewDto [RVnumber=" + RVnumber + ", RTnumber=" + RTnumber + ", Mid=" + Mid + ", RVtitle=" + RVtitle
				+ ", RVcontent=" + RVcontent + ", RVcount=" + RVcount + ", RVdate=" + RVdate + ", RVfilename="
				+ RVfilename + ", RVfilepath=" + RVfilepath + ", RVfilesize=" + RVfilesize + "]";
	}
	
	
}
