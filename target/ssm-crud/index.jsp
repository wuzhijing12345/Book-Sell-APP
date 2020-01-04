<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>文件上传下载</title>
</head>
<body>
<form action="/file/upload" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="file" width="120px">
    <input type="submit" value="上传">
</form>

<hr>
<form action="/file/down" method="get">
    <input type="submit" value="下载">
</form>
<jsp:forward page="/ssmcrud1/tologin"></jsp:forward>
</body>
</html>