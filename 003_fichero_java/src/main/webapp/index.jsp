<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Proporciona tus datos</h1>
		
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
	</body>
</html>