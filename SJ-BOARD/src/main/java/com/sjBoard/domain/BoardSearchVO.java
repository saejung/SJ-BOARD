package com.sjBoard.domain;

public class BoardSearchVO {
	
	private int bodId; 			//게시판 아이디
	private int searchType = -1;
	private String searchKeyword = "";
	private Pagination pagination = new Pagination();
	
	public Pagination getPagination() {
		return pagination;
	}

	public long getBodId() {
		return bodId;
	}

	public void setBodId(int bodId) {
		this.bodId = bodId;
		this.pagination.setBaseUrl("/board/"+bodId); //여기서 url 어떻게 넣지? controller에는 {boardId} 로 설정되있는데..
	}

	public int getSearchType() {
		return searchType;
	}

	public void setSearchType(int searchType) {
		this.searchType = searchType;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	public void setPageIdx(int pageIdx) {
		this.pagination.setPageIdx(pageIdx);
	}
}
