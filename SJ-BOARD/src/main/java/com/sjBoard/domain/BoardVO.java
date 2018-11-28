package com.sjBoard.domain;

import java.util.Date;

public class BoardVO {
	
	private long idx; 				//게시물 인덱스 (시퀀스)
	private long bodId; 			//게시판 아이디
	private String title; 			//게시물 제목
	private String content; 		//게시물 내용
	private String writerId; 		//게시물 작성자
	private Date writeDate; 		//게시물 작성 날짜
	private String changerId; 		//게시물 변경자
	private Date changeDate;	 	//게시물 변경 날짜
	
	
	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
	}
	public long getBodId() {
		return bodId;
	}
	public void setBodId(long bodId) {
		this.bodId = bodId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getChagerId() {
		return changerId;
	}
	public void setChagerId(String changerId) {
		this.changerId = changerId;
	}
	public Date getChageDate() {
		return changeDate;
	}
	public void setChageDate(Date changeDate) {
		this.changeDate = changeDate;
	}
}
