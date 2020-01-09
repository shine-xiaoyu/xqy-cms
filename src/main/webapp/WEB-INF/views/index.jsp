<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="${pageContext.request.contextPath}/resource/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/resource/css/index.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/js/bootstrap.min.js"></script>
<title>首页</title>
</head>

<style>


#body .col-1 ul li a:hover{
	background-color: #ed4040;
}


/* #body .col-1 ul li .active{
	background-color: #ed4040;
} */
#body .col-1 ul li a{
	color:#000;
	border-radius: 6px;
}

</style>

<body>

	<div class="header" id="header">
		<div class="row" style="margin: 0 0 0 12px">
			<ul class="nav col-6">
				<li class="nav-item"><a class="nav-link active" href="/">首页</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/center">个人中心</a></li>
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

	<div class="container-fluid">
		<div  class="row offset-1" id="body">
			<div class="col-1">
				<ul class="nav flex-column ">
				  <li class="nav-item">
				    <a class="nav-link active" href="#">Active</a>
				  </li>
				  <li class="nav-item">
				    <a class="nav-link" href="#">Link</a>
				  </li>
				  <li class="nav-item">
				    <a class="nav-link" href="#">Link</a>
				  </li>
				  <li class="nav-item">
				    <a class="nav-link" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
				  </li>
				</ul>
			</div>
			
			<div class="col-6">
				<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
				  <ol class="carousel-indicators">
				    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
				    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
				    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				  </ol>
				  <div class="carousel-inner">
				    <div class="carousel-item active">
				      <img src="/resource/img/1.jpg" height="300px" class="d-block w-100" alt="...">
				    </div>
				    <div class="carousel-item">
				      <img src="/resource/img/2.jpg" height="300px" class="d-block w-100" alt="...">
				    </div>
				    <div class="carousel-item">
				      <img src="/resource/img/4.jpg" height="300px" class="d-block w-100" alt="...">
				    </div>
				  </div>
				  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
				    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
				    <span class="sr-only">Previous</span>
				  </a>
				  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
				    <span class="carousel-control-next-icon" aria-hidden="true"></span>
				    <span class="sr-only">Next</span>
				  </a>
				</div>
			</div>
			
			
			<div class="col-3" style="background-color: #111;">
				
			</div>
			
		</div>
	</div>

</body>
</html>