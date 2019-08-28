<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>크라우드 펀딩 상세보기</title>
</head>
<body>
	<h1>펀딩 상세보기</h1>
	<table>
			<tr>
				<th>펀딩넘버</th>
				<td>${crowdfundingVO.num}</td>
				<th>펀딩액</th>
				<td>${crowdfundingVO.price}</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${crowdfundingVO.created_date}</td>
				<th>조회수</th>
				<td>${crowdfundingVO.hit}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td >${crowdfundingVO.subject}</td>
				<%-- <th>첨부파일</th>
				<td ><a href="download?num=${CrowdfundingVO.num}" id="attach_file"></a></td> --%>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="3">
					${crowdfundingVO.content }
				</td>
			</tr>
			<tr>
				<td colspan="4" align="center">
				<input type="button" value="수정" onclick="location.href='checkPass?num=${crowdfundingVO.num}&type=update'">
				<input type="button" value="삭제" onclick="location.href='checkPass?num=${crowdfundingVO.num}&type=delete'">
				<input type="button" value="목록" onclick="location.href='crowdfundingList'">
				<input type="button" value="새글쓰기" onclick="location.href='crowdfundingWriteForm'"></td>
			</tr>
		</table>
</body>
</html>