<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업체 목록</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<th>업체번호</th>
				<th>업체아이디</th>
				<th>비밀번호</th>
				<th>업체명</th>
				<th>업체주소</th>
				<th>대표</th>
				<th>등록일</th>
				<th>전화번호</th>
				<th>조회수</th>
			</tr>
			<c:forEach items="${corporationList}" var="corList">
				<tr>
					<td>${corList.num }</td>
					<td>${corList.id }</td>
					<td>${corList.password}</td>
					<td>${corList.name}</td>
					<td>${corList.address}</td>
					<td>${corList.ceoname}</td>
					<td>${corList.regdate}</td>
					<td>${corList.phonenum}</td>
					<td>${corList.account}</td>
				</tr>
			</c:forEach>
		</table>
		
		<div align="center">
			<br>
			<br>
			<input type="button" value ="업체등록"  onclick="location.href='corporationWriteForm'">
		</div>
	</div>
</body>
</html>
