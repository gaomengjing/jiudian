<%@page import="java.util.List"%>
<%@page import="org.entity.Customer"%>
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
<%-- <link rel="stylesheet" href="<%=basePath%>web/com/css/register.css" type="text/css" >  --%>


</head>
<body>
	<%@ include file="../../../basic/header.jsp"%> 

	<div class="content">
		<%@ include file="../../../customer/leftmenue/left.jsp" %>
		<div class="contentext">
			<div class="user" align="center">
				<form action="/jiudianxitong/updateCustomerServlet" method="post" >
				   <div class="register">
                     <h2>用户修改</h2><br/>
                     <%
				         List<Customer> list=(List<Customer>)request.getAttribute("list");
          				  %>
						<%	for(Customer customer:list){
					 %>
                    <label>身份证号：</label><input type="text" name="cus_id" value="<%=customer.getCus_id()%>"/><br/><br/>
                    <label>姓名：</label><input type="text" name="cus_name" value="<%=customer.getCus_name()%>"/><br/><br/>
                    <label>性别：</label><input type="text" name="cus_sex" value="<%=customer.getCus_sex()%>"/><br/><br/>
                    <label>年龄：</label><input type="text" name="cus_age" value="<%=customer.getCus_age()%>"/><br/><br/>
                    <label>电话号码：</label><input type="text" name="cus_tel" value="<%=customer.getCus_tel()%>"/><br/><br/>
                    <label>密码：</label><input type="password" name="cus_password" value="<%=customer.getCus_password()%>"/><br/><br/>			 		
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