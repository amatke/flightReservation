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

<title>Complete Flight reservations</title>
</head>
<body>

	<div class="container">
		<div class="form-group">
			<a href="searchFlights" class="btn btn-default">Search flights</a>
		</div>
	</div>

<div class="container">
<h2>Completing reservation for flight:</h2>
<hr>

	<div> <h3>Flight Details</h3> </div>
	<div class="row">
		<label class="col-sm-2">AIRLINES:</label>
		<label class="col-sm-6">${flight.operatingAirlines}</label>
	</div>
	

	<div class="row">
			<label class="col-sm-2">DEPARTURE CITY:</label>
			<label class="col-sm-6">${flight.departureCity}</label>
	</div>		
	<div class="row">
			<label class="col-sm-2">ARRIVAL CITY:</label>
			<label class="col-sm-6">${flight.arrivalCity}</label>
	</div>
	<div class="row">
			<label class="col-sm-2">DEPARTURE TIME:</label>
			<label class="col-sm-6">${flight.estimatedDepartureTime}</label>
	</div>		
				


	<form action="continueReservation" method="post">
		
			<div><h3>Passenger Details</h3></div>
			<div class="form-group row"><label class="col-sm-2">First Name:</label> <input type="text" name="passengerFisrtName" class="col-sm-6" /></div>
			<div class="form-group row"><label class="col-sm-2">Last Name:</label> <input type="text" name="passengerLastName" class="col-sm-6" /></div>
			<div class="form-group row"><label class="col-sm-2">Email:</label> <input type="text" name="passengerEmail" class="col-sm-6" /></div>
			<div class="form-group row"><label class="col-sm-2">Phone:</label>  <input type="text" name="passengerPhone" class="col-sm-6"/></div>
			
			<div><h3>Card Details</h3></div>
			<div class="form-group row"> <label class="col-sm-2">Name on the card:</label>  <input type="text" name="nameOnTheCard" class="col-sm-6" /></div>
			<div class="form-group row"> <label class="col-sm-2">Card number:</label>  <input type="text" name="cardNumber" class="col-sm-6" /></div>
			<div class="form-group row"> <label class="col-sm-2">Expiry Date:</label>  <input type="text" name="expirationDate" class="col-sm-6" /></div>
			<div class="form-group row"> <label class="col-sm-2">3-digit Code:</label> <input type="text" name="securityCode" class="col-sm-6"/></div>
			
			<div class="form-group row"><input type="hidden" value="${flight.id}" name="flightId" /></div>
			<div class="form-group row"><input type="submit" value="Continue" class="btn btn-default" /></div>
	</form>
	</div>


</body>
</html>

