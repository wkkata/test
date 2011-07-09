<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>just for testing </title>
</head>
<body>
	用户名：${pcUser.userName } 密码 ： ${pcUser.userPassword }
	
	是否存在: ${res }
	<table>
		
		<s:iterator value="test">
			<tr>
			<TD>
			<s:property value="id"/>
			</TD>
			<TD>
			<s:property value="A" />
			</TD>
			</tr>
		</s:iterator>
		
	</table>
</body>
</html>