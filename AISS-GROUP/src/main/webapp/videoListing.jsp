<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Búsqueda de videos: <c:out value="${requestScope.name}"/></title>
</head>
<body>
	<c:forEach items="${requestScope.videos.items}" var="video">
	<form action="/videoController" method = "get"><div class = "video">
		<input type="hidden" name="id" value="<c:out value="${video.id.videoId}"/>">
		<img src = "<c:out value="${video.snippet.thumbnails.medium.url}"/>">
		<h3><c:out value="${video.snippet.title}"/></h3>
		<input type = "hidden" name="title" value="<c:out value="${video.snippet.title}"/>">
		<button type = "submit" name ="submit" value="submit">Enlace al vídeo</button>
	</div></form>
	</c:forEach>
</body>
</html>