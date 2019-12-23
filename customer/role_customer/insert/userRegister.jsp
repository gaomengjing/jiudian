<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户注册</title>
<link rel="stylesheet" href="../../../com/css/register.css">  
</head>
<body>
	<div class="user" align="center">
	
		<form action="/jiudianxitong/addCustomerServlet" method="post" >
			   <div class="register">
                    <h1>用户注册</h1><br/>
                    <label>身份证号：</label><input type="text" name="cus_id"/><br/><br/>
                    <label>姓名：</label><input type="text" name="cus_name"/><br/><br/>
                    <label>性别：</label><input type="text" name="cus_sex"/><br/><br/>
                    <label>年龄：</label><input type="text" name="cus_age"/><br/><br/>
                    <label>电话号码：</label><input type="text" name="cus_tel"/><br/><br/>
                    <label>密码：</label><input type="password" name="cus_password"/><br/><br/>
								 		
			         <input type="submit" id="button" value="注册">&nbsp;&nbsp;
                     <a href="../query/userLogin.jsp" style="text-decoration: none;">登录</a>
		  </div>
		</form>
	</div>
</body>
</html>