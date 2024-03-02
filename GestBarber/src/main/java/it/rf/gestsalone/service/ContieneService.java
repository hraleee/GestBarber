package it.rf.gestsalone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Contiene;
import it.rf.gestsalone.model.Operatore;
import it.rf.gestsalone.repository.ContieneRepository;

@Service
public class ContieneService {

	@Autowired
	private ContieneRepository cR;


	public void salvaContiene(Contiene con) {



		this.cR.save(con);
	}



	public List<Contiene> findAll() {

		return this.cR.findAll();
	}


	public void terminapren(Integer idoperazione) {


		Optional<Contiene> c = this.cR.findById(idoperazione);

		if (c.isPresent()) {
			Contiene con = c.get();
			con.setStatoOperazioneContiene(true);

			this.cR.save(con);


		}
		
	}



		public Contiene trovacontiene(Integer con) {


         Optional<Contiene> c = this.cR.findById(con);
			
         if(c.isPresent())
  		{
  			Contiene contiene = c.get();
  			
  			
  			return contiene;
  		}
     	 else
     	 {
     		 return null;
     	 }
         
         
		}


		public void salvaCon(Contiene con) {
			
			this.cR.save(con);
		}



	
}
