<%@page import="it.rf.gestsalone.model.Operatore"%>
<%@page import="it.rf.gestsalone.model.DTO.SegreteriaDto"%>
<%@page import="it.rf.gestsalone.model.Prenotazione"%>
<%@page import="it.rf.gestsalone.model.Contiene"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Prenotazioni</title>
    <link rel="stylesheet" type="text/css" href="prensegretaria.css">
</head>
<body>


<div class="search-form">







 <table>

<tr><td></td><td colspan=4 style="text-align: center;"><h1>
    Prenotazione del giorno:
    <script type="text/javascript">
        var data = new Date();
        var gg = data.getDate() + "/";
        var mm = data.getMonth() + 1 + "/";
        var aaaa = data.getFullYear();
        document.write(gg + mm + aaaa);
    </script>
</h1></td></tr>

<tr> <td></td><td></td><td colspan=2 style="text-align: center;"><a class="menu" href="menusegreteria">Home</a>
<a class="menu" href="logout">Log out</a></td></tr>

<%
List<SegreteriaDto> listap = (List<SegreteriaDto>) request.getAttribute("listap");
List<Operatore> listaoperatore = (List<Operatore>) request.getAttribute("listaoperazione");

if (listap != null) {
    for (SegreteriaDto s : listap) {
        %>



        <form action="termina" method="POST">

            <%
            Integer val = s.getIdOperazione();
            %>
           <tr> <td></td><td></td><td colspan=2 style="text-align: center;"> <h2>Prenotazione</h2> </td></tr>
            <tr>
            
  <td><input type="text" value="Nome Cliente" readonly> </td>
<td> <input type="text" value="Cognome Cliente" readonly></td>
 <td><input type="text" value="Cod Prenotazione" readonly></td>
<td> <input type="text" value="Cod Operazione" readonly></td>
<td> <input type="text" value="Servizio" readonly></td>
<td> <input type="text" value="Operatore" readonly></td>
</tr>
            
            
            
            
            
<tr>
              <td><input type="text" value=<%=s.getNomeCliente() %> readonly></td>
              <td><input type="text" value=<%=s.getCognomeCliente() %> readonly></td>
              <td><input type="text" value=<%=s.getCodPrenotazione() %> readonly></td>
              <td><input type="text" name="valid" value=<%=val %> readonly></td>
              <td><input type="text" value=<%=s.getNomeServizio() %> readonly></td>
              <td><input type="text" value=<%=s.getCfOp() %> readonly></td>

          <tr> <td></td><td></td><td colspan=2> <input type="submit" value="termina" class=termin></center>  </td> </tr>
        </form>
</tr>
        <form action="assegnaop" method="POST">

           <tr>  <td></td><td></td> <td colspan=2 style="text-align: center;"><h2>Seleziona l'Operatore</h2></td></tr>
        <tr>  <td></td><td></td>  <td colspan=2 style="text-align: center;"> <select name="cfOp">
                <%
                if (listaoperatore != null) {
                    for (Operatore op : listaoperatore) {
                        %>

                        <option value="segreteria">Segreteria</option>
                        <option value=<%=op.getCfOp() %>><%=op.getNomeOp() %></option>

                        <%
                    }
                }
                %>
            </select> </td> </tr>
            <% Integer idOp = s.getIdOperazione(); %>
            <tr> <td></td><td></td><td colspan=2 style="text-align: center;"> <input type="submit" value="Assegna" class=assegna> </tr> <tr>
            <input type="hidden" name="idOp" value=<%=val %>  >

        </form>

        <br>

        <%
    }
}
%>
</table>
</div>
</body>
</html>