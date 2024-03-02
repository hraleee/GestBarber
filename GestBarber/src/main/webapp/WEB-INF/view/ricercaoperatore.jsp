<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ricerca Operatore</title>
    <link rel="stylesheet" type="text/css" href="ricercaOp.css">
</head>
<body>

<div class="container">
    <center>
        <h1>Ricerca Operatore</h1>
    </center>
    <div class="image-container"></div>
    <form action="ricercaCfOperatore" method="POST" class="form-container">
        Codice Fiscale: <input type="text" name="cfOpImp" placeholder="Codice Fiscale">
        <input type="submit" value="ricerca">
    </form>

    <div class="input-container">
        <label for="nomeValore">Nome:</label>
        <input type="text" value="${nomeValore}" readonly>
    </div>

    <div class="input-container">
        <label for="cognomeValore">Cognome:</label>
        <input type="text" value="${cognomeValore}" readonly>
    </div>

    <div class="input-container">
        <label for="cfValore">Codice Fiscale:</label>
        <input type="text" value="${cfValore}" readonly>
    </div>

    <div class="input-container">
        <label for="usernameValore">Username:</label>
        <input type="text" value="${usernameValore}" readonly>
    </div>

    <div class="input-container">
        <label for="passwordValore">Password:</label>
        <input type="text" value="${passwordValore}" readonly>
    </div>

    <h1>${errorevalore}</h1>
</div>

</body>
</html>