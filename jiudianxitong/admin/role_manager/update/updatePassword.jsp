<%@page import="org.entity.Admin"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户修改</title>
<link rel="stylesheet" href="<%=basePath%>web/com/css/main.css" type="text/css" > 
</head>
<body>
	<%@ include file="../../../basic/header.jsp"%> 

	<div class="content">
		<%@ include file="../../../admin/leftmenue/left.jsp" %>
		<div class="contentext">
			<!-- <div class="user" align="center"> -->
			<div class="user" align="center">
				 <form action="" method="post" > 
				  <div class="register"> 
                     <h2>原始密码</h2><br/>
                     <%
				         List<Admin> list=(List<Admin>)request.getAttribute("list");
          		     %>
						<%	for(Admin admin:list){
					 %>					
					 <label>密码：</label><input type="text" name="cus_password" value="<%=admin.getAdm_password()%>"/><br/><br/>			 		
					<!--  <input type="submit" id="button" value="修改">&nbsp;&nbsp; -->
					<!-- <a href="../basic/main.jsp">返回</a> -->
				<%
					}
            %> 
            		<!--  </div>  -->
			    </form>
				<form action="/jiudianxitong/updatePWServlet" method="post" >
				  <!-- <div class="register">  -->
                     <h2>新密码</h2><br/>
                      <label>密码：</label><input type="text" name="adm_password" "/><br/><br/>			 		
					 <input type="submit" id="button" value="修改">&nbsp;&nbsp;
				 </div> 
			</form>
		</div>
	 </div>
  </div>
 
	 <%@ include file="../../../basic/footer.jsp"%> 
</body>
</html>