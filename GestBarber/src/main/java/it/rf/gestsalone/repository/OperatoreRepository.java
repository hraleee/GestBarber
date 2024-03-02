package it.rf.gestsalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.rf.gestsalone.model.Categoria;
import it.rf.gestsalone.model.Operatore;
import it.rf.gestsalone.model.DTO.SegreteriaDto;

import java.sql.Date;
import java.util.List;
import java.util.Optional;


@Repository
public interface OperatoreRepository  extends JpaRepository<Operatore, String>{

	
	public Integer countByCfOp(String cfOp);
	
	public  Optional<Operatore> findByOpUsernameAndOpPassword(String opUsername, String opPassword);
   
	@Query("SELECT op FROM Operatore op JOIN op.categoria cat WHERE cat.id= 3 AND op.opAbilitato = true")
     public List<Operatore> trovaOperatore();
	
}
