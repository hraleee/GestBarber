<%@page import="it.rf.gestsalone.model.Servizio"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="prenotazione.css">
<meta charset="ISO-8859-1">
<title>Prenotazione</title>

<script>
        function calculateTotal() {
            var checkboxes = document.getElementsByName("servizio");
            var total = 0;

            checkboxes.forEach(function (checkbox) {
                if (checkbox.checked) {
                    var cost = parseFloat(checkbox.getAttribute("data-cost"));
                    total += cost;
                }
            });

            document.getElementById("totalDisplay").innerText = "Total: " + total.toFixed(2);
            document.getElementById("totalCost").value = total.toFixed(2);
        }
    </script>
</head>
<body>





	<form action="Contiene" method="POST">
		<center>
			<a class="menu" href="home">Home</a>
		</center>
		<center>
			<a class="menu" href="logout">Log out</a>
		</center>
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

		<%
    String codiceFiscale = (String) session.getAttribute("codiceFiscale");
   if (codiceFiscale == null || codiceFiscale.isEmpty()) {
      
       response.sendRedirect("home");
   }
   
       %>



		<input type="hidden" name="cfCliente"
			value=${sessionScope.codiceFiscale} ><br> <label
			for="dataPrenotazione">Data Prenotazione:</label> <input type="date"
			id="dataPrenotazione" name="dataPrenotazione" required>


		<%
        List<Servizio> l = (List<Servizio>) request.getAttribute("servizio");

        if (l != null) {
            for (Servizio s : l) {
        %>
		<div class="service">

			<label>Servizio: </label><span><%=s.getNomeServizio()%></span> <label>Durata:
			</label><span><%=s.getDurataServizio()%> m </span> <label>Prezzo: </label><span><%=s.getCostoServizio()%>
			</span>euro <input type="checkbox" <%=s.getId()%>" name="servizio"
				value="<%=s.getId()%>" data-cost="<%=s.getCostoServizio()%>"
				onclick="calculateTotal()"><br>

		</div>
		<%
            }
        }
        %>

		<center>
			<div id="totalDisplay"></div>
		</center>
		<input type="hidden" id="totalCost" name="totalCost" value="0">
		<input type="submit" value="Prenota">
	</form>
</body>
</html>