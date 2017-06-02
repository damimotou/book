<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %><%--
Refresh Demo
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Refresh Demo</title>
</head>
<body>
<center>
    <h2>Auto Refresh Header Example</h2>
    <%
        // Set refresh, autoload time as 5 seconds
        response.setIntHeader("Refresh", 3);
        // Get current time
        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        if(calendar.get(Calendar.AM_PM) == 0)
            am_pm = "AM";
        else
            am_pm = "PM";
        String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
        out.println("Current Time: " + CT + "\n");
    %>
</center>
</body>
</html>
