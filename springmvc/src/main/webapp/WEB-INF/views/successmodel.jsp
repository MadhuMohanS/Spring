<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2 class="text-center">${Header}</h2>
  <p class="text-center">${Desc }</p>
<h2>Email is:${user.email}</h2>
<h2>User Name:${user.userName}</h2>
<h2>Password:${user.password }</h2>
</body>
</html>