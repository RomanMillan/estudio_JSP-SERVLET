<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jacaranda.WriteDocument, com.jacaranda.Studend" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
				
		<%
			/* Obtención de parametros de la petición */
		
			String userName = request.getParameter("userName");
			String lastName = request.getParameter("lastName");
			Double avarage = Double.parseDouble(request.getParameter("average"));
			
			/* Creamos el objeto alumno */
			Studend st = new Studend(userName,lastName,avarage);
			
			ServletContext sc = this.getServletContext();
			String path = sc.getRealPath("/WEB-INF/promedio.txt");
			path = path.replace('\\','/');
			
			/* Guardar en archivo */
			WriteDocument.add(st, path);
			
		%>
		
		<h2>Tu registro se hizo con éxito</h2>

		 <form action="index.jsp" method="post">
		 	<input type="submit" value="Nuevo Registro">
		 </form>
		
	</body>
</html>