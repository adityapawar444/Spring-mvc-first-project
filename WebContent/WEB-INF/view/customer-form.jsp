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
		
		Age : <form:input path="age" />
		
		<form:errors path="age" cssClass="error"></form:errors>
		
		<br>
		<br>
		
		Postal Code : <form:input path="postalCode" />
		
		<form:errors path="postalCode" cssClass="error"></form:errors>
		
		<br>
		<br>
		
		Coupon Code : <form:input path="couponCode" />
		
		<form:errors path="couponCode" cssClass="error"></form:errors>
		
		<br>
		<br>

		<input type="submit" value="submit">

	</form:form>
</body>

</html>