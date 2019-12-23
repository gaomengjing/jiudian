<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="org.entity.Room"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>update room</title>
</head>
<body>
<%@ include file="../../../basic/header.jsp"%> 

<%			
			List<Room> list=(List<Room>)request.getAttribute("list");
            System.out.println(list);
%>
				<%	for(Room room:list){%>
	<form action="/jiudian/UpdateRoomServlet" medthod="post">
		<table>
			<tr>
				<td>房间编号</td> <td>房间类型</td> <td>房间价格</td> <td>管理员编号</td> <td>房间状态</td>
				
			</tr>
			<tr>
				<td><input type="text" name="rom_id" value="<%=room.getRom_id()%>"></td>
				<td><input type="text" name="rom_type" value="<%=room.getRom_type()%>"></td> 
				<td><input type="text" name="rom_prise" value="<%=room.getRom_prise()%>"></td> 
				<td><input type="text" name="adm_id" value="<%=room.getAdm_id()%>"></td> 
				<td><input type="text" name="rom_status" value="<%=room.getRom_status()%>"></td>
				
			</tr>
			<input type="submit " name="bottom " value="修改">
			
		</table>
		  <%
					}
            %> 
	</form>
</body>
</html>