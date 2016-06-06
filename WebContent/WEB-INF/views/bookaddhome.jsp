<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.it.entity.Book"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>


<title>Starter Template for Bootstrap</title>

<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	padding-top: 50px;
}

.starter-template {
	padding: 40px 15px;
	text-align: center;
}
</style>


</head>

<body>

	<%@ include file="nav.jsp"%>


	<form method="post" action="/bookinsert">
		<div class="form-group">


			<label for="exampleInputEmail1">卡号</label> <input type="text"
				class="form-control" placeholder="卡号" name="code">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">书名</label> <input type="text"
				class="form-control" placeholder="书名" name="title">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">作者</label> <input type="text"
				class="form-control" placeholder="作者" name="author">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">出版社</label> <input type="text"
				class="form-control" placeholder="出版社" name="publishing">
		</div>

		<div class="form-group">
			<label for="exampleInputPassword1">总数</label> <input type="text"
				class="form-control" placeholder="总数" name="total">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">剩余数量</label> <input type="text"
				class="form-control" placeholder="剩余数量" name="count">
		</div>
		<button type="submit" class="btn btn-default">添加</button>
	</form>

	<script src="/js/jquery.validate.min.js"></script>


	<script>
		$("ul.nav>li:nth-child(3)").addClass("active");

		$(function() {
			$("#signupForm").validate({
				rules : {
					code : "required",
					title : "required",
					author : "required",
					publishing : "required",
					total : "required",
					count : "required"
				},
				message : {
					code : "请输入卡号",
					title: "请输入书名",
					author: "请输入作者",
						publishing : "请输入出版社",
						total: "请输入总数",
						count: "请输入剩余数量"
				},
				errorElement : "span"

			});

		});
	</script>

</body>
</html>