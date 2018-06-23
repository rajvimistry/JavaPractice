<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Customer</title>
</head>
<body bgcolor="lightblue">
	<c:if test="${requestScope.message!=null }">
		<font color="red" size="3"> <c:out value="${message }" />
		</font>
	</c:if>
	<form action="./CustomerController" method="POST">
		<table border="0" align="center">
			<tr>
				<td>Customer Name:</td>
				<td><input type="text" name="customerName" required="required" /></td>
			</tr>
			<tr>
				<td>Customer City:</td>
				<td><input type="text" name="customerCity" required="required" /></td>
			</tr>
			<tr>
				<td>Customer Email:</td>
				<td><input type="text" name="customerEmail" required="required" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="Submit" value="Submit" /></td>
				<td><input type="reset" name="Reset" value="Reset" /></td>
			</tr>
		</table>
	</form>

</body>
</html>