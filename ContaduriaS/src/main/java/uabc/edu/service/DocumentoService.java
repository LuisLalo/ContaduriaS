package uabc.edu.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import uabc.edu.model.Documento;


public interface DocumentoService {
	
	List<Documento> buscarTodos();

	Documento BuscarDocumento(String nombre);
			
	List<Documento>BuscarDocumentoVentanaOrdenarporOrden(int id,Sort sort);
	
	List<Documento> BuscarDocumentosPorNombre(String nombre);

}
