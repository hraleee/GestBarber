<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="loginop.css">
</head>
<body>
    <div id="container">
    <h2><a class="menu" href="menuclienti">Home</a></h2>
     <h1>Log in Personale Barber Shop</h1>

        <form action="operatorelogin" method="POST">
       
            Username: <input type="text" name="usernameRic" placeholder="Inserisci l'username"><br>
            Password: <input type="password" name="passwordRic" placeholder="Inserisci la password"><br>
            <input type="submit" value="Log in">
            ${errore}
        </form>
    </div>
</body>
</html>