<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>东华购书书籍管理</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .header ul{
            list-style-type: none;
            margin:0px;
            padding:0px;
        }
        .header li {
            float:left;
            margin: 10px;
        }
    </style>
</head>
<body>
<div class="header">
    <ul>
        <li><a href="/shopapp/ssmcrud1/logout?id=${requestScope.get("id")}">退出登录</a></li>
        <li><a href="/shopapp/ssmcrud1/toManshop">管理订单</a></li>
    </ul>
</div>
<div class="row clearfix">
    <div class="col-md-12 column">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>书籍图片</th>
                <th>书籍编号</th>
                <th>书籍名称</th>
                <th>书籍价格</th>
                <th>书籍库存</th>
                <th>书籍学科</th>
                <th>书籍简介</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${requestScope.list3.list}" varStatus="status">
                <tr>
                    <td>
                        <img id="images" alt="" src="../../upload/${book.bookimage}">
                    </td>
                    <td>${book.bookid}</td>
                    <td>${book.bookname}</td>
                    <td>${book.bookprice}</td>
                    <td>${book.bookstock}</td>
                    <td>${book.bookfrom}</td>
                    <td>${book.bookintroduction}</td>
                    <td>
                        <a href="/shopapp/ssmcrud1/toUpdatebook?id=${book.bookid}">更改</a> |
                        <a href="/shopapp/ssmcrud1/delbook/${book.bookid}">删除</a> |
                        <form action="/shopapp/ssmcrud1/updatebookimage/${book.bookid}" method="post" enctype="multipart/form-data">
                            选择文件:<input type="file" name="file" width="120px">
                            <input type="submit" value="上传">
                        </form>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div class="row">
            <div class="col-md-4 column">
                <a href="/shopapp/ssmcrud1/toAddbook" class="btn btn-primary">新增书籍</a>
            </div>
        </div>
        <table class="col-md-12">
            <tr>
                <td class="td2">
                       <span>第${requestScope.list3.currPage}/ ${requestScope.list3.totalPage}页</span> 
                       <span>总记录数：${requestScope.list3.totalCount } 每页显示:${requestScope.list3.pageSize}</span> 
                       <span>
                        <c:if test="${requestScope.list3.currPage != 0}">
                            <a href="/shopapp/ssmcrud1/toManbook?currentPage=1">[首页]</a> 
                            <a href="/shopapp/ssmcrud1/toManbook?currentPage=${requestScope.list3.currPage-1}">[上一页]</a> 
                        </c:if>
                    </span>
                    <span>
                    <c:if test="${requestScope.pagemsg.currPage != requestScope.list3.totalPage}">
                            <a href="/shopapp/ssmcrud1/toManbook?currentPage=${requestScope.list3.currPage+1}">[下一页]</a>  
                           <a href="/shopapp/ssmcrud1/toManbook?currentPage=${requestScope.list3.totalPage}">[尾页]</a>  
                        </c:if>
                    </span>
                </td>
                <td>
                    <span>
                        <form action="/shopapp/ssmcrud1/toManbook?currentPage=${currentPage}">
                            跳到
                            <input name="currentPage" type="text"/>
                            页
                            <input type="submit" value="跳转" class="btn btn-primary"/>
                        </form>
                    </span>
                </td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>