
<%@page import="it.rf.gestsalone.model.DTO.ClienteDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Prenotazione in Corso</title>
    <link rel="stylesheet" type="text/css" href="stylepren.css">
</head>
<body>


<%
    String codiceFiscale = (String) session.getAttribute("codiceFiscale");
   if (codiceFiscale == null || codiceFiscale.isEmpty()) {
      
       response.sendRedirect("home");
   }
   
       %>


<% List<ClienteDto> listacliente = (List<ClienteDto>) request.getAttribute("listaCf"); %>

<div class="search-form">
<center><a class="menu" href="menuclienti">Home</a>
<a class="menu" href="logout">Log out</a></center>
<center><h2>Prenotazione in Corso</h2></center>
    <center> <input type=text value="Data Prenotazione" readonly>
     <input type=text value="Cod Prenotazione" readonly>
     <input type=text value="Nome Servizio" readonly>
     <input type=text value="Cliente servito da:" readonly><br></center>
  

    <% for (ClienteDto s : listacliente) { %>
       <center> <input type="text" value="<%= s.getDataPrenotazioneCliente() %>" readonly>
        <input type="text" value="<%= s.getCodPrenotazione() %>" readonly>
        <input type="text" value="<%= s.getNomeServizio() %>" readonly>
        <input type="text" value="<%= s.getCfOp() %>" readonly></center><br>
    <% } %>
</div>

</body>
</html>