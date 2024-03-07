<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet" href="stile_registrazione.css">
</head>
<body>

	<div class="container">
		<div class="image-container">
		
       </div>

		<div class="form-container">
			<center>
				<h1>Registra Cliente</h1>
			</center>

             <center> <a class="menu" href="logincliente">Login</a>
            <a class="menu" href="home">Home</a>   </center>
			<form action="inserisciCliente" method="POST">
				<div class="input-container">
					<label for="nomeCliente">Nome</label> <input type="text"
						name="nomeCliente" placeholder="Nome" required>
				</div>

				<div class="input-container">
					<label for="cognomeCliente">Cognome</label> <input type="text"
						name="cognomeCliente" placeholder="Cognome" required>
				</div>

				<div class="input-container">
					<label for="cfCliente">Codice Fiscale</label> <input type="text"
						name="cfCliente" placeholder="Codice Fiscale" required>
				</div>

				<div class="input-container">
					<label for="telefonoCliente">Telefono</label> <input type="text"
						name="telefonoCliente" placeholder="Telefono" required>
				</div>
				
				<div class="input-container">
					<label for="usernameCliente">Username</label> <input type="text"
						name="usernameCliente" placeholder="Username" required>
				</div>

				<div class="input-container">
					<label for="passwordCliente">Password</label> <input type="password"
						name="passwordCliente" placeholder="Password" required>
				</div>

				<center>
					<input type="submit" value=Registrati>
				</center>
			</form>

			<center>
				<h1>${valore}</h1>
			</center>
		</div>
	</div>

</body>
</html>