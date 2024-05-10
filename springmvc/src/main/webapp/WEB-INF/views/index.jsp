<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import = "java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
    <h1>This is my home page</h1>
    <h1>Called by home controller</h1>
    <h1>URL /home</h1>

    <%-- Retrieve attributes from the model --%>
    
    <%
        String name = (String) request.getAttribute("name");
        Integer id = (Integer) request.getAttribute("id");
        List<String> friends=(List<String>)request.getAttribute("f");
    %>

    <h2>Name is <%= name %></h2>
    <h2>ID is <%= id %></h2>
    
    <%
    for(String s:friends){
    	out.println(s);
    }
    %>
</body>
</html>
