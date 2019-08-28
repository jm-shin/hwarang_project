<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>크라우드 펀딩 목록</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<th>펀딩번호</th>
				<th>펀딩가격</th>
				<th>펀딩제목</th>
				<th>펀딩내용</th>
				<th>펀딩시작일</th>
				<th>펀딩목표일</th>
				<th>목표금액</th>
				<th>펀딩상태</th>
				<th>조회수</th>
			</tr>
			<c:forEach items="${crowdfundingList}" var="funding">
				<tr>
					<td>${funding.num }</td>
					<td>${funding.price }</td>
					<td><a href="view?num=${funding.num}">${funding.subject}
					<span style="color:red"> 
					<c:if test="${funding.hit != 0}"></c:if> </span> </a></td>
					<td>${funding.content}</td>
					<td>${funding.created_date}</td>
					<td>${funding.target_date}</td>
					<td>${funding.target_amount}</td>
					<td>${funding.current_collection}</td>
					<td>${funding.hit}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5">
					<form action="crowdfundingList">
						<select name="type">
							<option value="1">제목</option>
							<option value="2">내용</option>
							<option value="3">제목+내용</option>
							<option value="4">작성자</option>
						</select>
					<!-- 	<input type="text" name="keyword" placeholder="검색어를 입력하세요">
						<input type="submit" value="검색"> -->
					</form>
				</td>
			</tr>
		</table>
		<div align="center">
			<br>
			<br>
			<input type="button" value ="펀딩등록"  onclick="location.href='crowdfundingWriteForm'">
		</div>
	</div>
</body>
</html>
