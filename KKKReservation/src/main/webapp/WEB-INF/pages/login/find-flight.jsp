<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Search Flight</h1>
	<form action="searchFlight" method="post">
		<pre>
	DepartureCity:<input name="departureCity" placeholder="DepartureCity"/>
	ArrivalCity :<input name="arrivalCity" placeholder="ArrivalCity"/>
	Date :<input name="dateOfDeparture" placeholder="DateOfDeparture"/>
	<br>
	<input type="submit" name="s" value="Register" />
	</pre>
	</form>
</body>
</html>