<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix= "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultados de la búsqueda</title>
</head>
<body>
	<fieldset id = "twitch">
		<legend>Resultados de <c:out value = "${requestScope.game}"/></legend>
		<c:forEach items = "${requestScope.streamlist}" var = "stream">
		<form action ="TwitchStreamController" method = "get">
		<!-- <img src = <c:out value = "${stream.channel.logo}"/> a >-->
		<input type="image" src="<c:out value = "${stream.channel.logo}"/>" alt="Submit Form"/>
		<input type = "hidden" name ="channel" value = <c:out value = "${stream.channel.name}"/>/>
		<input type = "hidden" name ="logo" value = <c:out value = "${stream.channel.logo}"/>"/>
		</form>
		<p>Nombre del canal: <c:out value = "${stream.channel.name}"/></p>
		</c:forEach>
	</fieldset>
</body>
</html>