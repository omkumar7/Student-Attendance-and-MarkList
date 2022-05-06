<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Roll No</title>
<style>
body {
padding-left:500px;
background-color: #DBF9FC;
}

</style>

</head>
<body>

	<form:form id="rollno" modelAttribute="student" action="validrollno"
		method="post">
		<h3>Enter Rollno For Adding Mark</h3>
				<form:label path="Rollno">Rollno:</form:label>
				<form:input path="Rollno" name="Rollno"	id="Rollno" />

				<form:button id="student" name="student">Enter</form:button>
			<a href="home.jsp">Home</a>
	</form:form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>

</body>
</html>