<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Inicio</title>
	</head>
	<body>
		<h1>Esta es la pagina de inicio</h1>
		<h2>Aquí se pinden los datos</h2>
		
		<form action="pagina2.jsp" method="post">
			
			<!-- datos personales -->
			Nombre: <input type="text" name="nameUser">	<br>
			Color favorito: <input type="text" name="favoriteColor"> <br>	
			Email: <input type="email" name="email"> <br>
			
			<!-- eleccion por radio button -->
			<p>Elige el transporte preferido</p>
			<input type="radio" name="transport" value="coche"> Car
			<input type="radio" name="transport" value="avion">Avión
			<input type="radio" name="transport" value="autobus"> Autobus
			<br>
			
			<!-- eleccion por checkbox -->
			<p>Destino favorito</p>
			<input type="checkbox" name="city" value="ciudad"> Ciudad <br>
			<input type="checkbox" name="forest" value="bosque"> Bosque <br>
			<input type="checkbox" name="beach" value="playa"> Playa <br>
			
			
			<!-- Poner un comentario -->
			<p>Escribe un comentario</p>
			<textarea name="comment" rows="5" cols="30"></textarea>
			
			<!-- eleccion con un select -->
			<p>Eligue el idoma natal: </p>
			<select name="language">
				<option>Español</option>
				<option>Inglés</option>
				<option>Frances</option>
				<option>Alemán</option>
			</select>
			<br>
			
			<!-- selector multiple -->
			<p>Eligue los lenguajes de programación que sepas: (Ctrl-click varias)</p>
			<select name="languageCode" multiple>
				<option>Java</option>
				<option>C/C++</option>
				<option>Basic</option>
				<option>Phyton</option>
				<option>Pascal</option>
			</select>
			<br>
			
			<!-- botones para enviar y borrar -->
			<input type="reset" value="Borrar">
			<input type="submit" value="Enviar">
			
		</form>
	</body>
</html>