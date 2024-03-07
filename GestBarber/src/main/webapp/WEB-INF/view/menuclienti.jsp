<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clienti</title>
<link rel="stylesheet" href="menuclienti.css">
</head>
<body>



	<div id="container">
		<%
            String codiceFiscale = (String) session.getAttribute("codiceFiscale");
            if (codiceFiscale == null || codiceFiscale.isEmpty()) {
                response.sendRedirect("home");
            }
        %>

		<h2>Menu cliente</h2>
		<div id="menu">
			<a class="menu" href="home">Home</a> 
			<a class="menu" href="prenotazionieseguite">Prenotazioni Eseguite</a> 
			<a class="menu" href="prenotazioniincorso">Prenotazioni in Corso</a> 
				<a class="menu" href="prenotazionecliente">Prenota</a> 
				<a class="menu" href="logout">Log out</a>
			
		</div>
	</div>
</body>
</html>
</html>