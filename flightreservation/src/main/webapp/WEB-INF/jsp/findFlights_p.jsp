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
  
<title>Find flights</title>
</head>
<body>

<div class="container">

	<h4>Hello dear ${user.firstName} ${user.lastName} </h4>
	
	<form action="searchFlights" method="post" class="form">
		<h2>Search flights</h2>
		<hr>
			
			<div class="row">
				<label class="col-sm-4 form-group">From</label>	
				<select name="from" class="col-sm">
		    		<c:forEach items="${flights}" var="f">
		       			 <option value="${f.departureCity}">${f.departureCity}</option>
		    		</c:forEach>
				</select>
			</div>

			<div class="row">
				<label class="col-sm-4 form-group">To</label>
				<select name="to" class="col-sm">
		    		<c:forEach items="${flights}" var="f">
		       			 <option >${f.arrivalCity}</option>
		    		</c:forEach>
				</select>
			</div>

			<div class="row">
				<label class="col-sm-4 form-group">Departure Date</label>
				 
				<select name="date" class="col-sm">
		    		<c:forEach items="${flights}" var="f">
		       			 <option value="${f.dateOfDeparture}" >${f.dateOfDeparture}</option>
		    		</c:forEach>
				</select>
			</div>

			
			<input type="submit" value="Search" class="btn btn-default">
		
	</form>
</div>




</body>
</html>