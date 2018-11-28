package com.sjBoard.domain;

import java.util.Date;

public class UserVO {
	
	private String userId; 			//사용자 아이디
	private String userPw;			//사용자 비번
	private String userNm; 			//사용자 이름
	private String userAddress; 	//사용자 주소
	private Date createDate; 		//계정 생성 날짜
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
