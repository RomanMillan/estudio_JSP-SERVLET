<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Pagina 2</title>
	</head>
	<body>
		
		<%
			/*
				Este es un scriptlet (bloque de codigo JAVA). 
				Capturamos los parametros enviados en el objeto "request"
			*/
			
			/* coger los datos de la tabla */
			String nameUser = request.getParameter("nameUser");
			String favoriteColor = request.getParameter("favoriteColor");
			String email = request.getParameter("email");
			
			/* coger el dato de radio-button */
			String transport = request.getParameter("transport");
			
			/* coger los datos de checkbox */
			String city = request.getParameter("city");
			String forest = request.getParameter("forest");
			String beach = request.getParameter("beach");
			
			/* coger el comentario del textarea */
			String comment = request.getParameter("comment");
			
			/* coger el dato del select (idioma natal) */
			String language = request.getParameter("language");
			
			/* coger los idiomas de programacion */
			String[] languageCodeList = request.getParameterValues("languageCode");
			
		%>
			
			<h1>Esta es la pagina secundaria</h1>
			<h2>Aqui se muestran los datos insertados anteriormente</h2>
			
			<!-- mostramos los datos personales -->
			Te llamas: <%= nameUser %> 
			<br>
			Tu color favorito: <%= favoriteColor %>	 
			<br>	
			Tu email: <%= email %>
			<br>
			
			<!-- mostramos el dato del checkbox -->
			<p>Este es su transporte fovorito: <%= transport %></p>
			
			<!-- mostramos el dato del radio-button -->
			<% if(city != null){ %>
				ciudad
			<%}; %>
			
			<% if(forest != null){ %>
				bosque
			<%}; %>
			
			<% if(beach != null){ %>
				playa
			<%}; %>
			
			<!-- mostramos el comentario del textarea -->
			<p>Este es el comentario del usuario: </p>
			<%= comment %>
			
			<!-- mostramos el select (idioma natal)-->
			<p>Este es su idioma natal: <%= language %></p>
			
			<!-- Mostramos varios selecciones en un select (idiomas programaci?n) -->
			<p>Estos son los idiomas de programaci?n que conoces: </p>
			<% for(int i = 0; i < languageCodeList.length; i++){ %>
					/ <%= languageCodeList[i] %> /
			<%} %>
		
	</body>
</html>