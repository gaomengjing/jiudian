<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户注册</title>
<link rel="stylesheet" href="../com/css/login.css">  
</head>
<body>
	<div class="user" align="center">
		<form action="" method="post" >
			<h1>用户注册</h1><br/>
			身份证号：<input type="text" name="cus_id"/><br/><br/>
			性&nbsp;别：&nbsp;&nbsp;&nbsp;<input type="text" name="cus_sex"/><br/><br/>
			年&nbsp;龄：&nbsp;&nbsp;&nbsp;<input type="text" name="cus_age"/><br/><br/>
			姓&nbsp;名：&nbsp;&nbsp;&nbsp;<input type="text" name="cus_name"/><br/><br/>
			密&nbsp;码：&nbsp;&nbsp;&nbsp;<input type="text" name="cus_password"/><br/><br/>
			电话号码：<input type="text" name="cus_tel"/><br/><br/>						 		
			<button id="button">注册</button>&nbsp;&nbsp;
			<a href="userLogin.jsp">登录</a>
		</form>
	</div>
</body>
</html>