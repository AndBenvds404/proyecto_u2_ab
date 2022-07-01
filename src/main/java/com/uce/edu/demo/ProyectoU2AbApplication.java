package com.uce.edu.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;


@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);


	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		//buscar
		LOG.info("Dato con JPA: "+this.iEstudianteJpaService.buscar(1727007)); 
		
		Estudiante e = new Estudiante();
		e.setCedula(1727009);
		e.setNombre("Pedro");
		e.setApellido("Picapiedra");
		e.setSemestre("octavo");
		e.setNumeroMaterias(4);
		e.setNumeroHorasSemanales(22);
		
		//insertar
//		this.iEstudianteJpaService.insertar(e);
		//actualizar
		e.setNombre("Pablo");
		this.iEstudianteJpaService.actualizar(e);
		//eliminar
		this.iEstudianteJpaService.eliminar(1727007);
		
		
		
		
	}

}
