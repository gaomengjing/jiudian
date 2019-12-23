<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户登录</title>
<link rel="stylesheet" href="../com/css/login.css">  
</head>
<body>
<div class="user" align="center">
		<form action="../basic/main.jsp" method="post" >
			<h1>用户登录</h1><br/>
			账&nbsp;号：<input type="text" name="cus_tel"/><br/><br/>	
			密&nbsp;码：<input type="text" name="cus_password"/><br/><br/>
								 		
			<button id="button">登录</button>&nbsp;
			<a href="userRegister.jsp">注册</a>
		</form>
	</div>
</body>
</html>