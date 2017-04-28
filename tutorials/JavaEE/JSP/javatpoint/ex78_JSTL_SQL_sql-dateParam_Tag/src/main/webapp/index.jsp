<%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%--<%@ page pageEncoding="UTF-8" %>--%>
<html>
<head>
    <title>JSTL SQL</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost/test"
                   user="root" password="root"/>

<%
    Date DoB = new Date("2000/10/16");
    int studentId = 3;
%>


<sql:update dataSource="${db}" var="count">
    UPDATE student SET dob = ? WHERE Id = ?
    <sql:dateParam value="<%=DoB%>" type="DATE" />
    <sql:param value="<%=studentId%>" />
</sql:update>


<sql:query dataSource="${db}" var="rs">
    SELECT * FROM student;
</sql:query>

<table border="2" width="100%">
    <tr>
        <th>Student ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>DoB</th>
    </tr>
    <c:forEach var="table" items="${rs.rows}">
        <tr>
            <td><c:out value="${table.id}"/></td>
            <td><c:out value="${table.First_Name}"/></td>
            <td><c:out value="${table.Last_Name}"/></td>
            <td><c:out value="${table.Age}"/></td>
            <td><c:out value="${table.dob}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
