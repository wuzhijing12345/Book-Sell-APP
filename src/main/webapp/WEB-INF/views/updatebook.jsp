<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019-5-25
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/shopapp/ssmcrud1/updatebook" method="post">
        书籍编号：<input name="bookid"/><br>
        书籍名：<input name="bookname"/><br>
        书籍价格：<input name="bookprice"/><br>
        书籍库存：<input name="bookstock"/><br>
        书籍科目：<input name="bookfrom"/><br>
        书籍简介：<input name="bookintroduction"/><br>
        <input type="submit" id="submit" value="submit"><br>
    </form>
</div>

</body>
</html>
