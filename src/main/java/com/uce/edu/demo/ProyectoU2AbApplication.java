package com.uce.edu.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJdbcService;
import com.uce.edu.demo.estudiante.to.Estudiante;
import com.uce.edu.demo.repository.IPersonaJdbcRepository;
import com.uce.edu.demo.repository.IPersonaJpaRepository;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);


	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		//buscar
		LOG.info("Dato con JPA: "+this.iPersonaJpaService.buscarPorId(1727)); 
		//insertar
		Persona p = new Persona();
		p.setId(4);
		p.setNombre("FrancHesco");
		p.setApellido("Virgolini");
		//this.iPersonaJpaService.insertar(p);
		//actualizar
		p.setNombre("Francesco");
		this.iPersonaJpaService.actualizar(p);
		//eliminar
		this.iPersonaJpaService.eliminar(2);
		
		
		
		
	}

}
