<%--
Creating a File Upload Form
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form page</title>
</head>
<body>
<h3>File Upload:</h3>
Select a file to upload: <br />
<form action="upload.jsp" method="post" enctype="multipart/form-data">
    <input type="file" name="file" size="50" />
    <br/>
    <input type="submit" value="Upload File" />
</form>
</body>
</html>
