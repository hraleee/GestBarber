package it.rf.gestsalone.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Operatore")
public class Operatore 
{

	
	@Column
	private String nomeOp;
	
	@Column
	private String cognomeOp;
	
	@Id
	@Column
	private String cfOp;
	
	@Column
	private Boolean opAbilitato;
	
	@Column
	private String opUsername;
	
	@Column
	private String opPassword;
	
	
	
	@ManyToOne(cascade= CascadeType.ALL)
	private Categoria categoria;
	
	
	@OneToMany(mappedBy = "operatore", cascade = CascadeType.ALL)
	private List<Contiene> listaContiene;


	public String getNomeOp() {
		return nomeOp;
	}


	public void setNomeOp(String nomeOp) {
		this.nomeOp = nomeOp;
	}


	public String getCognomeOp() {
		return cognomeOp;
	}


	public void setCognomeOp(String cognomeOp) {
		this.cognomeOp = cognomeOp;
	}


	public String getCfOp() {
		return cfOp;
	}


	public void setCfOp(String cfOp) {
		this.cfOp = cfOp;
	}


	public Boolean getOpAbilitato() {
		return opAbilitato;
	}


	public void setOpAbilitato(Boolean opAbilitato) {
		this.opAbilitato = opAbilitato;
	}


	public String getOpUsername() {
		return opUsername;
	}


	public void setOpUsername(String opUsername) {
		this.opUsername = opUsername;
	}


	public String getOpPassword() {
		return opPassword;
	}


	public void setOpPassword(String opPassword) {
		this.opPassword = opPassword;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public List<Contiene> getListaop() {
		return listaContiene;
	}


	public void setListaop(List<Contiene> listaContiene) {
		this.listaContiene = listaContiene;
	}


	
	
	
	
	
	
	
	
	
	

	

	
	
	
}