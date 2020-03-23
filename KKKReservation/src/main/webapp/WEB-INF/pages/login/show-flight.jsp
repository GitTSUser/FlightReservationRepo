<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Show Flight-</h1>

	<table border="1">
		<tr>
			<th>Operating Airlines</th>
			<th>Departure</th>
			<th>Arrival</th>
			<th>Date</th>
			<th>Select</th>
		</tr>
		<c:forEach items="${flights}" var="f">
			<tr>
				<td>${f.operatingAirlines }</td>
				<td>${f.departureCity}</td>
				<td>${f.arrivalCity}</td>
				<td>${f.dateOfDeparture}</td>
				<td><a href="showReservation?flightId=${f.id}">Select</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>