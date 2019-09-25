<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1">
		<tr>
			<td>订单号</td>
			<td>备注</td>
			<td>金额</td>
			<td>日期</td>
		</tr>
		<c:forEach items="${list}" var="o">
			<tr>
				<td>${o.id }</td>
				<td>${o.remark }</td>
				<td>${o.total }</td>
				<td>${o.odate }</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="4">
				<a href="vips?page=${page-1 }&token=${token}">上一页</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="vips?page=${page+1 }&token=${token}">下一页</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				当前第${page}页
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				共${pages}页
			</td>
		</tr>
	</table>
</body>
</html>