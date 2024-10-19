<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<title>Libro de visitas</title>
		<style>
		    html {
		        background: rgb(2,0,36);
                background: linear-gradient(0deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 35%, rgba(0,212,255,1) 100%);
                height: 100%;
                margin: 0;
            }
		    body {
		        font-family: Arial;
		        width: 600px;
		        margin: 80px auto;
            }
		    header {
		        text-align: center;
		        color: white;
            }
		    div {
		        border-radius: 15px;
		        background-color: silver;
		        padding: 20px;
            }
		    input {
		        width: 100%;
		        padding: 12px;
		        margin: 8px 0;
		        display: inline-block;
		        border: 1px solid #ccc;
		        border-radius: 4px;
		        box-sizing: border-box;
            }
		    input[type=submit] {
		        background-color: #00CC00;
		        width: 100px;
		        color: #fff;
            }
		    input[type=submit]:hover {
		        background-color: #33CC00;
		        border-color: #33CC33;
		        color: #f4f6f7;
            }
		    input[type=reset] {
		        background-color: #fff;
		        border-color: #dadce0;
		        color: #1a73e8;
		        width: 100px;
            }
		    input[type=reset]:hover {
                background-color: #f6f9fe;
                border-color: #1a73e8;
                color: #174ea6;
            }
		</style>
	</head>
	<body>
		<header>
			<h1>¡Bienvenido/a al libro de visitas!</h1>
			<p>Deja tu visita registrada</p>
		</header>
		<br/>
		<br/>
		<div>
			<form action="/myServlet2">
				<label for="fNombre">Nombre:</label>
				<br/>
				<input type="text" id="fNombre" name="fNombre"/>
				<br/>
				<br/>
				<label for="fApellidos">Apellidos:</label>
				<br/>
				<input type="text" id="fApellidos" name="fApellidos"/>
				<br/>
				<br/>
				<input type="submit" value="FIRMAR"/>
				<input type="reset" value="BORRAR"/>
			</form>
		</div>
	</body>
</html>