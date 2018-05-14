<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultados de la búsqueda de videojuegos</title>
</head>
<body>
	
	<fieldset id = "giantGames">
		<legend>Resultados de <c:out value = "${requestScope.game}"/></legend>
		
		ay lmao
		<c:forEach items = "${requestScope.streamlist}" var = "stream">
		<form action ="GiantBombSearchController" method = "get">
		<!-- <img src = <c:out value = "${stream.channel.logo}"/> a >-->
		
		</form>
	
		</c:forEach>
	</fieldset>
	
	
</body>
</html>