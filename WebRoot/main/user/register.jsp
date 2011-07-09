<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>注册用户</title>
</head>
<body>
	<center>
		<form action="registerAction.action" method="post">
		<table>
			<tr>
				<td>登录名：</td><td><input type="text" name="userNo" id="userNo" value="${userNo }"/></td><td><span style="color:red">*<s:fielderror fieldName="userNo"/></span></td>
			</tr>
			<tr>
				<td>用户姓名：</td><td><input type="text" name="userName" id="userName" value="${userName}" /></td><td><span style="color:red">*<s:fielderror fieldName="userName"/></span></td>
			</tr>
			<tr>
				<td>用户密码：</td><td><input type="password" name="userPassword" id="userPassword" value="${userPassword}" /></td><td><span style="color:red">*<s:fielderror fieldName="userPassword"/></span></td>
			</tr>
			<tr>
				<td>重新输入用户密码：</td><td><input type="password" name="userPasswordReInput" id="userPasswordReInput" value="${userPasswordReInput}" /></td><td><span style="color:red">*<s:fielderror fieldName="userPasswordReInput"/></span></td>
			</tr>
			<tr>
				<td>用户电子邮箱：</td><td><input type="text" name="userEmailAddress" id="userEmailAddress" value="${userEmailAddress}" /></td><td><span style="color:red">*<s:fielderror fieldName="userEmailAddress" /></span></td>
			</tr>
		</table>
		<input type="submit" value="确定"/>
		</form>
	</center>
</body>
</html>