<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="org.entity.Customer" %>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户信息</title>

<link rel="stylesheet" href="<%=basePath%>web/com/css/main.css" type="text/css" > 
<link rel="stylesheet" href="<%=basePath%>web/com/css/login.css" type="text/css" > 
</head>
<body>

	<%@ include file="../../../basic/header.jsp"%> 

<div class="content">
<%@ include file="../../../customer/leftmenue/left.jsp" %>
<div class="contentext">
<div align="center">
	<table  id="table">
            <tr>
                <td colspan="6" align="center">用户信息</td>
            </tr>
            <tr align="center">
                <td>身份证号 </td>
                <td>姓名 </td>
                <td>性别</td>
                <td>年龄</td>
                <td>电话号码</td>
                <td>密码</td>
            </tr>
            <%
				List<Customer> list=(List<Customer>)request.getAttribute("list");
           
            System.out.println(list);
            %>
				<%	for(Customer customer:list){
					 %>
            <tr align="center">
                <td><%=customer.getCus_id()%></td>
                <td><%=customer.getCus_name()%></td>
                <td><%=customer.getCus_sex()%></td>
                <td><%=customer.getCus_age()%></td>
                <td><%=customer.getCus_tel()%></td>
                <td><%=customer.getCus_password()%></td>
            </tr>
             <%
					}
            %> 
        </table>
        <br/>
</div>
</div>
</div>
 <%@ include file="../../../basic/footer.jsp"%> 
</body>
</html>