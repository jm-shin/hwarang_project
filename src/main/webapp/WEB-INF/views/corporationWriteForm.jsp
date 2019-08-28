<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>펀딩 업체 등록페이지</title>
</head>
<body>
	<div class="wrap" align="center">
		<h1>업체 등록</h1>
		<form action="corporationRegister" method="post">
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id">*필수</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="password">*필수</td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name">*필수</td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" name="address">*필수</td>
				</tr>
				<tr>
					<th>대표</th>
					<td><input type="text" name="ceoname">*필수</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="phonenum">*필수</td>
				</tr>
				<tr>
					<th>조회수</th>
					<td><input type="text" name="account"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="등록">
						<input type="reset" value="다시작성"> 
						<input type="button" value="목록" onclick="location.href='corporationList'">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>