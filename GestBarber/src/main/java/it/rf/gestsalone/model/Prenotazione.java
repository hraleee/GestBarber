package it.rf.gestsalone.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="prenotazione")
public class Prenotazione {

	@Column
	private Date dataPrenotazione;
	
	@Column
	private Float costoTotalePrenotazione;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codPrenotazione;
	@Column
	private boolean statoPrenotazione;
	
	@ManyToOne(cascade= CascadeType.ALL)
	private Cliente cliente;

	@OneToMany(mappedBy = "prenotazione", cascade = CascadeType.ALL)
	private List<Contiene> listacontiene;

	
	
	
	
	
	
	public List<Contiene> getListacontiene() {
		return listacontiene;
	}

	public void setListacontiene(List<Contiene> listacontiene) {
		this.listacontiene = listacontiene;
	}
	
	

	

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public Float getCostoTotalePrenotazione() {
		return costoTotalePrenotazione;
	}

	public void setCostoTotalePrenotazione(Float costoTotalePrenotazione) {
		this.costoTotalePrenotazione = costoTotalePrenotazione;
	}


	public Integer getCodPrenotazione() {
		return codPrenotazione;
	}

	public void setCodPrenotazione(Integer codPrenotazione) {
		this.codPrenotazione = codPrenotazione;
	}

	public boolean isStatoPrenotazione() {
		return statoPrenotazione;
	}

	public void setStatoPrenotazione(boolean statoPrenotazione) {
		this.statoPrenotazione = statoPrenotazione;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	





}
