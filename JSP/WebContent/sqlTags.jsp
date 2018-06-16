<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<title>JSTL sql:query Tag</title>
</head>
<body>
<sql:setDataSource var="myDataSource" driver="oracle.jdbc.driver.OracleDriver"
     url="jdbc:oracle:thin:@localhost:1521:xe"
     user="System"  password="123"/>

<sql:query dataSource="${myDataSource}" var="result">
SELECT * from Employee
</sql:query>
 
<table border="1" width="100%">
<tr>
<th>Employee Number</th>
<th>Employee Name</th>
<th>Employee Dept Number</th>
</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
<td><c:out value="${row.eno}"/></td>
<td><c:out value="${row.ename}"/></td>
<td><c:out value="${row.dept}"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>