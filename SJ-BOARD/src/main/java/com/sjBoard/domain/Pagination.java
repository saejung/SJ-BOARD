package com.sjBoard.domain;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 *	페이징 객체
 */
public class Pagination {
	private int totalRecordCnt = 0; // 전체 레코드 갯수
	private int totalPageSize = 1; // 전처 페이즈 갯수
	private int pageIdx = 1; // 현재 페이지 인덱스
	private int pageSizePerBlock = 10; // 블락 당 페이지 갯수
	private int recordSizePerPage = 10; // 페이지 당 레코드 갯수
	private Map<String, String> searchParams = new HashMap<String, String>();
	private String baseUrl = "";
	
	public int getTotalRecordCnt() {
		return totalRecordCnt;
	}
	public void setTotalRecordCnt(int totalRecordCnt) {
		this.totalRecordCnt = totalRecordCnt;
		this.totalRecordCnt = totalRecordCnt;
		this.totalPageSize = (int) Math.ceil(totalRecordCnt / (double) recordSizePerPage);
		
		if (this.pageIdx >= this.totalPageSize) {
			this.setPageIdx(this.totalPageSize);
		}
	}
	public int getPageIdx() {
		return pageIdx;
	}
	public void setPageIdx(int pageIdx) {
		if (pageIdx < 1) {
			pageIdx = 1;
		}
		this.pageIdx = pageIdx;
	}
	/**
	 * 전체 페이지 갯수
	 */
	public int getTotalPageSize() {
		return this.totalPageSize;
	}
	/**
	 * 이전 페이지 인덱스
	 */
	public int getPrevPageIdx() {
		int pageIdx = this.pageIdx;
		pageIdx--;
		if (pageIdx < 1) {
			pageIdx = 1;
		}
		return pageIdx;
	}
	/**
	 * 다음 페이지 인덱스
	 */
	public int getNextPageIdx() {
		int pageIdx = this.pageIdx;
		pageIdx++;
		if (pageIdx > this.totalPageSize) {
			pageIdx = this.totalPageSize;
		}
		return pageIdx;
	}
	/**
	 * 이전 페이지 블락의 시작 인덱스 (현재 페이지 11~20사이 일 경우, 이전 페이지 블락의 시작 인덱스는 1)
	 */
	public int getPrevBlockPageIdx() {
		int term = (((int) Math.floor(this.pageIdx / (double) pageSizePerBlock)) - 1) * pageSizePerBlock + 1; 
		if (term < 1) {
			term = 1;
		}
		return term;
	}
	/**
	 * 다음 페이지 블락의 시작 인덱스 (현재 페이지 1~10사이 일 경우, 다음 페이지 블락의 시작 인덱스는 11)
	 */
	public int getNextBlockPageIdx() {
		int term = ((int) Math.ceil(this.pageIdx / (double) pageSizePerBlock)) * pageSizePerBlock + 1; 
		if (term > this.getTotalPageSize()) {
			term = this.getTotalPageSize();
		}
		return term;
	}
	/**
	 * 현재 페이지 인덱스의 블락 인덱스
	 */
	public int getCurPageBlockIdx() {
		return (int) Math.ceil(this.pageIdx / (double) pageSizePerBlock);
	}
	public int getCurBlockPageFirstIdx() {
		return (this.getCurPageBlockIdx() - 1) * pageSizePerBlock + 1;
	}
	public int getCurBlockPageLastIdx() {
		int idx = this.getCurPageBlockIdx() * pageSizePerBlock;
		if (idx > this.getTotalPageSize()) {
			idx = this.getTotalPageSize();
		}
		return idx;
	}
	/**
	 * 블락 당 페이지 사이즈
	 */
	public int getPageSizePerBlock() {
		return pageSizePerBlock;
	}
	/**
	 * 블락 당 페이지 사이즈 설정
	 */
	public void setPageSizePerBlock(int pageSizePerBlock) {
		this.pageSizePerBlock = pageSizePerBlock;
	}
	/**
	 * 페이지 당 레코드 사이즈
	 */
	public int getRecordSizePerPage() {
		return recordSizePerPage;
	}
	/**
	 * 페이지 당 레코드 사이즈 설정
	 */
	public void setRecordSizePerPage(int recordSizePerPage) {
		this.recordSizePerPage = recordSizePerPage;
	}
	/**
	 * 검색 파라미터
	 */
	public String getSearchParams() {
		String params = "";
		int size = this.searchParams.size();
		int idx = 1;
		for (Map.Entry<String, String> entry : this.searchParams.entrySet()) {
			params += entry.getKey() + "=" + entry.getValue();
			if (idx < size) {
				params += "&";
			}
			idx++;
		}
		
		return params;
	}
	
	/**
	 * 검색 파라미터 추가
	 * @throws UnsupportedEncodingException RuntimeException Wrapper
	 */
	public void addSearchParams(String name, String value) throws RuntimeException {
		try {
			this.searchParams.put(name, URLEncoder.encode(value, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
}
