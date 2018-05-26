<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix= "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Resultados de la búsqueda de videojuegos</title>
	<link rel="stylesheet" type="text/css" href="css/cssgl.css" />
</head>
<body>
	<header id="cab">
	<div class="titulo">
		<h1 class="titulo">gameLive</h1>
	</div>
	</header>
	
	
	<fieldset id = "giantGames">

		<legend id="segtitulo">Resultados de tu búsqueda</legend>
		<div id="parrafo">
		<c:forEach items="${requestScope.games}" var="game">
			<span id="atributo"> Nombre del videojuego:</span> <c:out value="${game.name}"/> <br/>
			<span id="atributo"> Identificador:</span>  <c:out value="${game.guid}"/> <br/>
			
			<span id="atributo"> Descripción del videojuego:</span>  <c:out value="${game.deck}"/>  
			<input type="hidden" value="${game.apiDetailUrl}" id="enlace"/>
			<div>${game.description}</div>
			<form action = "GiantBombGameController" method = "get">
				<input type = "hidden" value = "${game.guid}" name="guid">
				<input type = "submit" value = "Enlace del videojuego">
			</form>
			<br/>
		</c:forEach>
		</div>
	</fieldset>
	
	
</body>
</html>