<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

<title>Student Registration Form</title>

</head>

<body>

	<form:form action="processForm" modelAttribute="student">

First Name : <form:input path="firstName" />

		<br>
		<br>

Last Name : <form:input path="lastName" />

		<br>
		<br>
		
Country : <form:select path="country">
			<form:options items="${countries}" />


		</form:select>


		<br>
		<br>
		
		Favorite Langauge :
		
		Java <form:radiobutton path="favLanguage" value="Java"/>
		C <form:radiobutton path="favLanguage" value="C"/>
		C++ <form:radiobutton path="favLanguage" value="C++"/>
		Python <form:radiobutton path="favLanguage" value="Python"/>
		
		
		<br>
		<br>
		
		Preferred Operating Systems :
		
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		
		
		<br>
		<br>

		<input type="submit" value="submit">

	</form:form>


</body>


</html>