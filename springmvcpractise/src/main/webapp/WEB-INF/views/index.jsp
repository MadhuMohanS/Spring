<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>this is home page</h2>
<h2>which comes from /home url</h2>
<h2>name is:${nm}</h2>
<h2>id is:${id }</h2>
<c:forEach var="item" items="${f}">
<h2>${item}</h2>

<c:forEach var="item" items="${cf}">
<h2>${item.key} ${item.value}</h2>
</c:forEach>

</c:forEach>

</body>
</html>