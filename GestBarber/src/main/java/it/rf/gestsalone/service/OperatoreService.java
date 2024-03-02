package it.rf.gestsalone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Categoria;
import it.rf.gestsalone.model.Operatore;
import it.rf.gestsalone.repository.OperatoreRepository;


@Service
public class OperatoreService {

	
	@Autowired
	private OperatoreRepository cR; //Repository
	
	
	public Boolean salvaOperatore(Operatore op, Categoria cate) {
		
		boolean trovato=false;
		
		Integer cfNum=this.cR.countByCfOp(op.getCfOp());
		
		
		if(cfNum.equals(0))
		{
			trovato=true;
			op.setCategoria(cate);
			this.cR.save(op);
			
		}
		else
		{
			trovato=false;
		}
		
		
		return trovato;
	}
	
	
     public Optional<Operatore> ricercaOperatore(String cfImp) {
    	 
    	     Optional<Operatore> c = this.cR.findById(cfImp);
    	 
    	 
    	 return  c;
     }
     
     
     
     
     public Optional<Operatore> trovaCfOperatore(String cf) {
    	 
    	 
    	 
    	 
    	 return this.cR.findById(cf);
     }

     
     public boolean saveOp(Operatore o) {
    	 
    	 
    	 boolean trovato=false;
    	 
    	this.cR.save(o);
    	 
    		 trovato=true;
    	
  
    	 
    	 return trovato;
     }
     
     public Optional<Operatore> loginOp(String usernameRic, String passwordRic){
    	 
    	 
    	 return this.cR.findByOpUsernameAndOpPassword(usernameRic, passwordRic);
    	 
     }
     
     
     public List<Operatore> listaop(){
		
    	
    	 
    	 
    	 return  this.cR.trovaOperatore();
    	 
    	 
     }
     
     
     
     
     public Operatore trovaOp(String cfImp) {
    	 
    	 Optional<Operatore> op = this.cR.findById(cfImp);
    	 
    	 if(op.isPresent())
 		{
 			Operatore operatore = op.get();
 			
 			
 			return operatore;
 		}
    	 else
    	 {
    		 return null;
    	 }
    	 
    	 
    	 
     }
}
