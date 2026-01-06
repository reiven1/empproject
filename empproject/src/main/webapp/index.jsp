<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/list.do">사원조회</a>
	<br>
	<form action="<%=request.getContextPath()%>/namesearch.do" method="post">
		<input type="text" name="name" value="" placeholder="이름 입력">
		<input type="submit" value="제출">
	</form>
</body>
</html>