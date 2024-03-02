package it.rf.gestsalone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Cliente;
import it.rf.gestsalone.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository cR; //Repository

	public boolean salvaCliente(Cliente c, String cf) 
	{
		boolean trovato;

		Integer elementi=this.cR.countByCfCliente(cf);

		System.out.print(elementi);

		if(elementi.equals(0))
		{
			this.cR.save(c);
			trovato=true;
		}
		else
		{
			trovato=false;
		}
		return trovato;

	}



	public Optional<Cliente> RicercaCf(String cf) {

		Optional<Cliente> clienteTrovato=this.cR.findById(cf);

		return clienteTrovato;



	}



	public Optional<Cliente> RicModCliente(String cf) {

		Optional<Cliente> clienteTrovato=this.cR.findById(cf);

		return clienteTrovato;
	}



	public void ModificaCliente(Cliente c) {


		this.cR.save(c);

	}



	public  Optional<Cliente>  LoginCliente(String usernameImp, String passwordImp) {
		
		
		Optional<Cliente> lista=this.cR.findByUsernameClienteAndPasswordCliente(usernameImp, passwordImp);
		
		
		return lista;
		
		
	}



	public Optional<Cliente> findByCf(String cfCliente) 
	{
        return this.cR.findById(cfCliente);
    }   


}
