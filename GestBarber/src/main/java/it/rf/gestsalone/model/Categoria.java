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
@Table(name="Categoria")
public class Categoria 
{
	@Column
	private String nomeCategoria;
	
    @Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCategoria;
    
    @OneToMany(mappedBy="categoria", cascade= CascadeType.ALL)
    private List<Operatore>listaOp;
    

    
    
    
	public String getNomeCategoria()
	{
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) 
	
	{
		this.nomeCategoria = nomeCategoria;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public List<Operatore> getListaOp() {
		return listaOp;
	}

	public void setListaOp(List<Operatore> listaOp) {
		this.listaOp = listaOp;
	}



	


}