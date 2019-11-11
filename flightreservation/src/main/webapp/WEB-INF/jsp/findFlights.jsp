<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find flights</title>
</head>
<body>

<form action="searchFlights">
	<pre>
		From <input type="text" name="departureCity">
		To <input type="text" name="arrivalCity">
		Departure Date <input type="text" name="dateOfDeparture">
		<input type="submit" value="search">
	</pre>
</form>


</body>
</html>