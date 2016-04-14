<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>


<title>My JSP 'show_haidai.jsp' starting page</title>

<style>
	.table1{
	 	width: 550px;
	 	height:300px;
	 	border:1px solid blue;
	 	cellpadding:10px;
	 	cellspacing:0px;
	}
	
</style>
</head>

<body>

	<table width="600" border="1" cellpadding="5px"
		cellspacing="0">
		<tr>
			<th>id</th>
			<th>账号</th>
			<th>密码</th>
			<th>真名</th>
			<th>昵称</th>
			<th>性别</th>
			<th>年龄</th>
			<th>是否海带</th>
			<th>图像</th>
			<th>二维码</th>
			<th>删除</th>
			<th>修改</th>

		</tr>
		<c:forEach items="${requestScope.result}" var="myresult"
			varStatus="status">
			<tr>
				<td>${myresult.id}</td>
				<td>${myresult.telephone}</td>
				<td>${myresult.password}</td>
				<td>${myresult.realName}</td>
				<td>${myresult.nickName}</td>
				<td>${myresult.sex}</td>
				<td>${myresult.age}</td>
				<td>${myresult.type}</td>
				<td>${myresult.image_url}</td>
				<td>${myresult. qr_code_url}</td>
				<td><a href="DeleteAccount?id=${myresult.id}">删除</a></td>
				<td><a href="">修改</a></td>

			</tr>
		</c:forEach>
	</table>

	<form action="userManager" method="post">
		<table class="">
			<tr>
				<%-- <td>每页显示${requestScope.pageSize}条数据</td>
				<td>当前页为${requestScope.currentPage}</td> --%>

				<td>总共有${requestScope.count}条数据</td>

				<td>每页显示<input type="text" name="pageSize"
					value="${requestScope.pageSize}" />条数据.
				</td>

				<td>跳转到第<input type="text" name="currentPage"
					value="${requestScope.currentPage}" />页
				</td>

			</tr>
		</table>
		<input type="submit" value="提交" />

	</form>
	<a
		href="userManager?nextPage=${requestScope.currentPage+1}&pageSize=${requestScope.pageSize}">下一页</a>
	<a
		href="userManager?frontPage=${requestScope.currentPage-1}&pageSize=${requestScope.pageSize}">上一页</a>


</body>
</html>
