<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户查询</title>
<link rel="stylesheet" href="../../../com/css/main.css"> 
<link rel="stylesheet" href="../../../com/css/login.css">  
</head>
<body>
<%-- <%@ include file="../basic/header.jsp"%>  --%>
<%@include file="../../../basic/header.jsp" %>
<div class="content">
		<%@ include file="../../../customer/leftmenue/left.jsp" %>
		<div class="contentext">
	<div class="user" align="center">
		<form action="/jiudianxitong/queryCustomerServlet" method="post" >
			<h1>查询用户</h1><br/>
			<!-- 身份证号：<input type="text" name="cus_id"/><br/><br/> -->
			<!-- 姓&nbsp;名：&nbsp;&nbsp;&nbsp;<input type="text" name="cus_name"/><br/><br/> -->
			电话号码：<input type="text" name="cus_tel"/><br/><br/>						 		
			<input type="submit" id="button" value="查询">&nbsp;&nbsp;
		</form>
	</div>
	 </div>
  </div>
 
	 <%@ include file="../../../basic/footer.jsp"%> 
</body>
</html>