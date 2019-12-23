<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户登录</title>
<link rel="stylesheet" href="../../../com/css/login.css">  
</head>
<body>

<div class="user" align="center">
	<form action="/jiudianxitong/customerLoginServlet" method="post" >
		<div class="login">
	        <h1>用户登录</h1><br/>
	        <label style="font-size: 22px">账号：</label>
	        <input type="text" name="cus_tel" /><br/><br/><br/>	
	        <label style="font-size:22px">密码：</label>
	        <input type="password" name="cus_password" /><br/><br/><br/>
		    <input type="submit" id="button" value="登录">&nbsp;					 		
		    <a href="../insert/userRegister.jsp" style="text-decoration: none;">注册</a>
		</div>
	</form>		
</div>
</body>
</html>