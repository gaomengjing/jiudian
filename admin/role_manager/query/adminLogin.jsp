<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员登录</title>
<link rel="stylesheet" href="../../../com/css/login.css">   
</head>
<body>
	<div class="user" align="center">
		<form action="/jiudianxitong/queryAdminLoginServlet" method="post" >
			<div class="login">
				<h1>管理员登录</h1><br/>
				<label style="font-size: 22px">账号：</label>
				<input type="text" name="adm_tel"/><br/><br/><br/>		
				<label style="font-size:22px">密码：</label>
				<input type="password" name="adm_password"/><br/><br/><br/>									 		
				<input type="submit" id="button" value="登录">&nbsp;
				<a href="../insert/adminRegister.jsp" style="text-decoration: none;">注册</a>
			</div>
		</form>
	</div>
</body>
</html>