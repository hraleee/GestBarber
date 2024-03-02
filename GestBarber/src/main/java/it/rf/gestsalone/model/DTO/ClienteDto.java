package it.rf.gestsalone.model.DTO;

import java.sql.Date;

public class ClienteDto {

	
	private Date DataPrenotazioneCliente;
	private Integer codPrenotazione;
	private String cfOp;
	private String nomeServizio;
	
	
	


	public ClienteDto(Integer codPrenotazione, Date DataPrenotazioneCliente, String nomeServizio, String cfOp) {
		super();
		
		this.DataPrenotazioneCliente = DataPrenotazioneCliente;
		this.codPrenotazione = codPrenotazione;
		this.cfOp = cfOp;
		this.nomeServizio = nomeServizio;
	}


	

	public Date getDataPrenotazioneCliente() {
		return DataPrenotazioneCliente;
	}


	public void setDataPrenotazioneCliente(Date dataPrenotazioneCliente) {
		DataPrenotazioneCliente = dataPrenotazioneCliente;
	}


	public Integer getCodPrenotazione() {
		return codPrenotazione;
	}


	public void setCodPrenotazione(Integer codPrenotazione) {
		this.codPrenotazione = codPrenotazione;
	}


	public String getCfOp() {
		return cfOp;
	}


	public void setCfOp(String cfOp) {
		this.cfOp = cfOp;
	}


	public String getNomeServizio() {
		return nomeServizio;
	}


	public void setNomeServizio(String nomeServizio) {
		this.nomeServizio = nomeServizio;
	}
	
	
	
	
	
	
	
	
}
