<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Pagina inicio</h1>
		<p>Rellene los campos</p>
		<form action="destino.jsp" method="post">
			
			<table border="1px">
			<!-- Nombre usuario -->
				<tr>
					<td>Nombre: </td>
					<td>
						<input type="text" name="userName">
					</td>
				</tr>
				<!-- Minuto inicial -->
				<tr>
					<td>Minuto inicial: </td>
					<td>
						<input type="number" name="firstTime">
					</td>
				</tr>
				<!-- Minuto final -->
				<tr>
					<td>Minuto final: </td>
					<td>
						<input type="number" name="lastTime">
					</td>
				</tr>
				<!-- Distancia recorrida -->
				<tr>
					<td>Distancia Recorrida (metros): </td>
					<td>
						<input type="number" name="distance">
					</td>
				</tr>
			</table>
			
			<!-- botones -->
			<input type="submit" value="Enviar">
			<br>
			<input type="reset" value="Borrar">
			
		</form>
	</body>
</html>