<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import= "java.util.List" %>
<%@ page import="com.neon.ordermanagement.entity.OrderEntity" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
html, body {
    height: 100%;
}

html {
    display: table;
    margin: auto;
}

body {
    display: table-cell;
    vertical-align: middle;
}
</style>
<body>
${message}!

<table >
    <thead>
        <tr>
            <td>Id</td>
            <td>Item</td>
            <td>Date</td>
        </tr>   
    </thead>
    <tbody>
        <c:forEach items="${orders}" var="temp">
            <tr>
                <td>${temp.id}</td>
                <td>${temp.itemName}</td>
                <td>${temp.orderDate}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>