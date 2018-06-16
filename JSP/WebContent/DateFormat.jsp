<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" 
           uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <title></title>
</head>
<body>
<h3>Number Format:</h3>
<c:set var="now" value="<%=new java.util.Date()%>" scope="page" />

<p>Formatted Date (1): <fmt:formatDate type="time" 
            value="${now}" /></p>
<p>Formatted Date (2): <fmt:formatDate type="date" 
            value="${now}" /></p>
<p>Formatted Date (3): <fmt:formatDate type="both" 
            value="${now}" /></p>
<p>Formatted Date (4): <fmt:formatDate type="both" 
            dateStyle="short" timeStyle="short" 
            value="${now}" /></p>
<p>Formatted Date (5): <fmt:formatDate type="both" 
            dateStyle="medium" timeStyle="medium" 
            value="${now}" /></p>
<p>Formatted Date (6): <fmt:formatDate type="both" 
            dateStyle="long" timeStyle="long" 
            value="${now}" /></p>
<p>Formatted Date (7): <fmt:formatDate pattern="yyyy-MM-dd" 
            value="${now}" /></p>
</body>
</html>