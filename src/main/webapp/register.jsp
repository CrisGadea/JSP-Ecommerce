<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Register</title>
	<link href="./css/styles.css" rel="stylesheet">
</head>
<body>
	<h1>Register</h1>
	<br><br>
	<form method="post" action="usuarios">
		<input type="text" name="username" placeholder="Ingrese nombre de usuario">
		<br>
		<input type="email" name="email" placeholder="Ingrese su email"><br>
		<input type="password" name="password" placeholder="Ingrese una contraseña"><br>
		<input type="tel" name="tel" placeholder="Ingrese su teléfono"><br>
		<input type="submit" value="Enviar">
	</form>

</body>
</html>