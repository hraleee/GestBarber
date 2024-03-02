package it.rf.gestsalone.model;


import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contiene")
public class Contiene {


	@Column
	private boolean statoOperazioneContiene;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idOperazione;

	@Column
	private Date DataPrenotazioneCliente;

	@ManyToOne(cascade= CascadeType.ALL)
	private Prenotazione prenotazione;

	@ManyToOne(cascade= CascadeType.ALL)
	private Servizio servizio;

	@ManyToOne(cascade= CascadeType.ALL)
	private Operatore operatore;

	



/////////////////////////////////////////////////////////////////////////////////////////////////////////


	public boolean GetStatoOperazioneContiene() {
		return statoOperazioneContiene;
	}

	public void setStatoOperazioneContiene(boolean statoOperazioneContiene) {
		this.statoOperazioneContiene = statoOperazioneContiene;
	}

	public Integer getIdOperazione() {
		return idOperazione;
	}

	public void setIdOperazione(Integer idOperazione) {
		this.idOperazione = idOperazione;
	}

	public Date getDataPrenotazioneCliente() {
		return DataPrenotazioneCliente;
	}

	public void setDataPrenotazioneCliente(Date dataPrenotazioneCliente) {
		DataPrenotazioneCliente = dataPrenotazioneCliente;
	}

	public Prenotazione getPrenotazione() {
		return prenotazione;
	}

	public void setPrenotazione(Prenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}

	public Servizio getServizio() {
		return servizio;
	}

	public void setServizio(Servizio servizio) {
		this.servizio = servizio;
	}

	public Operatore getOperatore() {
		return operatore;
	}

	public void setOperatore(Operatore operatore) {
		this.operatore = operatore;
	}




}
