<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "s" uri ="/struts-tags" %>
<!DOCTYPE html PUBLIC = "-//W3C//DTD HTML 4.01 transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<s:form action="/tutorials/login">
<s:textfield label ="UserName" key ="username"/>
<s:password label="Password" key ="password"/>
<s:submit/>
</s:form>
</body>
</html>