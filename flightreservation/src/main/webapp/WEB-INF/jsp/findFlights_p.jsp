<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find flights</title>
</head>
<body>

<h4>Hello dear ${user.firstName} ${user.lastName} </h4>

<form action="searchFlights" method="post">
	<h2>Search flights</h2>
	<pre>
		From
		<select name="from">
    		<c:forEach items="${flights}" var="f">
       			 <option value="${f.departureCity}">${f.departureCity}</option>
    		</c:forEach>
		</select>
		
		To 
		<select name="to">
    		<c:forEach items="${flights}" var="f">
       			 <option >${f.arrivalCity}</option>
    		</c:forEach>
		</select>
		
		Departure Date 
		<select name="date">
    		<c:forEach items="${flights}" var="f">
       			 <option value="${f.dateOfDeparture}" >${f.dateOfDeparture}</option>
    		</c:forEach>
		</select>
		
		<input type="submit" value="Search">
	</pre>
</form>



</body>
</html>