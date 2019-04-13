package uabc.edu.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import uabc.edu.model.Documento;
import uabc.edu.repository.DocumentoRepository;

@Service
public class DocumentoServiceImpl implements DocumentoService {
	
	@Autowired
	private DocumentoRepository documentoRepository;

	@Override
	public List<Documento> buscarTodos() {
		List<Documento> lista =	documentoRepository.findAll();	
				
				return lista;
	}

	@Override
	public Documento BuscarDocumento(String nombre) {
		Documento doc= documentoRepository.findByNombre(nombre);
		return doc;
	}
 
	@Override
	public List<Documento> BuscarDocumentoVentanaOrdenarporOrden(int id, Sort id2) {
		List<Integer> ids= new LinkedList<Integer>();
		ids.add(id);
	Iterable<Documento> it =documentoRepository.findAllByIdventanaOrderByOrden(ids, id2);
		
		
	List<Documento> lista=new ArrayList<Documento>();
		
	for(Documento doc: it) {
		System.out.println(doc);
	lista.add(doc);
	}
	
	
	return lista;
	}

	@Override
	public List<Documento> BuscarDocumentosPorNombre(String nombre) {
		List<Documento> lista=new ArrayList<Documento>();
		
		lista= documentoRepository.findByNombreContaining(nombre);
				return lista;
	}

}
