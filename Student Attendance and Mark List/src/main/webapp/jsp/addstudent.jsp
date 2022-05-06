<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
<style>
.Main_Div{
     display: flex;
     flex-direction: column;
     align-items:center
}
button{
   margin:5px;


}
body {
background-color: #DBF9FC;
}
a{
text-decoration	:none;
}


</style>

</head>
<body>
	<form:form id="regForm" modelAttribute="student" action="registerProcess"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" name="name" id="name" /></td>

			</tr>

			<tr>
				<td><form:label path="phone">Phone</form:label></td>
				<td><form:input path="phone" name="phone" id="phone" minlength="10" maxlength="10"/></td>
			</tr>
            <tr>
				<td><form:label path="dept">Department</form:label></td>
				<td><form:input path="dept" name="dept" id="dept" /></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button id="register" name="register">Submit</form:button></td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>