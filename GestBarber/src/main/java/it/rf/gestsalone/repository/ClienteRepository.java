package it.rf.gestsalone.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.rf.gestsalone.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{

	
     
	public Integer countByCfCliente(String cf);
	
	
	public Optional<Cliente> findByUsernameClienteAndPasswordCliente(String usernameImp, String passwordImp);


	
	
	
	
	
}
