package com.uce.edu.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;

@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		Persona persona = new Persona();
		persona.setId(01);
		persona.setNombre("Mike");
		persona.setApellido("Wasowski");
		//Primer Insert
		//this.iPersonaJdbcService.guardar(persona);
		
		Persona persona1 = new Persona();
		persona1.setId(1727);
		persona1.setApellido("Wasowski");
		persona1.setNombre("Maick");
		//this.iPersonaJdbcService.actualizar(persona1);
		
		//this.iPersonaJdbcService.eliminar(01);
		
		LOG.info( this.iPersonaJdbcService.buscar(1727) ); 
		
		
	}

}
