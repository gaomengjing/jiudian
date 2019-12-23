<%@page import="org.util.Page"%>
<%@page import="org.entity.Admin"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.List" %>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>管理员信息</title>

<link rel="stylesheet" href="<%=basePath%>web/com/css/main.css" type="text/css" > 
<%-- <link rel="stylesheet" href="<%=basePath%>web/com/css/login.css" type="text/css" >  --%>
</head>
<body>

	<%@ include file="../../../basic/header.jsp"%> 

<div class="content">
<%@ include file="../../../customer/leftmenue/left.jsp" %>
<div class="contentext">
 <div align="center" > <!-- class="t1" -->
	<table  id="table">
            <tr>
                <td colspan="7" align="center">用户信息</td>
            </tr>
            <tr align="center">
                <td>编号 </td>
                <td>姓名 </td>
                <td>性别</td>
                <td>电话号码</td>
                <td>密码</td>
            </tr>
             <%
				/* List<Admin> list=(List<Admin>)request.getAttribute("list"); */
            Page p=(Page)request.getAttribute("p");
				
            //System.out.println(list);
            %>
				<%	for(Admin admin:p.getAdmins()){
					 %> 
            <tr align="center">
                <td><%=admin.getAdm_id()%></td>
                <td><%=admin.getAdm_name()%></td>
                <td><%=admin.getAdm_sex()%></td>
                <td><%=admin.getAdm_tel()%></td>
                <td><%=admin.getAdm_password()%> </td>                       
            </tr>
              <%
					}
            %>  
        </table>
          <% if(p.getCurrentPage()==p.getTotalPage()){%>
    	    <a href="queryadminByPageServlet?currentPage=1">首页</a>
    	    <a href="queryadminByPageServlet?currentPage=<%=p.getCurrentPage()-1%>">上一页</a>
      <% } 
      else if(p.getCurrentPage()==1){%>
           <a href="queryadminByPageServlet?currentPage=<%=p.getCurrentPage()+1%>">下一页</a>
    	   <a href="queryadminByPageServlet?currentPage=<%=p.getCurrentPage()%>">尾页</a>
       <%} 
      else{%>
    	   <a href="queryadminByPageServlet?currentPage=1">首页</a>
    	   <a href="queryadminByPageServlet?currentPage=<%=p.getCurrentPage()-1%>">上一页</a>
           <a href="queryadminByPageServlet?currentPage=<%=p.getCurrentPage()+1%>">下一页</a>
           <a href="queryadminByPageServlet?currentPage=<%=p.getCurrentPage()%>">尾页</a>
    	   <%}%>
        <br/>
	 </div>
</div>
</div>
 <%@ include file="../../../basic/footer.jsp"%> 
</body>
</html>