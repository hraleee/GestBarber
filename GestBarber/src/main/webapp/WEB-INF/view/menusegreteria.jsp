<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Operatore</title>
<link rel="stylesheet" href="menuclienti.css">
</head>
<body>

<div id="container">
<%
    String cfOperatore = (String) session.getAttribute("cfOperatore");
   if (cfOperatore == null || cfOperatore.isEmpty()) {
      
       response.sendRedirect("home");
   }
   
       %>


<h2>Menu Operatore</h2>
<div id="menu">
<a class="menu" href="home">Home</a>
<a class="menu" href="prenotazionesegretaria">Prenotazione</a>
<a class="menu" href="listinoprezzi">Listino Prezzi</a>
<a class="menu" href="logout">Log out</a>

</div>
	</div>

</body>
</html>