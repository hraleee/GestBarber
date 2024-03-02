package it.rf.gestsalone.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="servizio")
public class Servizio {

	@Column
	private Float costoServizio;
	@Column
	private Integer durataServizio;
	@Column
	private String nomeServizio;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;


	@OneToMany(mappedBy = "servizio", cascade = CascadeType.ALL)
	private List<Contiene> listaservizio;

	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Float getCostoServizio() {
		return costoServizio;
	}
	public void setCostoServizio(Float costoServizio) {
		this.costoServizio = costoServizio;
	}
	public Integer getDurataServizio() {
		return durataServizio;
	}
	public void setDurataServizio(Integer durataServizio) {
		this.durataServizio = durataServizio;
	}
	public String getNomeServizio() {
		return nomeServizio;
	}
	public void setNomeServizio(String nomeServizio) {
		this.nomeServizio = nomeServizio;
	}
	public List<Contiene> getListaservizio() {
		return listaservizio;
	}
	public void setListaservizio(List<Contiene> listaservizio) {
		this.listaservizio = listaservizio;
	}
	



}
