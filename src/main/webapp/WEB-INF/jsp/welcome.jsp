<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
${message}

<form:form action="loginProcess" method="post" modelAttribute="user">  
	User name:<form:input type="text" path="userName"/><br/><br/>  
	Password:<form:input type="password" path="password"/><br/><br/>  
<input type="submit" value="login"/>
</form:form>

<%
String error = (String)request.getAttribute("error");
if(error!=null && error!=""){%>
	${error}!
<%
}
%>


</body>
</html>