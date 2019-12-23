<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户修改</title>
<link rel="stylesheet" href="../com/css/main.css"> 
<link rel="stylesheet" href="../com/css/login.css">  
</head>
<body>
	<%@ include file="../basic/header.jsp"%> 

	<div class="content">
		<%@ include file="../user/leftmenue/left.jsp" %>
		<div class="contentext">
			<div class="user" align="center">
				<form action="" method="post" >
					<h3>修改信息</h3><br/>
					身份证号：<input type="text" name="cus_id"/><br/><br/>
					性&nbsp;别：&nbsp;&nbsp;&nbsp;<input type="text" name="cus_sex"/><br/><br/>
					年&nbsp;龄：&nbsp;&nbsp;&nbsp;<input type="text" name="cus_age"/><br/><br/>
					姓&nbsp;名：&nbsp;&nbsp;&nbsp;<input type="text" name="cus_name"/><br/><br/>
					密&nbsp;码：&nbsp;&nbsp;&nbsp;<input type="text" name="cus_password"/><br/><br/>
					电话号码：<input type="text" name="cus_tel"/><br/>	<br/>				 		
					<button id="button">修改</button>&nbsp;&nbsp;
					<a href="../basic/main.jsp">返回</a>
				</form>
		</div>
	 </div>
  </div>
 
	 <%@ include file="../basic/footer.jsp"%> 
</body>
</html>