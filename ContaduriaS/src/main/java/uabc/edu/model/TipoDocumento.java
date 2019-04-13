package uabc.edu.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipodocumento")
public class TipoDocumento {
	
	@Id
	@Column(name="id_tipo_documento")
	private int idtipoDocumento;
	private String icono;
	private String documento;
	
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "TipoDocumento")
	    private Set<TipoDocumento> documentos = new HashSet<TipoDocumento>();
		
	
	public TipoDocumento(){
		
	}

	public int getIdtipoDocumento() {
		return idtipoDocumento;
	}

	public void setIdtipoDocumento(int idtipoDocumento) {
		this.idtipoDocumento = idtipoDocumento;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	

	

	

}
