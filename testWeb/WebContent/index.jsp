<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="jquery2.0/jquery-2.0.0.js"></script>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">


<title>会员注册</title>
</head>
<body>

	<form id="my-form" method="post">
	<h1>注册</h1>
		<div class="form-group">
			<label for="username">用户名</label> 
			<input type="text" name="username" id="username" class="form-control">
			<label for="username" class="err"></label> 
			
		</div>
		<div class="form-group">
			<label for="email">邮箱</label> 
			<input type="text" name="email" id="email" class="form-control"> 
			<label for="email" class="err"></label> 
			
		</div>
		<div class="form-group">
			<label for="password">密码</label> 
			<input type="password" name="password" id="password" class="form-control"> 
			<label for="password" class="err"></label> 
		</div>

		<div class="form-group">
			<label for="password2">确认密码</label> 
			<input type="password" name="password2" id="password2" class="form-control">
			<label for="password2" class="err"></label> 
		</div>

		<div class="form-group">
			<label for="captchar">验证码</label> 
			<img id="capcharImg" src="image.jsp" codesrc="image.jsp">
			
			<input type="text" name="captchar" id="captchar" class="form-control">
			<img id="validationOKImg" src="pic/sign-check-icon.png">
			<img id="validationErrImg" src="pic/sign-error-icon.png">
			
			<label for="captchar" class="err"></label> 
		</div>
		<div class="form-group">
			<input type="checkbox" name="terms" id="terms">
			<label for="terms">我已阅读并同意**条款</label>
			<label for="terms" class="err"></label>
		</div>
		<button id="submitBtn">提交</button>
	</form>
<script src="js/main.js"></script>
</body>
</html>