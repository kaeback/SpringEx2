<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test3</title>
</head>
<body>
<p>data1 : ${requestScope.data1 }</p>
<p>data2 : ${requestScope.data2 }</p>

<p><a href="step2">두 번째 단계</a></p>
<p><a href="step3">세 번째 단계</a></p>
<p><a href="end">마지막 단계</a></p>
</body>
</html>