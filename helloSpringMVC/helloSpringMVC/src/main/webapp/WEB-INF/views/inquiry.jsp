<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학기별 이수 학점 조회</title>
</head>
<body>
	<c:set var="year" value="0" />
	<c:set var="term" value="0" />
	<c:set var="credit" value="0" />

	<table border="1">
		<tr>
			<th>년도</th>
			<th>학기</th>
			<th>취득 학점</th>
			<th>상세 보기</th>
		</tr>
		<c:forEach var="subject" items="${subjects}">
			<tr>
				<c:if test="${(subject.year ne year || subject.term ne term) && subject.year ne 2021}">
					<c:set var="year" value="${subject.year}" />
					<c:set var="term" value="${subject.term}" />
					<c:set var="credit" value="0" />
					<c:forEach var="credits" items="${subjects}">
						<c:if test="${credits.year eq year && credits.term eq term}">
							<c:set var="credit" value="${credit + credits.credit}" />
						</c:if>
					</c:forEach>

					<td align="center"><c:out value="${subject.year}" /></td>
					<td align="center"><c:out value="${subject.term}" /></td>
					<td align="center"><c:out value="${credit}" /></td>
					<td align="center"><a href="${pageContext.request.contextPath}/details/${subject.year}-${subject.term}">
							링크 </a></td>
				</c:if>
			</tr>
		</c:forEach>
	</table>
</body>
</html>