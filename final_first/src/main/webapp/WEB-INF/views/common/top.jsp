<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
    <link rel="shortcut icon"
    size="16x16 32x32 64x64"
    href="https://i.esdrop.com/d/f/Ci3zGyEGwZ/5MXppq5fTK.png">
    <title>창작의 숲</title>
</head>
<style>
    body{
        margin: 0%;
        -webkit-user-select:none;
        -moz-user-select:none;
        -ms-user-select:none;
        user-select:none;
        background-color: rgb(240, 240, 240);
        text-align: center;
    }
    #search_but{
        width: 40px;
        height: 30px;
    }
    #search{
        width: 800px;
        height: 50px;
        border: 0px solid rgb(204, 204, 204);
    }
    #search :focus{
        border: 0px solid rgb(204, 204, 204);
    }
    .right{
        float:right;
    }
    .left{
        float:left;
    }
    .search_main{
        margin-top: 40px;
        display: inline-block;
        width: 900px;
        height: 60px;
        border-radius: 50px;
        border: 1px solid rgb(0, 0, 0);
        background-color: rgb(255, 255, 255);
    }
    .mama{
        border: 1px solid rgb(0, 0, 0);
        background-color: rgb(255, 255, 255);
        margin-right: 20px;
    }
    .box{
        margin-top: 5px;
        display: inline-block;
        padding: 10px;
        padding-right: 40px;
        border: 1px solid rgb(0, 0, 0);
        background-color: rgb(255, 255, 255);
        width: 350px;
        height: 180px;
    }
    .galleryimg{
        width: 100px;
        height: 100px;
    }
    #mune{
        width: 850px;
    }
    .bb{
        display: inline-block;
    }
    #mina{
    	margin-top: 1px;
    }
    .container {
            max-width: 1000px;
            margin: 0 auto;
            padding: 20px;
        }

 .mama {
            display: inline-block;
            border: 1px solid rgb(0, 0, 0);
            background-color: rgb(255, 255, 255);
            width: 300px;
            padding: 20px;
            margin-top: 20px;
        }

        .mama table {
            width: 100%;
        }

        .mama input[type="text"],
        .mama input[type="password"] {
            width: 100%;
            padding: 5px;
            border: 1px solid rgb(204, 204, 204);
            margin: 5px 0;
        }

        .mama input[type="submit"] {
            width: 100px;
            padding: 5px;
            border: 1px solid rgb(0, 0, 0);
            background-color: rgb(255, 255, 255);
            cursor: pointer;
        }



            .mama {
                width: 100%;
                max-width: 300px;
            }
</style>
<body>
<div>
		<div>
		<c:if test="${userid == null }">
		<span>
		<a href="${pageContext.request.contextPath}/loginpage">로그인</a>
		<a href="${pageContext.request.contextPath}/memberjoin">회원가입</a>
		</span>
		</c:if>
		<c:if test="${userid != null }">
            <span>
              ${userid } 로그인 됨 
            </span>
            <span>
            	<a href="logout"> [로그아웃] </a>
            </span>
            </c:if>
             <span>
            <a>자유게시판</a>
            |
            <a>중고장터</a>
            |
            <a>갤러리</a>
            |
            <a>나무목록</a>
            |
            <a>공지사항</a>
            </span>
        </div>
        <img class="left" src="https://i.esdrop.com/d/f/Ci3zGyEGwZ/jv3Fgn2rdc.png" width="150px" id="logo">
        <div class="search_main">
            <input type="text" id="search" placeholder="검색어를 입력하세요.">
            <button type="submit" id="search_but"><i class="fas fa-search"></i></button>
        </div>
    </div>
</body>
</html>