<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix= "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<fieldset id = "giantGame">
			<span> Nombre del videojuego: <c:out value="${requestScope.result.name}"/> </span><br>
			<span> GUID del videjuego:  <c:out value="${requestScope.result.guid}"/> </span><br>
			<span> Descripción del videojuego:<c:out value="${requestScope.result.deck}"/>  </span>
			<br>
		
	</fieldset>
	
	
	
</body>
</html>