<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todos los juegos de Giantbomb</title>
</head>
<body>
	
	<fieldset id="Giantbomb">
	<legend>Búsqueda de noticias recientes</legend>
	<c:forEach items="${requestScope.games}" var="game">
		<span> Nombre del videojuego: <c:out value="${game.name}"/> </span><br/>
		<span> GUID del videjuego:  <c:out value="${game.guid}"/> </span><br/>
		<span> Descripción del videojuego:  <c:out value="${game.description}"/> </span><br/>
		<br/>
	</c:forEach>
	</fieldset>

</body>
</html>