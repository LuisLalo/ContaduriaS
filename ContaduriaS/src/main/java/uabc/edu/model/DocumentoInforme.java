package uabc.edu.model;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="documentosinformes")
public class DocumentoInforme {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_informes")
	private Documento idInforme;	
	private int anio;
	private String mes;
	private int categoria;
	
	 
	
	public DocumentoInforme() {
		
	}

	

	public Documento getIdInforme() {
		return idInforme;
	}



	public void setIdInforme(Documento idInforme) {
		this.idInforme = idInforme;
	}



	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	

}
