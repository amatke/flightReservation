<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Flight reservations</title>
</head>
<body>

<h2>Completing reservation for flight:</h2>

<a href="searchFlights">Search flights</a>
<br>
	<pre>
		AIRLINES  <input readonly type="text" value="${flight.operatingAirlines}" /> 
		DEPARTURE CITY <input readonly type="text" value="${flight.departureCity}" />
		ARRIVAL CITY <input readonly type="text" value="${flight.arrivalCity}" />
		DEPARTURE TIME <input readonly type="text" value="${flight.estimatedDepartureTime}" />
	</pre>



<form action="continueReservation" method="post">
	<pre>
		Card number: <input type="text" />
		Telephone number: <input type="text" />
		<input type="submit" value="Continue" />
	</pre>
</form>


</body>
</html>