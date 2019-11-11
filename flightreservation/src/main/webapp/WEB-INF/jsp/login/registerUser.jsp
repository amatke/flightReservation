<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>

<h2>Register</h2>



<form action="registration" method="post">
	<pre>
		First Name: <input type="text" name="firstName" />
		Last Name: <input type="text" name="lastName" />
		Email: <input type="email" name="email" />
		Password: <input type="password" name="password" />
		Confirm Password: <input type="password" name="confirmPassword" />
		<input type="submit" value="register" />
		${msg}
	</pre>
</form>

</body>
</html>