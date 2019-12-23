<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<div class="s">
        <ul class="s1">
            <li id="li"><a href="#">用户</a>
            	<ul>
            		<li><a href="../user/userInformation.jsp">个人信息</a></li>
            		<li><a href="../user/userUpdate.jsp">修改个人信息</a></li>
            		<li><a href="../user/updatePassword.jsp">修改密码</a></li>
            		<li><a href="#">退出登录</a></li>
            	</ul>
            </li> 
        </ul>

         <ul class="s1">
            <li id="li"><a href="#">管理员</a>
            	<ul>
            		<li><a href="#">个人信息</a></li>
            		<li><a href="#">修改个人信息</a></li>
            		<li><a href="#">修改密码</a></li>
            		<li><a href="#">退出登录</a></li>
            	</ul>
            </li> 
         </ul>
    </div>
</body>
</html>