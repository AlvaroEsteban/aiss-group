<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Noticias de IGN</title>
<link rel="stylesheet" type="text/css" href="css/cssgl.css" />
</head>
<body>

	<header id="cab">
	<div class="titulo">

		<h1 class="titulo">gameLive</h1>

	</div>

	</header>
	
	<br/>
	<fieldset id="ign">
	<legend id = "segtitulo">Búsqueda de noticias recientes</legend>
	<div id="parrafo">
	<c:forEach items="${requestScope.articles}" var="article">
		<span id="atributo"> Noticia:</span> <c:out value="${article.title }"/> <br/>
		<span id="atributo"> Descripción:</span>  <c:out value="${article.description}"/> <br/>
		<a href=<c:out value="${article.url}"/>> Noticia completa</a> <br/>
		<span id="atributo"> Fuente de la noticia:</span>  <c:out value="${article.source}"/> <br/>
		<span id="atributo"> Publicado en:</span> <c:out value="${article.publishedAt}"/> <br/>
		<span id="atributo"> Autor de la noticia:</span> <c:out value="${article.author}"/> <br/>
		<br/>
	</c:forEach>
	</div>
	</fieldset>
	
	

</body>
</html>