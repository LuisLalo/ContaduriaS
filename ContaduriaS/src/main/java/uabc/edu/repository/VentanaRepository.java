package uabc.edu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uabc.edu.model.Ventana;

@Repository
public interface VentanaRepository extends JpaRepository<Ventana, Serializable> {

}
