<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find flights</title>
</head>
<body>

<form action="flights/search" method="post">
	<h2>Search flights</h2>
	<pre>
		From <input type="text" name="from">
		To <input type="text" name="to">
		Departure Date <input type="text" name="date">
		<input type="submit" value="Search">
	</pre>
</form>


</body>
</html>