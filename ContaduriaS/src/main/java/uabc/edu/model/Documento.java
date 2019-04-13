package uabc.edu.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="documentos")
public class Documento {
	@Column(name="id_documento")
	private int iddocumento;
	private String nombre;
	private String liga;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn( name="id_ventana", nullable=false)
	private Ventana idventana;
	
	private int orden;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn( name="id_tipo_documento", nullable=false)
	private TipoDocumento idtipodocumento;
	

	private int idinformes;
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "TipoDocumento")
	 @JoinColumn(name="idinformes")
	 private Set<DocumentoInforme> documentosInformes = new HashSet<DocumentoInforme>();

	public Documento() {
		
	}

	public int getIddocumento() {
		return iddocumento;
	}

	public void setIddocumento(int iddocumento) {
		this.iddocumento = iddocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLiga() {
		return liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

	public Ventana getIdventana() {
		return idventana;
	}

	public void setIdventana(Ventana idventana) {
		this.idventana = idventana;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	

	public TipoDocumento getIdtipodocumento() {
		return idtipodocumento;
	}

	public void setIdtipodocumento(TipoDocumento idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}

	public int getIdinformes() {
		return idinformes;
	}

	public void setIdinformes(int idinformes) {
		this.idinformes = idinformes;
	}

	
	
	

}
