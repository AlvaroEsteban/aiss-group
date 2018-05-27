<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix= "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/cssgl.css" />
<title>Videojuego</title>
</head>
<body>
	<header id="cab">
	<div class="titulo">

		<h1 class="titulo">gameLive</h1>

	</div>

	</header>
	<br/>
	<br/>
	
	<fieldset id = "giantGame">
	<legend id="segtitulo"> <c:out value="${requestScope.result.name}"/></legend>
	<div id="parrafo">
			<span id="atributo"> Nombre completo del videojuego:</span> <c:out value="${requestScope.result.name}"/> <br>
			<span id="atributo"> Descripción breve:</span> <c:out value="${requestScope.result.deck}"/>   </br>
			<span id="atributo"> Id:</span> <c:out value="${requestScope.result.id}" />
			<div> ${requestScope.result.description} </div>
			<form action = "/youtubeSearch" method ="get">
				<input type = "hidden" name = "query" value = "<c:out value="${requestScope.result.name}"/>">
				<button type="submit" name ="submit" id="submit" value="submit">Vídeos relacionados</button>
			</form>
	</fieldset>
	
	</div>
	
</body>
</html>