package it.rf.gestsalone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Categoria;
import it.rf.gestsalone.repository.CategoriaRepository;


@Service
public class CategoriaService {

	
	
	@Autowired
	private CategoriaRepository cR; //Repository

	public Optional<Categoria> findByIdCategoria(Integer idCategoria) {
		
		
		return cR.findById(idCategoria);
	}

	

	
	
	
	
	
	
	
	
	
	
	
}
