<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
				<h1>Proporciona tus datos</h1>
		<form action="pageDestination.jsp" method="post">
			<table>
				<tr>
					<td>Nombre: </td>
					<td>
						<input type="text" name="userName">
					</td>
				</tr>
				
				<tr>
					<td>Apellidos</td>
					<td>
						<input type="text" name="lastName">
					</td>
				</tr>
				
				<tr>
					<td>Promedio</td>
					<td>
						<input type="text" name="average">
					</td>
				</tr>
			</table>
			
			<!-- botones enviar / borrar -->
			<input type="submit" value="Enviar">
			<input type="reset" value="Borrar">
		
		</form>
		
	</body>
	</body>
</html>