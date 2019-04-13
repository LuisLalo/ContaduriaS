package uabc.edu.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uabc.edu.model.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Serializable> {
	
	public Documento findByNombre(String nombre);
	public Iterable<Documento>findAllByIdventanaOrderByOrden(Iterable<Integer> id,Sort id2);
	public List<Documento>findByNombreContaining(String nombre);


}
