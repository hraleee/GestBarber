<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Modifica per Codice Fiscale</title>
    <link rel="stylesheet" href="modifica.css">
</head>
<body>



<div class="modify-form">
<form action="modificaPerCf" method="POST" >
    <br><h3 class="main-title">Modifica per Codice Fiscale</h3>
    <center> <a class="menu" href="gestionecliente">Home</a>  </center>
    <label for="cfImp">Codice Fiscale:</label>
    <input type="text" name="cfImp" placeholder="Codice Fiscale"><br>
    <input type="submit" value="ricerca"><br>
</form>



<form action="modificaPerCfCliente" method="POST" >
    
 <center>  <h2>${modifica}</h2></center> 
    
    <label for="nomeRic">Nome:</label>
    <input type="text" name="nomeRic" value="${nomeValore}" ><br>
    
    <label for="cognomeRic">Cognome:</label>
    <input type="text" name="cognomeRic" value="${cognomeValore}" ><br>
    
    <label for="cfRic">Codice Fiscale:</label>
    <input type="text" name="cfRic" value="${cfValore}" readonly><br>
    
    <label for="telefonoRic">Telefono:</label>
    <input type="text" name="telefonoRic" value="${telValore}" ><br>
    
    <label for="usernameRic">Username:</label>
    <input type="text" name="usernameRic" value="${usernameValore}" ><br>
    
    <label for="passwordRic">Password:</label>
    <input type="text" name="passwordRic" value="${passwordValore}" ><br>
    
    
    
     <label for="abilita">Abilita:</label>
            <select name="abilita" >        
                 <option value="1">Abilitato</option>  
                  <option value="0">Non abilitato</option>  
            </select><br><br>
    
    
    <input type="submit" value="modifica"><br>
   
    
</form>
</div>
</body>
</html>