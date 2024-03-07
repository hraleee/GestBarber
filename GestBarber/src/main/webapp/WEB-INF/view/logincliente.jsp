<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOG IN</title>
<link rel="stylesheet" href="logincliente.css">
</head>
<body>



<form action="loginclientepost" method="POST" id="tabella">



    <div id="menu">
       <h2><a class="menu" href="menuclienti">Home</a></h2>
       <h2 >Log in Cliente</h2>
       
        
        <label for="usernamelogin">Username</label>
        <input type="text" name="usernamelogin"><br>

       
       
        <label for="passwordlogin">Password</label>
        <input type="password" name="passwordlogin"><br>

        <input type="submit" value="Log In">
        Non sei registrato?<a href="registracliente">Registrati</a><br>
        <h2>${errore}</h2>
    </div>

</form>





</body>
</html>