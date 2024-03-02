<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ricerca per Codice Fiscale</title>
    <link rel="stylesheet" href="modifica.css">
</head>
<body>


<h1 class="main-title">Ricerca per Codice Fiscale</h1>

<form action="modificaPerCf" method="POST" class="search-form">
    <label for="cfImp">Codice Fiscale:</label>
    <input type="text" name="cfImp" placeholder="Codice Fiscale"><br>
    <input type="submit" value="ricerca"><br>
</form>



<form action="modificaPerCfCliente" method="POST" class="modify-form">
    <label for="nomeRic">Nome:</label>
    <input type="text" name="nomeRic" value="${nomeValore}" readonly><br>
    
    <label for="cognomeRic">Cognome:</label>
    <input type="text" name="cognomeRic" value="${cognomeValore}" readonly><br>
    
    <label for="cfRic">Codice Fiscale:</label>
    <input type="text" name="cfRic" value="${cfValore}" readonly><br>
    
    <label for="telefonoRic">Telefono:</label>
    <input type="text" name="telefonoRic" value="${telefonoValore}" readonly><br>
    
    <label for="usernameRic">Username:</label>
    <input type="text" name="usernameRic" value="${usernameValore}" readonly><br>
    
    <label for="passwordRic">Password:</label>
    <input type="text" name="passwordRic" value="${passwordValore}" readonly><br>
    
    <input type="submit" value="modifica"><br>
    <h1>${valoreErrorecf}</h1>
    
</form>

</body>
</html>