<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <% --%>
// String name=(String)request.getAttribute("name");
// Integer rollNo=(Integer)request.getAttribute("rollNo");
// LocalDateTime time=(LocalDateTime)request.getAttribute("time");
<%-- %> --%>

<h2>Name is:${name}</h2>
<h2>Rollno is:${rollNo}</h2>
<h2>Time is:${time}</h2>
<c:forEach var="item" items="${nos}">
<h2>${item}</h2>
</c:forEach>
</body>
</html>