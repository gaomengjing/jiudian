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
            		<li><a href="/jiudianxitong/queryCustomerServlet">个人信息</a></li>
            	    <li><a href="/jiudianxitong/selectUpdateCustomerServlet">修改个人信息</a></li>
            		<li><a href="/jiudianxitong/selectUpdatePasswordServlet">修改密码</a></li>           		
            		<li><a href="web/customer/role_customer/query/userLogin.jsp">退出登录</a></li>
            		<li><a href="/jiudianxitong/deleteCustomerServlet">注销账号</a></li>
            	</ul>
            </li> 
        </ul>

         <ul class="s1">
            <li id="li"><a href="#">管理员</a>
            	<ul>
            		<li><a href="../admin/adminInformation.jsp">个人信息</a></li>
            		<li><a href="../admin/adminUpdate.jsp">修改个人信息</a></li>
            		<li><a href="../admin/updatePassword.jsp">修改密码</a></li>
            		<li><a href="#">退出登录</a></li>
            	</ul>
            </li> 
         </ul>
    </div>
</body>
</html>