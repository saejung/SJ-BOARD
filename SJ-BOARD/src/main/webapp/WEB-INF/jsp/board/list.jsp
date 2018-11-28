<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<c:set var="pagination" value="${boardSearchVO.pagination}"></c:set>
<c:set var="searchParams" value="${pagination.searchParams}"></c:set>
<c:set var="recordSearchParams"	value="pageIdx=${pagination.pageIdx}&${searchParams}"></c:set>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/common.css'/>">
</head>

<body>
	게시판 목록 페이지ccc
	
	<h2>${boardMaster.bodNm}</h2>
	<div class="writeButton"><a href="${pageContext.servletContext.contextPath}/board/write" title="새 글 등록">새 글 등록</a></div>
	
	<!-- boardId = 10 일 경우, 자유게시판 -->
	<c:if test="${boardMaster.bodId == '10'}"> 
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록일</th>
					<th>조회</th>
				</tr>
			</thead>
			<tbody>
				<c:if test ="${boardList.size() != 0 }">
				<c:forEach items="${boardList}" var="item" varStatus="status">
				<tr>
					<td>${item.idx}</td>
					<td><a href="${pageContext.servletContext.contextPath}/board/${item.bodId}/${item.idx}" title="${item.title}">${item.title}</a></td>
					<td>${item.writerId}</td>
					<td>${item.writeDate}</td>
					<td>1</td>
				</tr>
				</c:forEach>
				</c:if>
			</tbody>
		</table>
		
		<br>
	</c:if>
	
	
	<!-- boardId = 20 일 경우, FAQ -->
	<c:if test="${boardMaster.bodId == '20'}"> 
		<table>
			<colgroup>
				<col width="10%">
				<col width="*%">
				<col width="10%">
				<col width="30%">
				<col width="10%">
			</colgroup>	
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록일</th>
					<th>조회</th>
				</tr>
			</thead>
			<tbody>
				<c:if test ="${boardList.size() != 0 }">
				<c:forEach items="${boardList}" var="item" varStatus="status">
				<tr>
					<td>${item.idx}</td>
					<td><a href="${pageContext.servletContext.contextPath}/board/${item.bodId}/${item.idx}" title="${item.title}">${item.title}</a></td>
					<td>${item.writerId}</td>
					<td>${item.writeDate}</td>
					<td>1</td>
				</tr>
				</c:forEach>
				</c:if>
			</tbody>
		</table>
	</c:if>
	
		<c:set var="pagination" value="${pagination}" scope="request"></c:set>
		<jsp:include page="/WEB-INF/jsp/board/pagination.jsp"></jsp:include>
</body>
</html>