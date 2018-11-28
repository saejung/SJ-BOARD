package com.sjBoard.domain;

import java.util.Date;

public class BoardMasterVO {
	
	private int bodId;			//게시판 아이디
	private String bodNm;		//게시판 이름
	private char useYn;			//게시판 사용유무
	private String createId;	//게시판 생성자
	private Date createDate;	//게시판 생성날짜
	
	public int getBodId() {
		return bodId;
	}
	public void setBodId(int bodId) {
		this.bodId = bodId;
	}
	public String getBodNm() {
		return bodNm;
	}
	public void setBodNm(String bodNm) {
		this.bodNm = bodNm;
	}
	public char getUseYn() {
		return useYn;
	}
	public void setUseYn(char useYn) {
		this.useYn = useYn;
	}
	public String getCreateId() {
		return createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
