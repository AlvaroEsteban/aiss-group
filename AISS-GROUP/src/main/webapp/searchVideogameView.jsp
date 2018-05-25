<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix= "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultados de la b�squeda de videojuegos</title>
</head>
<body>
	
	<fieldset id = "giantGames">
		<c:forEach items="${requestScope.games}" var="game">
			<span> Nombre del videojuego: <c:out value="${game.name}"/> </span><br/>
			<span> GUID del videjuego:  <c:out value="${game.guid}"/> </span><br/>
			<span> Descripci�n del videojuego:<c:out value="${game.deck}"/>  </span>
			<input type="hidden" value="${game.apiDetailUrl}" id="enlace"/>			
			<form action = "GiantBombGameController" method = "get">
				<input type = "hidden" value = "${game.guid}" name="guid">
				<input type = "submit" value = "Enlace del videojuego">
			</form>
			</div>
			<br/>
		</c:forEach>
		
	</fieldset>
	
	
</body>
</html>