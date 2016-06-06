
<%@ page import="java.util.List"%>
<%@ page import="com.it.entity.Card"%>
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

 

<a href="/cardadd" style="float: right;" class="btn btn-primary">新建借书卡</a>
 
<table class="table">

      <caption>借书证管理表格</caption>
      
      
      <thead>
        <tr>
          <th>编号</th>
          <th>卡号</th>
          <th>姓名</th>
          <th>电话</th>
          <th>操作</th>
          
        </tr>
      </thead>
      <tbody>
      
       <c:forEach var="cd" items="${list}" > 
        <tr>
          <th scope="row">${cd.id}</th>
          <td>${cd.code}</td>
          <td>${cd.name} </td>
          <td>${cd.tel}</td>
          <td>
          <button data="${cd.id}" type="button" class="btn btn-danger btn-xs">刪除</button>
          <button data="${cd.id}" type="button" class="btn btn-success btn-xs">编辑</button>
          </td>
        </tr>
         
      </c:forEach>>
        
      </tbody>
    </table>
    <script>
    $(function() {
		$("td>button.btn-danger").click(function() {
			if (confirm("确认删除么？")) {
				var i = $(this).attr("data");
				location.href = "/carddel?id=" + i;
			}
		});

		$("td>button.btn-success").click(function() {
			var i = $(this).attr("data");
			location.href = "/cardedit?id="+i;
		});

		$("ul.nav>li:nth-child(2)").addClass("active");
	});
    
    
    
    
    </script>
    
</body>
</html>