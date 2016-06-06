<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


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
    
     
<form method="post" action="/cardmodify">
  <div class="form-group">
  
   <input type="hidden"    value="${card.id}" name="id"/>
    <label for="exampleInputEmail1">卡号</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="卡号" value="${card.code}" name="code">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">姓名</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="姓名" value="${card.name}" name="name">
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">电话</label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="电话"value="${card.tel }" name="tel">
  </div>
  <button type="submit" class="btn btn-default">添加</button>
</form>

<script src="/js/jquery.validate.min.js"></script>


<script>
	 
	$("ul.nav>li:nth-child(2)").addClass("active");
	
	$(function(){
	$("#signupForm").validate({
		rules : {
			code:"required",
			name:"required",
			tel:"required"
		},
		message : {
			code : "请输入卡号",
			name : "请输入姓名",
			tel : "请输入电话"
		},
		errorElement :"span"
	
	});
	
	});
	
	
	
	
	</script>

</body>
</html>