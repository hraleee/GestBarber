<%@page import="java.util.List"%>
<%@page import="it.rf.gestsalone.model.Servizio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>modifica servizio</title>
<link rel="stylesheet" type="text/css" href="modificaservizio.css">
</head>
<body>





<div class="search-form">
   <center> <h1>${modifica}</h1></center>
    <%  List <Servizio> list = (List <Servizio>) request.getAttribute("listaServ"); %>
    
    
    <table style="margin: 0 auto;">
    <tr> <td></td><td colspan=2 style="text-align: center;"><h1>Modifica Servizio</h1>     </td></tr>
    <tr> <td></td><td colspan=2 style="text-align: center;"><a class="menu" href="gestioneservizio">Home</a></td></tr>
   
    <%for(Servizio s: list) { %>
<form action="ServizioMod" method="POST">
    
  <tr> 
  <td>  <input type=text value="Nome Servizio"> </td>
   <td>   <input type=text value="Costo Servizio"> </td>
     <td>   <input type=text value="Durata Servizio"> </td>
     <td>    <input type=text value="Codice Servizio"> </td>
      </tr>
    
 <tr> 
 <tr>
 <td> <input type=text name="nomeServizio" value=<%=s.getNomeServizio() %>> </td>
  <td> <input type=text name="costoServizio" value=<%=s.getCostoServizio() %>> </td>
   <td> <input type=text name="durataServizio" value=<%=s.getDurataServizio() %>> </td>
  <td>  <input type=text name="idServizio" value=<%=s.getId() %> readonly> </td>
   </tr>
   <tr> <td></td> <td colspan=2> <input type=submit value="Modifica" class="modifica"></td> </tr>
   
   
   
    </form>
    <% } %>
     

</table>
   </div> 


</body>
</html>