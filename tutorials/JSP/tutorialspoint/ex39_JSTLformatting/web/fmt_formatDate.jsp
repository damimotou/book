<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  The <fmt:formatDate> tag is used to format dates in a variety of ways
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fmt:formatDate</title>
</head>
<body>
<h3>Number Format:</h3>
<c:set var="now" value="<%=new java.util.Date() %>"/>

<p>
    Formatted Date (1): <fmt:formatDate type="time" value="${now}"/>
</p>

<p>Formatted Date (2): <fmt:formatDate type="date"
                                       value="${now}"/></p>
<p>Formatted Date (3): <fmt:formatDate type="both"
                                       value="${now}"/></p>
<p>Formatted Date (4): <fmt:formatDate type="both"
                                       dateStyle="short" timeStyle="short"
                                       value="${now}"/></p>
<p>Formatted Date (5): <fmt:formatDate type="both"
                                       dateStyle="medium" timeStyle="medium"
                                       value="${now}"/></p>
<p>Formatted Date (6): <fmt:formatDate type="both"
                                       dateStyle="long" timeStyle="long"
                                       value="${now}"/></p>
<p>Formatted Date (7): <fmt:formatDate pattern="yyyy-MM-dd"
                                       value="${now}"/></p>


</body>
</html>

<%--
Formatted Date (1): 8:22:10

Formatted Date (2): 12 лют. 2017

Formatted Date (3): 12 лют. 2017 8:22:10

Formatted Date (4): 12.02.17 8:22

Formatted Date (5): 12 лют. 2017 8:22:10

Formatted Date (6): 12 лютого 2017 8:22:10 EET

Formatted Date (7): 2017-02-12--%>
