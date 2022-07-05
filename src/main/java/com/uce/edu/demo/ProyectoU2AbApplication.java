package com.uce.edu.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Persona;
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
		
		
		Persona p = new Persona();
       // p.setId(6);
        p.setNombre("WLuigui");
        p.setApellido("Bros");
        //Guardar
        this.iPersonaJpaService.insertar(p);;

        Persona p1 = new Persona();
        p1.setId(1727);
        p1.setNombre("Luigui");
        p1.setApellido("Bros");
        //Actualizar
        //this.iPersonaJpaService.actualizar(p1);

        //Eliminar
        //this.iPersonaJpaService.eliminar(1);
		
		
		
		
	}

}
