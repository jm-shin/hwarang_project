<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>펀딩 등록 페이지</title>
</head>
<body>
	<div class= "wrap" align="center">
		<%-- 사용자에게 입력을 받아서 전달하는 기능 --%>	
		<h1>화랑 펀딩 등록</h1>
		<form  action="crowdfundingRegister" method="post">
			<table>
				<tr>
					<th>숫자</th>
					<td><input type="text" name="num">*필수</td>
				</tr>
				<tr>
					<th>가격</th>
					<td><input type="text" name="price">*필수</td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="subject">*필수</td>
				</tr>
				<tr>
					<th>내용</th>
					<td><input type="text" name="content">*필수</td>
				</tr>
			<!-- 	<tr>
					<th>작성일</th>
					<td><input type="text" name="created_date">*필수</td>
				</tr>
				<tr>
					<th>목표일</th>
					<td><input type="text" name="target_date">*필수</td>
				</tr>  -->
				<tr>
					<th>펀딩 목표금액</th>
					<td><input type="text" name="target_amount">*필수</td>
				</tr>
				<tr>
					<th>현재 펀딩상태</th>
					<td><input type="text" name="current_collection">*필수</td>
				</tr>
				<tr>
					<th>조회수</th>
					<td><input type="text" name="hit">*필수</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value = "등록">
						<input type="reset"  value = "다시작성">
						<input type="button" value ="목록" onclick="location.href='crowdfundingList'">
					</td>
				</tr>
			</table>
		</form>
	</div>	
</body>
</html>