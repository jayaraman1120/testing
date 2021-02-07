<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "s" uri ="/struts-tags" %>
<!DOCTYPE html PUBLIC = "-//W3C//DTD HTML 4.01 transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Form</title>
</head>
<body>
<s:form action="getTutorial">
<s:textfield key ="language">
<s:submit/>
</s:textfield>
</s:form>
</body>
</html>