package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.prueba.modelo.Propietario;
import com.uce.edu.demo.prueba.modelo.Vehiculo;
import com.uce.edu.demo.prueba.service.IPropietarioService;
import com.uce.edu.demo.prueba.service.IVehiculoService;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;


@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;	
	@Autowired
	private IPropietarioService iPropietarioService;
	
//	@Autowired
//	private IMatriculaGestorService iMatriculaGestorService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Persona p = new Persona();
		p.setApellido("Horseman");
		p.setCedula("0014");
		p.setNombre("Bojack");
		p.setGenero("M");
		//this.iPersonaJpaService.insertar(p);

		// 1 Typed
		Persona perTyped = this.iPersonaJpaService.buscarPorCedulaTyped("0014");
		LOG.info("Persona Typed: "+perTyped);
		
		// 2 NamedQuery
		Persona perNamed = this.iPersonaJpaService.buscarPorCedulaNamed("0014");
		LOG.info("Persona Named: "+ perNamed);
		
		// 3 TypedNamed
		Persona perTypedNamed= this.iPersonaJpaService.buscarPorCedulaTypedNamed("0014");
		LOG.info("Persona TypedNamed: "+ perTypedNamed);

		// 4 Varios NAmedQuery
		
		List<Persona> listaPersona= this.iPersonaJpaService.buscarPorNombreApellido("Franchesco","Virgolini" );
		
		for(Persona item: listaPersona) {
			LOG.info("lista de personas: "+ item);
		}
		
		
	}

}
