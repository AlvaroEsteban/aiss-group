<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Noticias de IGN</title>
</head>
<body>
	
	<fieldset id="ign">
	<legend>Búsqueda de noticias recientes</legend>
	<c:forEach items="${requestScope.articles}" var="article">
		<span> Nombre del videojuego: <c:out value="${article.title }"/> </span><br/>
		<span> Fuente de la noticia:  <c:out value="${article.source}"/> </span><br/>
		<span> Descripción de la noticia:  <c:out value="${article.description}"/> </span><br/>
		<span> URL de la noticia:  <c:out value="${article.url}"/> </span><br/>
		<span> Publicado en:  <c:out value="${article.publishedAt}"/> </span><br/>
		<span> Autor de la noticia:  <c:out value="${article.author}"/> </span><br/>
		<br/>
	</c:forEach>
	
	</fieldset>
	
	<div>
	Artículos: ${requestScope.articles}
	
	</div>
	
	
	
	
	
	
	
	
</body>
</html>