<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights</title>
</head>
<body>

<h2>List of flights</h2>

<a href="searchFlights">Search flights</a>
<br>

<table border="1">
	<tr>
		<th>AIRLINES</th>
		<th>DEPARTURE CITY</th>
		<th>ARRIVAL CITY</th>
		<th>DEPARTURE TIME</th>
	</tr>
	
	<c:forEach items="${flights}" var="f" >
	<tr>
		<td>${f.operatingAirlines}</td>
		<td>${f.departureCity}</td>
		<td>${f.arrivalCity}</td>
		<td>${f.estimatedDepartureTime}</td>
		<td><a href="completeReservation?flightId=${f.id}">Select</a></td>
	</tr>
	</c:forEach>
</table>


</body>
</html>