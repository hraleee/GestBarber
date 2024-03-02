<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Inserisci il servizio</h1>

<form action="servizioinserisci" method="POST">

Nome:<input type=text name="nomeServizio" placeholder="Inserisci il nome del servizio" request>
Costo:<input type=text name="costoServizio" placeholder="Inserisci il costo del servizio" request>
Durata:<input type=text name="durataServizio" placeholder="Inserisci la durata del servizio" request>
<input type=submit name="Invia">
${esitoServizio}

</form>









</body>
</html>