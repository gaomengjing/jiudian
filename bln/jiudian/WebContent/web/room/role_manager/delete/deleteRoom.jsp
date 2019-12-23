<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>delete Room</title>
</head>
<body>
	<form action="/jiudian/DeleteRoomServlet" method="post">
		<input name="rom_id" type="text">
		<input name="bottom" value="删除" type="submit">
	</form>
</body>
</html>