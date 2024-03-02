package it.rf.gestsalone.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Prenotazione;
import it.rf.gestsalone.model.DTO.ClienteDto;
import it.rf.gestsalone.model.DTO.SegreteriaDto;
import it.rf.gestsalone.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {

	
	
	@Autowired
	private PrenotazioneRepository cR;
	
	
	
	public void salvaPren(Prenotazione p) {
		
		this.cR.save(p);
	}
	
	
	public  List <SegreteriaDto> listaPrenotazione(Date date){
		
	
		
		
		return this.cR.QuerySpecial(date);
		
		  
		
		
		
	}
	
	
	public List <ClienteDto> prenotazioneClienteEsegeuita(String cf){
		
		System.out.print("---------------------------------------------------------------------");
		System.out.print(cf);
		
		return this.cR.QueryPrenotazioneCliente(cf);
		
	}
	
}
