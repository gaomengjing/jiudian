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
			<div class="user" align="center">
				<form action="/jiudianxitong/updateAdminServlet" method="post" >
				   <div class="register">
                     <h2>管理员修改</h2><br/>
                     <%
				         List<Admin> list=(List<Admin>)request.getAttribute("list");
                     
          				  %>
						<%	for(Admin admin:list){
					 %>
					<label>编号：</label><input type="text" name="adm_id" value="<%=admin.getAdm_id()%>"/><br/><br/>
					<label>姓名：</label><input type="text" name="adm_name" value="<%=admin.getAdm_name()%>"/><br/><br/>
                    <label>性别：</label><input type="text" name="adm_sex" value="<%=admin.getAdm_sex()%>"/><br/><br/>             
                    <label>电话号码：</label><input type="text" name="adm_tel" value="<%=admin.getAdm_tel()%>"/><br/><br/>
                    <label>密码：</label><input type="password" name="adm_password" value="<%=admin.getAdm_password()%>"/><br/><br/>			 									 		
					<input type="submit" id="button" value="修改">&nbsp;&nbsp;				
				  <%
					}
            %> 
            		</div>
				</form>

	 </div>
  </div>
 </div>
	 <%@ include file="../../../basic/footer.jsp"%> 
</body>
</html>