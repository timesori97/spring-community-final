<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <%@ include file="../common/top.jsp" %>
	<h3>회원가입</h3>
	<form action="${pageContext.request.contextPath}/memberjoind" method="post" enType="multipart/form-data">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="pass"></td>
		</tr>
		<tr>
			<td><input type="submit" value="가입"></td>
		</tr>
	</table>
	</form>
</body>
</html>