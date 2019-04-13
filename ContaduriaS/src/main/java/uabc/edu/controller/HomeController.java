package uabc.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uabc.edu.model.Documento;
import uabc.edu.service.DocumentoService;

@Controller
public class HomeController {
	
	@Autowired
	private DocumentoService documentoService;
	
	@GetMapping(value = "/")
	public String mostrarPrincipal(Model modelo) {

		return "home";
	}

	@GetMapping(value = "oficios")
	public String mostrarOficios(@RequestParam String idParam1, Model modelo) {
		System.out.println("Si entro al metodo oficios");
		int id = Integer.parseInt(idParam1);
		
		List<Documento> listadocs = documentoService.BuscarDocumentoVentanaOrdenarporOrden(id, Sort.by("orden").descending());
		
		return "oficios";
	}
}
