<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<form action="ricercaPerCfOp" method="POST">

Codice Fiscale:<input type=text name=cfDaRic placeholder="Inserisci il codice fiscale">
<input type=submit value="Ricerca">






</form>




<form action="modificaCfOperatore" method="POST">

Nome:<input type="text" name=nuovoNome value="${nomevalore}"><br>

      Cognome: <input type="text" name=nuovoCognome value="${cognomevalore}"><br>


    Codice Fiscale:<input type="text" name=nuovoCf value="${cfvalore}" readonly><br>
  

 
       Username:<input type="text" name=nuovoUsername value="${usernamevalore}"><br>
    

 
     Password:<input type="text" name=nuovaPassword value="${passwordvalore}"><br>
     
      <input type="hidden" name=nuovoAbil value="${abilitatovalore}" readonly>
     
          Categoria:
            <select name="categoria" >        
                 <option value="1">Admin</option>
                <option value="2">Segretaria</option>
                <option value="3">Operatore</option>
               
            </select><br>
     <input type=submit value="Modifica">
  
</form>

</body>
</html>