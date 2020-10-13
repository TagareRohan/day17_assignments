<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<style type="text/css">
.error
{
color:#FF0000;
}
</style>

</head>
<body>

<form:form action="register" method="post">

<div>
<form:input path="firstName"/>
</div>
<span>
<form:errors path="firstName" cssClass="error"/>
</span>

<div>
<form:input path="lastName"/>
</div>
<span>
<form:errors path="lastName" cssClass="error"/>
</span>

<div>
<form:input path="age"/>
</div>
<span>
<form:errors path="age" cssClass="error"/>
</span>

<div>
<form:input path="userName"/>
</div>
<span>
<form:errors path="userName" cssClass="error"/>
</span>

<div>
<form:password path="password"/>
</div>
<span>
<form:errors path="password" cssClass="error"/>
</span>

<div>
<input type="submit" value="Register">
</div>



</form:form>

</body>
</html>