<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>room detail</title>
<style type="text/css">
img{
	margin:50px;
	float:left;

}
.table{
	margin:60px;
}
</style>
</head>
<body>
<!-- 导航栏 -->
	 	<%@ include file="../basic/header.jsp"%> 
<div class="content">
	<!-- 菜单栏 -->
		<%-- <%@ include file="../user/leftmenue/left.jsp" %> --%>
		<div class="contentext">
		<form action="../order/order.jsp">
			<h2>房间详情</h2>
	
			<div class="class2">
				<img src="../com/img/tim.jpg" width="300px" >
			</div>
			<table class="table" cellpadding="10">
				<tr>
					<th>房间类型</th>
					<td><%-- <%=rom.getRom_type()%> --%></td>
				</tr>
				<tr>
					<th>房间设备</th>
					<td>电视、独卫、可淋浴、wifi全覆盖</td>
				</tr>
				<tr>
					<th>价格</th>
					<td></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="预定"></td>
				</tr>
			</table>
		</form>
		</div>
	</div>
	 <%@ include file="../basic/footer.jsp"%> 
</body>
</html>