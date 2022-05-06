<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Attendance</title>
</head>
<body>

    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Student Lists</h2></caption>
            <tr>
                <th>Rollno</th>
                <th>Name</th>
                <th>Department</th>
                <th>Status</th>
            </tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td><c:out value="${student.rollno}" /></td>
                    <td><c:out value="${student.name}" /></td>
                    <td><c:out value="${student.dept}" /></td>
                    <td><c:out value="${student.status}"/></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div style="text-align:center; padding-top:10px"  ><a  href="home.jsp">Home</a></div>
</body>
</html>