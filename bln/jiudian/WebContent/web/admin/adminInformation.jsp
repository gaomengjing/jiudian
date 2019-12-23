<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户信息</title>
<link rel="stylesheet" href="../com/css/main.css"> 
<link rel="stylesheet" href="../com/css/login.css"> 
</head>
<body>

	<%@ include file="../basic/header.jsp"%> 

<div class="content">
<%@ include file="../customer/leftmenue/left.jsp" %>
<div class="contentext">
<div align="center">
	<table border=1>
            <tr>
                <td colspan="7" align="center">管理员信息</td>
            </tr>
            <tr align="center">
                <td>编号 </td>
                <td>姓名 </td>
                <td>性别 </td>                
                <td>密码</td>
                <td>电话号码</td>
               <!--  <td>操作</td> -->
            </tr>
            <tr align="center">
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
               <!--   <td><a href="">删除</a>&nbsp;&nbsp;&nbsp;
                    <a href="">修改</a>
                </td> -->
              <%--   <td><a href="/m_basi/BasicTowerDel?DorNo=<%=tower.getDorNo()%>">删除</a>
                    <a href="/m_basi/BasicTowerUpdate?DorNo=<%=tower.getDorNo()%>">编辑</a>
                </td> --%>
            </tr>
        </table>
        <br/>
        <a href="../basic/main.jsp">返回</a>
</div>
</div>
</div>
 <%@ include file="../basic/footer.jsp"%> 
</body>
</html>