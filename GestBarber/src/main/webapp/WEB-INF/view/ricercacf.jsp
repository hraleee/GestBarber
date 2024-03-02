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
            <h2>Risultati:</h2>
            <p>
                <label for="nome">Nome:</label>
                <input type="text" id="nome" value="${nomeValore}" readonly>
            </p>
            <p>
                <label for="cognome">Cognome:</label>
                <input type="text" id="cognome" value="${cognomeValore}" readonly>
            </p>
            <p>
                <label for="cf">Codice Fiscale:</label>
                <input type="text" id="cf" value="${cfValore}" readonly>
            </p>
            <p>
                <label for="tel">Telefono:</label>
                <input type="text" id="tel" value="${telValore}" readonly>
            </p>
            
            <p>
                <label for="username">Username:</label>
                <input type="text" id="username" value="${usernameValore}" readonly>
            </p>
            
            <p>
                <label for="password">password:</label>
                <input type="text" id="password" value="${passwordValore}" readonly>
            </p>
           <h1> <p class="error">${valoreErrorecf}</p></h1>
        </div>
    </div>

</body>
</html>