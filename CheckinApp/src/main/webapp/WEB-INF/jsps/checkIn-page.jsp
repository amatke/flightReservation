<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight checkin page</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


</head>
<body>

	<div class="container">
	
		<h1>Welcome to Flight checkin page</h1>
		<small class="text-success">Reservation number: ${reservation.id} </small>
	<hr>

	
		<h3>Flight details</h3>
		Flight number:		${reservation.flight.flightNumber} <br>
		Departure City:		${reservation.flight.departureCity}<br>
		Arrival City:		${reservation.flight.arrivalCity}
				
		<h3>Passenger details</h3>
		First name: 	${reservation.passenger.firstName} <br>
		Last name: 		${reservation.passenger.lastName} <br>
		Email: 			${reservation.passenger.email} <br>
		Phone: 			${reservation.passenger.phone} <br>
		

	
	<form action="checkIn" method="POST">
		<h3>Enter the number of bags</h3>
		<input type="number" name="numOfBags" required />
		<input type="submit" value="Confirm" />
		
		<input type="hidden" name="reservationId" value="${reservation.id}" />
	</form>
	
	
	</div>

</body>
</html>