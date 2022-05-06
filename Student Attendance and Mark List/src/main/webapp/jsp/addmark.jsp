<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Mark</title>
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

        .error {
            color:red;
        }

</style>

</head>
<body>
	<form:form id="markForm" modelAttribute="student" action="markprocess"
		method="post">
            <table align="center">
            <tr>
            <td>RollNo: ${Rollno}</td>
            </tr>
			<tr>
			<td>Name : ${name}</td>
			</tr>
            		<input type="hidden"   path="Rollno" value=${Rollno} name="Rollno" id="Rollno" />
                        <br><br>

            <tr>
				<td><form:label path="mark1">mark1</form:label></td>
				<td><form:input path="mark1" name="mark1" id="mark1"  maxlength="3"/></td>
			</tr>
			<tr>
            <td><form:label path="mark2">mark2</form:label></td>
            <td><form:input path="mark2" name="mark2" id="mark2"  maxlength="3"/></td>
            </tr>
            <tr>
            <td><form:label path="mark3">mark3</form:label></td>
            <td><form:input path="mark3" name="mark3" id="mark3"  maxlength="3"/></td>
            </tr>
            <tr>
            <td><form:label path="mark4">mark4</form:label></td>
            <td><form:input path="mark4" name="mark4" id="mark4"  maxlength="3"/></td>
            </tr>
            <tr>
            <td><form:label path="mark5">mark5</form:label></td>
            <td><form:input path="mark5" name="mark5" id="mark5"  maxlength="3"/></td>
            </tr>


			<tr>
				<td></td>
				<td><form:button id="student" name="student">Submit</form:button></td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>