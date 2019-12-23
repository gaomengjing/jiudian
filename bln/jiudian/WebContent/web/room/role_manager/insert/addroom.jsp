<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>addRoom</title>
</head>
<body>
	<form action="/jiudian/AddRoomServlet" method="post" >
		<table>
			<tr>
				<td>房间编号</td>
				<td><input name="rom_id" type="text"></td>
			</tr>
			<tr>
				<td>房间类型</td>
				<td><input name="rom_type" type="text"></td>
			</tr>
			<tr>
				<td>房间价格</td>
				<td><input name="rom_prise" type="text"></td>
			</tr>
			
			<tr>
				<td>管理员编号</td>
				<td><input name="adm_id" type="text"></td>
			</tr>
			<tr>
				<td>房间状态</td>
				<td><input name="rom_status" type="text"></td>
			</tr>
			<input name="bottom" type="submit" value="添加">
		</table>
	</form>
</body>
</html>
		