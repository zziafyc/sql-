<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML>
<html>
<head>


<title>My JSP 'index.jsp' starting page</title>
<link href="css/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/userpanel.css">
<link rel="stylesheet" type="text/css" href="css/jquery.ui.all.css">
</head>

<body class="login" mycollectionplug="bind">
<form action="adminIndex.jsp" method="post">
	<div class="login_m">
		<div class="login_logo">
			<img src="./images/login_logo.png" width="196" height="46">
		</div>
		<div class="login_boder">

			<div class="login_padding" id="login_model">

				<h2>账号</h2>
				<label> <input type="text" id="username"
					class="txt_input txt_input2" palceholder="手机号/邮箱" />
				</label>
				<h2>密码</h2>
				<label> <input type="password" name="textfield2"
					id="userpwd" class="txt_input">
				</label>




				<p class="forgot">
					<a id="iforget" href="javascript:void(0);">忘记密码?</a>
				</p>
				<div class="rem_sub">
					<div class="rem_sub_l">
						<input type="checkbox" name="checkbox" id="save_me"> <label
							for="checkbox">记住密码</label>
					</div>
					<label> <input type="submit" class="sub_button"
						name="button" id="button" value="SIGN-IN" style="opacity: 0.7;">
					</label>
				</div>
			</div>

		</div>
	
	</div>
	<!--login_m end-->
</form>



</body>
</html>