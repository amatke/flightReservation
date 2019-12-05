<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
<title>Register User</title>
</head>
<body>

<div class="container">
	<h2>Register User</h2>
	<hr>
	<form action="registration" method="post" class="form-horizontal">
		<div class="row form-group"> 
			<label class="col-sm-2">First Name:</label>  
			<input type="text" name="firstName" class="col-sm-6" />
		</div>
		<div class="row form-group">
			<label class="col-sm-2 ">Last Name:</label> 
			<input type="text" name="lastName" class="col-sm-6" />
		</div>
		<div class="row form-group">
			<label class="col-sm-2">Email:</label>
			<input type="email" name="email" class="col-sm-6" />
		</div>
		<div class="row form-group">
			<label class="col-sm-2">Password:</label>
			<input type="password" name="password" class="col-sm-6" />
		</div>
		<div class="row form-group">
			<label class="col-sm-2">Confirm Password:</label>
			<input type="password" name="confirmPassword" class="col-sm-6" />
		</div>
		<div class="">
		<input type="submit" value="register" class="btn btn-primary"/>
		</div>
	${msg}
	</form>
</div>

</body>
</html>
