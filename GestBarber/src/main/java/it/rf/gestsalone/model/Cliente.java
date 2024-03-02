package it.rf.gestsalone.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Column
	private String nomeCliente;
	@Column
	private String cognomeCliente;
	@Column
	@Id 
	private String cfCliente;

	@Column
	private Boolean abilitatoCliente;

	@Column
	private String telefonoCliente;


	@Column
	private String passwordCliente;

	@Column
	private String usernameCliente;


	public String getPasswordCliente() {
		return passwordCliente;
	}

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Prenotazione> listap;



	public void setPasswordCliente(String passwordCliente) {
		this.passwordCliente = passwordCliente;
	}







	public List<Prenotazione> getListap() {
		return listap;
	}







	public void setListap(List<Prenotazione> listap) {
		this.listap = listap;
	}







	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getCognomeCliente() {
		return cognomeCliente;
	}



	public void setCognomeCliente(String cognomeCliente) {
		this.cognomeCliente = cognomeCliente;
	}



	public String getCfCliente() {
		return cfCliente;
	}



	public void setCfCliente(String cfCliente) {
		this.cfCliente = cfCliente;
	}



	public Boolean getAbilitatoCliente() {
		return abilitatoCliente;
	}



	public void setAbilitatoCliente(Boolean abilitatoCliente) {
		this.abilitatoCliente = abilitatoCliente;
	}



	public String getTelefonoCliente() {
		return telefonoCliente;
	}



	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	
	
	public String getUsernameCliente() {
		return usernameCliente;
	}



	public void setUsernameCliente(String usernameCliente) {
		this.usernameCliente = usernameCliente;
	}







}
