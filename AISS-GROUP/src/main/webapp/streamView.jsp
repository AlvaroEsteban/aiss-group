<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix= "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Viendo el stream de <c:out value="${requestScope.channel}"/></title>
</head>
<body>
	<iframe 
	src="https://player.twitch.tv/?channel=<c:out value="${requestScope.channel}"/>&autoplay=true" 
	height="440" 
	width="728" 
	frameborder="0" 
	scrolling="no"
	allowfullscreen="true">
</iframe>
</body>
</html>