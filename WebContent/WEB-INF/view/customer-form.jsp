<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>

<head>

<style>
.error {
	color: red
}
</style>
<title>Add New Customer</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="customer">
	
	First Name : <form:input path="firstName" />
		<br>
		<br>
	
	Last Name : <form:input path="lastName" />
		
		<form:errors path="lastName" cssClass="error"></form:errors>
		
		<br>
		<br>

		<input type="submit" value="submit">

	</form:form>
</body>

</html>