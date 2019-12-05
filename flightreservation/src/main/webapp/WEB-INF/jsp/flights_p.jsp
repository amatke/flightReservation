<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
    
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
<title>Flights</title>
</head>
<body>

	<div class="container">
		<div class="form-group">
			<a href="searchFlights" class="btn btn-default">Search flights</a>
		</div>
	</div>


<div class="container">
	<h2>List of flights</h2>
	<hr>
	
	<table border="1" class="table table-hover" >
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
			<td><a href="completeReservation?flightId=${f.id}" class="btn btn-success">Select</a></td>
		</tr>
		</c:forEach>
	</table>
</div>



</body>
</html>