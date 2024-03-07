package it.rf.gestsalone.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import it.rf.gestsalone.model.Contiene;
import it.rf.gestsalone.model.Prenotazione;
import it.rf.gestsalone.model.DTO.ClienteDto;
import it.rf.gestsalone.model.DTO.SegreteriaDto;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer>{

    
	 @Query("SELECT NEW it.rf.gestsalone.model.DTO.SegreteriaDto (p.codPrenotazione, c.nomeCliente, c.cognomeCliente, con.idOperazione, s.nomeServizio, o.cfOp) FROM Cliente c JOIN c.listap p JOIN p.listacontiene con JOIN con.servizio s JOIN con.operatore o WHERE con.statoOperazioneContiene = false AND CAST(con.DataPrenotazioneCliente AS DATE) = CAST(:date AS DATE)")
	    List<SegreteriaDto> QuerySpecial(@Param("date") Date date);

	 @Query("SELECT NEW it.rf.gestsalone.model.DTO.ClienteDto (p.codPrenotazione, con.DataPrenotazioneCliente, s.nomeServizio, o.cfOp) FROM Cliente c JOIN c.listap p JOIN p.listacontiene con JOIN con.servizio s JOIN con.operatore o WHERE con.statoOperazioneContiene = true AND c.cfCliente  = :cf ")
	    List<ClienteDto> QueryPrenotazioneCliente(String cf);

	 @Query("SELECT NEW it.rf.gestsalone.model.DTO.ClienteDto (p.codPrenotazione, con.DataPrenotazioneCliente, s.nomeServizio, o.cfOp) FROM Cliente c JOIN c.listap p JOIN p.listacontiene con JOIN con.servizio s JOIN con.operatore o WHERE con.statoOperazioneContiene = false AND c.cfCliente  = :cf ")
	    List<ClienteDto> QueryPrenotazioneInCorsoCliente(String cf);
	 

}