<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户信息 </title>
</head>
<body>
	用户名：${pcUser.userName } 密码 ： ${pcUser.userPassword }
	用户角色：${pcUser.pcRoleGroup.rgName }
</body>
</html>