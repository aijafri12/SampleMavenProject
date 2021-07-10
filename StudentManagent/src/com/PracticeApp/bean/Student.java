package com.PracticeApp.bean;

public class Student {
	private int stnum;
	private String sname;
	private String stadd;
	public int getStnum() {
		return stnum;
	}
	public void setStnum(int stnum) {
		this.stnum = stnum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStadd() {
		return stadd;
	}
	public void setStadd(String stadd) {
		this.stadd = stadd;
	}
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public Student(int stnum, String sname, String stadd) {
		
		this.stnum = stnum;
		this.sname = sname;
		this.stadd = stadd;
	}
	
	

}
