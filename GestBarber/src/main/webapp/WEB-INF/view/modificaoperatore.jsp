<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="modifica.css">
</head>
<body>




<div class="modify-form">
 <center> <a class="menu" href="gestioneoperatori">Home</a>  </center>
<form action="ricercaPerCfOp" method="POST">
<center><h1>Modifica Operatore</h1></center>
Codice Fiscale:<input type=text name=cfDaRic placeholder="Inserisci il codice fiscale">
<input type=submit value="Ricerca">






</form>




<form action="modificaCfOperatore" method="POST">

Nome:<input type="text" name=nuovoNome value="${nomevalore}"><br>

      Cognome: <input type="text" name=nuovoCognome value="${cognomevalore}"><br>


    Codice Fiscale:<input type="text" name=nuovoCf value="${cfvalore}" readonly><br>
  

 
       Username:<input type="text" name=nuovoUsername value="${usernamevalore}"><br>
    

 
     Password:<input type="text" name=nuovaPassword value="${passwordvalore}"><br>
     
      
     
          Categoria:
            <select name="categoria" >        
                 <option value="1">Admin</option>
                <option value="2">Segretaria</option>
                <option value="3">Operatore</option>
               
            </select><br>
            
          Abilita:
            <select name="abilita" >        
                 <option value="1">Abilitato</option>  
                  <option value="0">Non abilitato</option>  
            </select><br>
            
     <input type=submit value="Modifica">
  
  
           ${modifica}
</form>
</div>
</body>
</html>