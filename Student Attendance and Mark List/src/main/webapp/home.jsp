<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
.Main_Div{
     display: flex;
     flex-direction: column;
     align-items:center
}
button{
   margin:5px;
   color: ;

}
body {
background-color: #DBF9FC;
}
a{
text-decoration	:none;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<div class='Main_Div'>
	<div><button><a href="addstudent">Add Student</a></button></div>
     <div><button><a href="attendence">Attendence</a></button>
    <button> <a href="status">Status</a></button></div>
	<div><button><a href="rollno"> Add Mark</a></button></div>
	<button><a href ="marklist">Mark Lists </a></button>
	<button><a href ="gradelist">Mark Lists By Grade </a></button>
	</div>
</body>
</html>