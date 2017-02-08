<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录界面</title>
</head>
<body>
	<form method="post" action="/Login/user/login">
		<input type="text" id="username" name="username"/><br/>
		<input type="text" id="password" name="password"/><br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>