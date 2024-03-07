<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="stile_registrazione.css">
</head>
<body>

<div class="container">
    <div class="image-container"></div>
    <div class="form-container">
                  <center><a class="menu" href="gestioneoperatori">Home</a>
				<h1>Registra Operatore</h1>
				<center>
			       </center>
    <form action="registraOperatore" method="POST" >

        <div class="input-container">
            <label for="nomeOp">Nome:</label>
            <input type="text" name="nomeOp" required>
        </div>

        <div class="input-container">
            <label for="cognomeOp">Cognome:</label>
            <input type="text" name="cognomeOp" required>
        </div>

        <div class="input-container">
            <label for="opUsername">Username:</label>
            <input type="text" name="opUsername" required>
        </div>

        <div class="input-container">
            <label for="opPassword">Password:</label>
            <input type="password" name="opPassword" required>
        </div>

        <div class="input-container">
            <label for="cfOp">Codice Fiscale:</label>
            <input type="text" name="cfOp" placeholder="cf" required>
        </div>

        <div class="input-container">
            <label for="idCategoria">Categoria:</label>
            <select name="idCategoria" required>
                <option value="1">Admin</option>
                <option value="2">Segretaria</option>
                <option value="3">Operatore</option>
               
            </select>
        </div>

        <div class="input-container">
            <label for="opAbilitato">Abilitato:</label>
            <select name="opAbilitato" id="opAbilitato" required>
                <option value="0">NON ABILITATO</option>
                <option value="1">ABILITATO</option>
            </select>
        </div>

        <input type="submit" value="Aggiungi">
  <h1 class="esito">${esito}</h1>
    </form>
    
    
    </div>
    

</div>


</body>
</html>