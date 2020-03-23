<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight-Reservation</title>
</head>
<body>
	<h1>Welcome to Flight-Reservation</h1>

	<div>
		<p>
			<b>Airlines:</b> ${f.operatingAirlines}
		</p>
		<p>
			<b>DepartureCity:</b> ${f.departureCity}
		</p>
		<p>
			<b>ArrivalCity:</b> ${f.arrivalCity}
		</p>
		<p>
			<b>DepartureDate:</b> ${f.dateOfDeparture}
		</p>

	</div>

	<form action="completeReservation" method="post">

		<h1>Passenger Details:</h1>

		<table>
			<tr>
				<th>FirstName:</th>
				<td><input name="passengerFirstName" placeholder="FirstName" /></td>
			</tr>
			<tr>
				<th>LastName:</th>
				<td><input name="passengerLastName" placeholder="LastName" /></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><input name="passengerEmail" placeholder="Email" /></td>
			</tr>
			<tr>
				<th>Phone:</th>
				<td><input name="passengerPhone" placeholder="Phone" /></td>
			</tr>
		</table>

		<h1>Card Details:</h1>

		<table>
			<tr>
				<th>Name on the card:</th>
				<td><input name="nameOnTheCard" /></td>
			</tr>
			<tr>
				<th>Card No.:</th>
				<td><input name="cardNumber" /></td>
			</tr>
			<tr>
				<th>Expiry Date:</th>
				<td><input name="expirationDate" /></td>
			</tr>
			<tr>
				<th>3-Digit sec code:</th>
				<td><input name="phone" /></td>
			</tr>
			<tr>
				<td><input type="hidden" name="flightId" value="${f.id}" /> <input
					type="submit" value="Confirm" /></td>
			</tr>
		</table>
	</form>
</body>
</html>