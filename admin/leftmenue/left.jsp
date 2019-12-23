<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<!--  <link rel="stylesheet" href="../../com/css/main.css">  -->

</head>
<body>
		<div class=s>
		         <ul class="s1">
		            <li id="li"><a href="#">管理员</a>
		            	<ul>
		            		<li><a href="/jiudianxitong/queryAllAdminServlet">查询管理员信息</a></li>
		            	    <!-- <li><a href="/jiudianxitong/queryadminByPageServlet">查询管理员信息</a></li> -->
		            	</ul>
		            </li>
		            <li id="li"><a href="#">管理员</a>
		            	<ul>
		            		<li><a href="/jiudianxitong/queryAdminServlet">个人信息</a></li>
		            		<li><a href="/jiudianxitong/selectUpdateAdminServlet">修改个人信息</a></li>
		            		<li><a href="/jiudianxitong/selectUpdatePWServlet">修改密码</a></li>
		            		<li><a href="web/admin/role_manager/query/adminLogin.jsp">退出登录</a></li>
		            		<li><a href="/jiudianxitong/deleteAdminServlet">注销账号</a></li>
		            	</ul>
		            </li>
		         </ul> 
		    </div>

</body>
</html>