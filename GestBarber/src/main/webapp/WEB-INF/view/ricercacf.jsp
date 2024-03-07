<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ricerca Cliente</title>
   <link rel="stylesheet" type="text/css" href="ricercaOp.css">
</head>
<body>

    <div class="container">
        <div class="form-container">
        <a class="menu" href="gestionecliente">Home</a>
            <h1>Ricerca per Codice Fiscale</h1>
            <form action="ricercaPerCf" method="POST">
                <div class="input-container">
                    <label for="cfImp">CODICE FISCALE</label>
                    <input type="text" name="cfImp" placeholder="codice fiscale" required>
                </div>
                <input type="submit" value="Invia">
            </form>
        </div>

        <div class="results">
           <center><h2>Risultati:</h2></center> 
           
                <label for="nome">Nome:</label>
                <input type="text" id="nome" value="${nomeValore}" readonly>
            
                <label for="cognome">Cognome:</label>
                <input type="text" id="cognome" value="${cognomeValore}" readonly>
            
                <label for="cf">Codice Fiscale:</label>
                <input type="text" id="cf" value="${cfValore}" readonly>

                <label for="tel">Telefono:</label>
                <input type="text" id="tel" value="${telValore}" readonly>
           
                <label for="username">Username:</label>
                <input type="text" id="username" value="${usernameValore}" readonly>
                
                <label for="password">password:</label>
                <input type="text" id="password" value="${passwordValore}" readonly>
            
           <h1> <p class="error">${valoreErrorecf}</p></h1>
        </div>
    </div>

</body>
</html>