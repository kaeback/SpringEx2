<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test.jsp</title>
</head>
<body>
<c:set var="value" value="페이지에서 저장한 값"></c:set>
<p>value : ${sessionScope.value }</p>
<p>value : ${value }</p>
<p><a href="/web2">메인화면으로 이동</a></p>
</body>
</html>