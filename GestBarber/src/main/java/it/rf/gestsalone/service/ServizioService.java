package it.rf.gestsalone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Servizio;
import it.rf.gestsalone.repository.OperatoreRepository;
import it.rf.gestsalone.repository.ServizioRepository;

@Service
public class ServizioService {

	@Autowired
	private ServizioRepository cR;
	
	
	public List<Servizio> findall() {
		
		return this.cR.findAll();
	}
	
	
	
	public void SalvaServizio(Servizio s) {
		
		boolean trovato=true;
		
		this.cR.save(s);
		
		
	}
	
    public List<Servizio> trovaListaServizio(String nomeServizio)
    {
    	
    	
    	
    	return this.cR.findAll();
    }
	
	
	
	
	
	
	
}
