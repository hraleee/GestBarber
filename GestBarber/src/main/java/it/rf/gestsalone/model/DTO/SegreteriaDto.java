package it.rf.gestsalone.model.DTO;

public class SegreteriaDto {

	private Integer codPrenotazione;

	private String nomeCliente;

	private String cognomeCliente;
	
	private Integer idOperazione;
	
	private String nomeServizio;

	private String cfOp;
	
	public String getCognomeCliente() {
		return cognomeCliente;
	}

	public void setCognomeCliente(String cognomeCliente) {
		this.cognomeCliente = cognomeCliente;
	}
	

	public Integer getCodPrenotazione() {
		return codPrenotazione;
	}

	public void setCodPrenotazione(Integer codPrenotazione) {
		this.codPrenotazione = codPrenotazione;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	
	
	public Integer getIdOperazione() {
		return idOperazione;
	}

	public void setIdOperazione(Integer idOperazione) {
		this.idOperazione = idOperazione;
	}

	public String getNomeServizio() {
		return nomeServizio;
	}

	public void setNomeServizio(String nomeServizio) {
		this.nomeServizio = nomeServizio;
	}

	public SegreteriaDto(Integer codPrenotazione, String nomeCliente, String cognomeCliente, Integer idOperazione,
			String nomeServizio, String cfOp) {
		super();
		this.codPrenotazione = codPrenotazione;
		this.nomeCliente = nomeCliente;
		this.cognomeCliente = cognomeCliente;
		this.idOperazione = idOperazione;
		this.nomeServizio = nomeServizio;
		this.cfOp= cfOp;
	}

	public String getCfOp() {
		return cfOp;
	}

	public void setCfOp(String cfOp) {
		this.cfOp = cfOp;
	}

	
	

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
