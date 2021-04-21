<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학기별 이수 학점 상세 보기</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>년도</th>
			<th>학기</th>
			<th>교과목명</th>
			<th>교과구분</th>
			<th>담당교수</th>
			<th>학점</th>
		</tr>
		<c:forEach var="subject" items="${subjects}">
			<tr>
					<td align="center"><c:out value="${subject.year}" /></td>
					<td align="center"><c:out value="${subject.term}" /></td>
					<td align="center"><c:out value="${subject.name}" /></td>
					<td align="center"><c:out value="${subject.classification}" /></td>
					<td align="center"><c:out value="${subject.professor}" /></td>
					<td align="center"><c:out value="${subject.credit}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>