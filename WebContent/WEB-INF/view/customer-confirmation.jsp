<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
<title>Confirmation Page</title>

</head>

<body>

	<h2><a href="/spring-mvc-first">Spring MVC Demo</a></h2>

	Welcome Mr. ${customer.firstName} ${customer.lastName}
	
	<p>You have entered your age as ${customer.age}</p>
	
	<p>You have entered your postal code as ${customer.postalCode}</p>

	<br>

</body>

</html>