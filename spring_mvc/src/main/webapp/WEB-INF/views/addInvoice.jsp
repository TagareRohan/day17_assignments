<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Invoice Entry</title>
<style type="text/css">
.error
{
color:#FF0000;
}
</style>
</head>
<body>

<h1>



<form:form action="invoice" method="post">
<span>
<form:errors path="amount" cssClass="error"/>
</span>


<div>
<form:input path="invoiceNumber"/>
</div>

<div>
<form:select items="${names }" path="customerName"/>
</div>

<div>
<form:input path="amount"/>
</div>

<div>
<input type="submit" value="Add">
</div>


</form:form>

</h1>

</body>
</html>