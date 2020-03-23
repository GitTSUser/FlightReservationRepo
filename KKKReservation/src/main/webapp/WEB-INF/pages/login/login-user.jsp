<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>User Login</h1>

	<p>${msg }</p>
	<form action="loginUser" method="post">
		<pre>
	Email	 :<input name="email" required="required" placeholder="Email Id" />
	Password :<input type="password" name="password" required="required"
				placeholder="Password" />
	<br>
	<input type="submit" name="s" value="Login" />
	</pre>
	</form>
</body>
</html>