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
	<form action="login" method="post">
    	<div class="mama">
        	<table>
				<tr>
                    <th colspan="2" width="224px">로그인</th>
               	</tr>
                <tr>
                    <td colspan="2"><br></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="text" placeholder="ID" name="id"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="text" placeholder="PW" name="pass"></td>
                </tr>
                <tr>
                    <td colspan="2"><br></td>
                </tr>
                <tr>
                    <td width="92px" align="center"><input type="submit" value="login"></td><td width="92px" align="center">
                </tr>
            </table>
        </div>
        </form>
</body>
</html>