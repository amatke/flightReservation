<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find flights</title>
</head>
<body>

<form action="search" method="post">
	<h2>Search flights</h2>
	<pre>
		From <input type="text" name="from">
		To <input type="text" name="to">
		Departure Date <input type="text" name="date" placeholder="yyyy-MM-dd" pattern="[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])">
		<input type="submit" value="Search">
	</pre>
</form>


</body>
</html>