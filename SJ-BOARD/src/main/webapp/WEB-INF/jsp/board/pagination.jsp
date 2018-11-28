<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<div class="pagination" title="페이지 수 매기기">
	<c:set var="baseUrl" value="${pageContext.servletContext.contextPath}${pagination.baseUrl}"></c:set>
	<span class="control">
		<a class="first" href="${baseUrl}?pageIdx=1&${pagination.searchParams}" title="처음 페이지">처음 페이지</a>
		<a class="prev" href="${baseUrl}?pageIdx=${pagination.prevBlockPageIdx}&${pagination.searchParams}" title="이전 페이지">이전 페이지</a>
	</span>
	<span class="pages">
		<c:forEach begin="${pagination.curBlockPageFirstIdx}" end="${pagination.curBlockPageLastIdx}" varStatus="status">
			<a class="page <c:if test="${pagination.pageIdx == status.current}">on</c:if>" href="${baseUrl}?pageIdx=${status.current}&${pagination.searchParams}" title="현재 페이지">${status.current}</a>
		</c:forEach>
	</span>
	<span class="control">
		<a class="next" href="${baseUrl}?pageIdx=${pagination.nextBlockPageIdx}&${pagination.searchParams}" title="다음 페이지">다음 페이지</a>
		<a class="last" href="${baseUrl}?pageIdx=${pagination.totalPageSize}&${pagination.searchParams}" title="끝 페이지">끝 페이지</a>
	</span>
</div>