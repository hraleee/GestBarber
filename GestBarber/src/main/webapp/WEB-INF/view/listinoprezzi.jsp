<%@page import="java.util.List"%>
<%@page import="it.rf.gestsalone.model.Servizio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listino Prezzi</title>
 <link rel="stylesheet" type="text/css" href="stylepren.css">
</head>
<body>

<%
    String cfOperatore = (String) session.getAttribute("cfOperatore");
   if (cfOperatore == null || cfOperatore.isEmpty()) {
      
       response.sendRedirect("home");
   }
   
       %>

<div class="search-form">
<center><h1>Lista Servizi</h1></center>

<center><a class="menu" href="menusegreteria">Home</a>
<a class="menu" href="logout">Log out</a></center><br>

   <center> <input type=text value="Nome Servizio">
    <input type=text value="Costo Servizio">
    <input type=text value="Durata Servizio">
    <input type=text value="Codice Servizio"></center><br>

    <%  List <Servizio> list = (List <Servizio>) request.getAttribute("listaServ"); %>
    
    
    
    
    <%for(Servizio s: list) { %>

    
  <center><input type=text value=<%=s.getNomeServizio() %>>
    <input type=text value=<%=s.getCostoServizio() %>>
    <input type=text value=<%=s.getDurataServizio() %>>
    <input type=text value=<%=s.getId() %>></center><br>
    <% } %>

</div>


</body>
</html>