<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人中心</title>
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

</head>
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
	
	<div>
		<div class="row">
		  <div class="col-3">
		    <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
		      <a class="nav-link active" id="v-pills-home-tab" data-toggle="pill" href="#v-pills-home" role="tab" aria-controls="v-pills-home" aria-selected="true">Home</a>
		      <a class="nav-link" id="v-pills-profile-tab" data-toggle="pill" href="#v-pills-profile" role="tab" aria-controls="v-pills-profile" aria-selected="false">Profile</a>
		      <a class="nav-link" id="v-pills-messages-tab" data-toggle="pill" href="#v-pills-messages" role="tab" aria-controls="v-pills-messages" aria-selected="false">Messages</a>
		      <a class="nav-link" id="v-pills-settings-tab" data-toggle="pill" href="#v-pills-settings" role="tab" aria-controls="v-pills-settings" aria-selected="false">Settings</a>
		    </div>
		  </div>
		  <div class="col-9">
		    <div class="tab-content" id="v-pills-tabContent">
		      <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab">...</div>
		      <div class="tab-pane fade" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab">...</div>
		      <div class="tab-pane fade" id="v-pills-messages" role="tabpanel" aria-labelledby="v-pills-messages-tab">...</div>
		      <div class="tab-pane fade" id="v-pills-settings" role="tabpanel" aria-labelledby="v-pills-settings-tab">...</div>
		    </div>
		  </div>
		</div>
	</div>
	
	
</body>
</html>