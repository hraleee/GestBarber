<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="servizioins.css">
</head>
<body>

<div id="container">
<h1>Inserisci il servizio</h1>
<a class="menu" href="gestioneservizio">Home</a>
<form action="servizioinserisci" method="POST">

Nome:<input type=text name="nomeServizio" placeholder="Inserisci il nome del servizio" required><br>
Costo:<input type=text name="costoServizio" placeholder="Inserisci il costo del servizio" required><br>
Durata:<input type=text name="durataServizio" placeholder="Inserisci la durata del servizio" required><br>
<input type=submit name="Invia">
<center><h2>${esitoServizio}</h2></center>
</div>
</form>









</body>
</html>