<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="${pageContext.request.contextPath}/resource/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/js/bootstrap.min.js"></script>

<title>登录页面</title>
<style type="text/css">
#header {
	background-color: #222;
}

#header ul li a {
	font-size: 14px;
	color: #fff;
}

#header ul li a:hover {
	color: #999;
}
</style>

</head>

<body>

	<div class="header" id="header">
		<div class="row" style="margin: 0 0 0 12px">
			<ul class="nav col-6">
				<li class="nav-item"><a class="nav-link active" href="#">首页</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">个人中心</a></li>
				<li class="nav-item"><a class="nav-link" href="/login">登录</a></li>
				<li class="nav-item"><a class="nav-link" href="#">退出</a></li>
			</ul>
			<ul class="nav justify-content-end col-6">
				<li class="nav-item"><a class="nav-link active" href="#">用户名</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">反馈</a></li>
				<li class="nav-item"><a class="nav-link" href="#">投诉侵权</a></li>
				<li class="nav-item"><a class="nav-link" href="#">头条产品</a></li>
			</ul>
		</div>
	</div>

	<div class="container-fluid rol-4" style="margin-top: 40px">
		<div class="row offset-4">
			<form action="/center">
				<div class="form-group">
					<label for="exampleInputEmail1">用户名</label> <input
						type="text" class="form-control" placeholder="请输入用户名" id="exampleInputEmail1"
						aria-describedby="emailHelp"> 
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">密码</label> <input
						type="password" placeholder="请输入密码" class="form-control" id="exampleInputPassword1">
				</div>
				<div class="form-group form-check">
					<input type="checkbox" class="form-check-input" id="exampleCheck1">
					<label class="form-check-label" for="exampleCheck1">Check
						me out</label>
						<small id="emailHelp"
						class="form-text text-muted">We'll never share your email
						with anyone else.</small>
				</div>
					<button type="submit" class="btn btn-primary rol-6">Submit</button>
					<span class="rol-6" style="margin-left: 30px">没有账号，去<a href="/register">注册</a></span>
			</form>
		</div>
	</div>


</body>
</html>