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
		<h3>Flight Details</h3>
		AIRLINES:  ${flight.operatingAirlines}
		DEPARTURE CITY: ${flight.departureCity}
		ARRIVAL CITY: ${flight.arrivalCity}
		DEPARTURE TIME: ${flight.estimatedDepartureTime}
	</pre>



<form action="continueReservation" method="post">
	<pre>
		<h3>Passenger Details</h3>
		First Name: <input type="text" name="passengerFisrtName" />
		Last Name: <input type="text" name="passengerLastName" />
		Email: <input type="text" name="passengerEmail" />
		Phone:  <input type="text" name="passengerPhone" />
		
		<h3>Card Details</h3>
		Name on the card: <input type="text" name="nameOnTheCard" />
		Card number: <input type="text" name="cardNumber" />
		Expiry Date: <input type="text" name="expirationDate" />
		3-digit Code: <input type="text" name="securityCode" />
		
		<input type="hidden" value="${flight.id}" name="flightId" />
		<input type="submit" value="Continue" />
	</pre>
</form>


</body>
</html>