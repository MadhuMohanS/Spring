<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is about page</h1>
<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");
Map<String,Integer> map=(Map<String,Integer>)request.getAttribute("cf");
%>
<h2>Name is:<%=name%></h2>
<h2>id is:<%=id%></h2>
<h2>map is:<%=map%></h2>
<h2>address is:${address}</h2>
<h2>mobile is:${mob}</h2>
<h2>email is:${mail}</h2>

<c:forEach var="item" items="${f}">
<h2>${item}</h2>

</c:forEach>
</body>
</html>