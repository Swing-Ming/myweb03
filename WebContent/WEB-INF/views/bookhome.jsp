
<%@ page import="java.util.List"%>
<%@ page import="com.it.entity.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
     

    <title>Starter Template for Bootstrap</title>

     <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<style>
body {
  padding-top: 50px;
}
.starter-template {
  padding: 40px 15px;
  text-align: center;
}</style>
    
 
  </head>

  <body>

    <%@ include file="nav.jsp" %>

 

<a href="/bookadd" style="float: right;" class="btn btn-primary">新增图书</a>

 <form action="/homelogin" method="get" class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input name="wd" type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">搜索</button>
			</form>
<table class="table">

      <caption>借书证管理表格</caption>
      
      
      <thead>
        <tr>
          <th>编号</th>
          <th>卡号</th>
          <th>书名</th>
          <th>作者</th>
          <th>出版社</th>
          <th>总数</th>
          <th>剩余数量</th>
     
          
        </tr>
      </thead>
      <tbody>
      
      <c:forEach var="b" items="${book}">
        <tr>
          <th scope="row">${b.id}</th>
          <td> ${b.code}</td>
          <td> ${b.title}</td>
          <td> ${b.author}</td>
          <td>${b.publishing} </td>
          <td>${b.total} </td>
          <td>${b.count} </td>
          <td>
          <button data="${b.id} " type="button" class="btn btn-danger btn-xs">刪除</button>
          <button data="${b.id} " type="button" class="btn btn-success btn-xs">编辑</button>
          </td>
        </tr>
         </c:forEach>
        
      </tbody>
    </table>
    <script>
    $(function() {
		$("td>button.btn-danger").click(function() {
			if (confirm("确认删除么？")) {
				var i = $(this).attr("data");
				location.href = "/bookdel?id=" + i;
			}
		});

		$("td>button.btn-success").click(function() {
			var i = $(this).attr("data");
			location.href ="/bookedit?id="+i;
		});

		$("ul.nav>li:nth-child(3)").addClass("active");
	});
    
    
    
    
    </script>
    
</body>
</html>