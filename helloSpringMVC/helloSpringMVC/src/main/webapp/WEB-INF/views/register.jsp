<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강 신청</title>
</head>
<body>
	<sf:form method="post" action="${pageContext.request.contextPath}/registered" modelAttribute="subject">
		<table>
			<tr>
				<td>교과목 :</td>
				<td><sf:input type="text" path="name"/><br>
				<sf:errors path="name"/>
			</tr>
			<tr>
				<td>교과구분 :</td>
				<td><sf:input type="text" path="classification"/><br>
				<sf:errors path="classification"/>
			</tr>
			<tr>
				<td>담당교수 :</td>
				<td><sf:input type="text" path="professor"/><br>
				<sf:errors path="professor"/>
			</tr>
			<tr>
				<td>학점 :</td>
				<td><sf:input type="text" path="credit"/><br>
				<sf:errors path="credit"/>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>