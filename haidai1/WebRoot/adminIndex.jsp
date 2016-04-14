<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>adminIndex</title>
<link rel="stylesheet" type="text/css" href="css/basic.css" />
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('.all>li').mouseover(function(e) {
			$(this).children().stop().slideDown(300);
		});
		$('.all>li').mouseout(function(e) {
			$(this).children().stop().slideUp(300);
		});
	});
</script>
<style>
	#myright{
		width: 800px;
		height:800px;
		border: 1px blue solid;
		position: absolute;
		left:350px;
		top:40px;
	}

</style>
</head>

<body>

	<div id="left" style="width:100%;  border: 1px red solid; " >
		<div id="logo"></div>

		<div id="nav" >
			<ul class="all">
				<li class="li01">用户管理
					<ul class="li_01">
						<li><a href="userManager?id=look_haidai" target="information">查看海带</a></li>
						<li>查看用户</li>
						<li>热门海带</li>

					</ul>
				</li>

				<li class="li01">商品管理
					<ul class="li_01">
						<li>查看商品</li>
						<li>最热产品</li>
					</ul>
				</li>

				<li class="li01">资讯管理
					<ul class="li_01">
						<li>所有资讯</li>
						<li>上传资讯</li>
						<li>一级菜单</li>
					</ul>
				</li>

				<li class="li01">排行榜
					<ul class="li_01">
						<li>一级菜单</li>
						<li>一级菜单</li>
						<li>一级菜单</li>
					</ul>
				</li>

				<li class="li01">电台
					<ul class="li_01">
						<li>一级菜单</li>
						<li>一级菜单</li>
						<li>一级菜单</li>
					</ul>
				</li>

				<li class="li01">Mv
					<ul class="li_01">
						<li>一级菜单</li>
						<li>一级菜单</li>
						<li>一级菜单</li>
					</ul>
				</li>

				<li class="li01">专题
					<ul class="li_01">
						<li>一级菜单</li>
						<li>一级菜单</li>
						<li>一级菜单</li>
					</ul>
				</li>

				<li class="li01">社区
					<ul class="li_01">
						<li>一级菜单</li>
						<li>一级菜单</li>
						<li>一级菜单</li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
	
	<div id="myright" >
		<h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎来到管理员登录界面</h1>
		<iframe style="width:650px; height:600px; border:0;" name="information" src="#">
        </iframe>
		
	</div>
</body>
</html>