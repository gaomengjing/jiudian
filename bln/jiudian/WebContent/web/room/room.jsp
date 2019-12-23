<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>room</title>
<link rel="stylesheet" href="../com/css/main.css"> 
<link rel="stylesheet" href="../com/css/login.css"> 
</head>
<body>
<!-- 导航栏 -->
	 	<%@ include file="../basic/header.jsp"%> 

	<div class="content">
	<!-- 菜单栏 -->
		<%-- <%@ include file="../user/leftmenue/left.jsp" %> --%>
		<div class="contentext">
			<table>
			<thead>
				<th>房间类型</th>
				<th>房价设备</th>
				<th>价格</th>
			</thead>
				<%-- <%for(int i=0;i<al.size();i++){
				comm rom=(comm)al.get(i);
			 %> --%>
			<tbody>
				<tr>
					<a>
					<td><a href="roomDetail.jsp">双人间</a></td>
					<td>电视、独卫、可淋浴</td>
					<td>128rmb</td>
					</a>
				</tr>
			<%-- <tr>
				<td><a href="#"><%=rom.getRom_type()%></a></td>
				<td>电视、独卫、可淋浴</td>
				<td><%=rom.getRom_prise()%></td>
			</tr>
			
			<%} %> --%>
		</tbody>
				
	</table>
		
		</div>
	</div>
	 <%@ include file="../basic/footer.jsp"%> 
	

</body>
</html>