<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<title>¡Gracias por tu visita!</title>
        <style>
            html {
                background: rgb(2,0,36);
                background: linear-gradient(0deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 35%, rgba(0,212,255,1) 100%);
                height: 100%;
                margin: 0;
            }
            body {
                font-family: Arial;
                text-align: center;
                width: 600px;
                margin: 80px auto;
                color: #fff
            }
        </style>
    </head>
    <body>
        <h1>Tu visita se ha registrado:<br/>${fNombre} ${fApellidos}</h1>
    </body>
</html>