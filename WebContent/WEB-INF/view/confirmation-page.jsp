<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
<title>Confirmation Page</title>

</head>

<body>

	Welcome Mr. ${student.firstName} ${student.lastName}

	<br>
	<br> You have selected ${student.country} as your country.

	<br>
	<br> Your favorite programming language is ${student.favLanguage}

	<br>
	<br> Your preferred Operating systems are :

	<ul>

		<c:forEach var="temp" items="${student.operatingSystems}">

			<li>${temp}</li>

		</c:forEach>
	</ul>

</body>

</html>