
<%@page import="it.rf.gestsalone.model.Operatore"%>
<%@page import="it.rf.gestsalone.model.DTO.SegreteriaDto"%>
<%@page import="it.rf.gestsalone.model.Prenotazione"%>
<%@page import="it.rf.gestsalone.model.Contiene"%>
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




<h1>
			Prenotazione del giorno:
			<script type="text/javascript">
                var data = new Date();
                var gg = data.getDate() + "/";
                var mm = data.getMonth() + 1 + "/";
                var aaaa = data.getFullYear();
                document.write(gg + mm + aaaa);
            </script>
		</h1>



                           <input type=text value="Nome Cliente" readonly>
                             <input type=text value="Cognome Cliente" readonly>
                             <input type=text value="Cod Prenotazione" readonly>
                             <input type=text value="Cod Operazione" readonly>
                             <input type=text value="Servizio" readonly>
                             <input type=text value="Operatore" readonly><br>

<%
List <SegreteriaDto> listap = (List<SegreteriaDto>)request.getAttribute("listap");
List <Operatore> listaoperatore = (List<Operatore>) request.getAttribute("listaoperazione");

        if (listap != null) {
            for (SegreteriaDto s : listap) {  %>

                <form action="termina" method="POST">
                           
            	
       
		<%Integer val= s.getIdOperazione() ;%>
		
       <input type=text value=<%=s.getNomeCliente() %> readonly>
		<input type=text value=<%=s.getCognomeCliente() %> readonly>	
		<input type=text value=<%=s.getCodPrenotazione() %>	readonly>	
		<input type=text name=valid value=<%=val %>  >		
		<input type=text value=<%=s.getNomeServizio() %> readonly>
		<input type=text value=<%=s.getCfOp() %> readonly>

		<input type=submit  value=termina>	
		 </form>
		
     <form action="assegnaop" method="POST"> 
   
   <center>Seleziona l'Operatore</center>
   <center><select name="cfOp" >
   <%
   
    if (listaoperatore != null) {
        for (Operatore op : listaoperatore) {
    %>
             
              <option value=<%=op.getCfOp() %>><%=op.getNomeOp() %></option>
                
               
               
           
             
            
   <%
        }
    }
   
    %>
   </select></center>  
    <%Integer idOp = s.getIdOperazione() ;%>
    <center><input type=submit value="Assegna"></center> 
    <input type=hidden name=idOp value=<%=val %>  >	
    
    </form>
		
		<br>
		 	
		<%	
            }%>
           
       <% }
        %>
		

		
		
     
  










</body>
</html>