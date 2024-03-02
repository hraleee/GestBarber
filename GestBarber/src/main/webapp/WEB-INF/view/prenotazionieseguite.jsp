<%@page import="it.rf.gestsalone.model.DTO.ClienteDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




  <%  List <ClienteDto> listacliente = (List <ClienteDto>)request.getAttribute("listaCf"); %>
     
     <input type=text value="Data Prenotazione">
     <input type=text value="Cod Prenotazione">
     <input type=text value="Nome Servizio">
     <input type=text value="Cliente servito da:"><br>
  


    <%for(ClienteDto s: listacliente) {%>
     <input type=text value=<%=s.getDataPrenotazioneCliente() %> readonly>
      <input type=text value=<%=s.getCodPrenotazione() %> readonly>
      <input type=text value=<%= s.getNomeServizio() %> readonly>
      <input type=text value=<%=s.getCfOp() %> readonly><br>
    
<%} %>



</body>
</html>