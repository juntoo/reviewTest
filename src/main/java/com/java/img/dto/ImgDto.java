package com.java.img.dto;

public class ImgDto {
	private int Inumber;
	private String Icategory;
	private String Iname;
	private long Isize;
	private String Ipath;
	public int getInumber() {
		return Inumber;
	}
	public void setInumber(int inumber) {
		Inumber = inumber;
	}
	public String getIcategory() {
		return Icategory;
	}
	public void setIcategory(String icategory) {
		Icategory = icategory;
	}
	public String getIname() {
		return Iname;
	}
	public void setIname(String iname) {
		Iname = iname;
	}
	public long getIsize() {
		return Isize;
	}
	public void setIsize(long isize) {
		Isize = isize;
	}
	public String getIpath() {
		return Ipath;
	}
	public void setIpath(String ipath) {
		Ipath = ipath;
	}
	@Override
	public String toString() {
		return "ImgDto [Inumber=" + Inumber + ", Icategory=" + Icategory + ", Iname=" + Iname + ", Isize=" + Isize
				+ ", Ipath=" + Ipath + "]";
	}
	
	
}
