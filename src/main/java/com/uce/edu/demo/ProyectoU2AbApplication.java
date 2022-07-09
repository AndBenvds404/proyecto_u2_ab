package com.uce.edu.demo;

import java.util.List;

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
        p.setNombre("Silvia");
        p.setApellido("Muños");
        p.setCedula("17272009");
        p.setGenero("F");
        
    	Persona p1 = new Persona();
        // p1.setId(6);
         p1.setNombre("Daniel");
         p1.setApellido("Kuper");
         p1.setCedula("17272010");
         p1.setGenero("M");
        
         int resultado=this.iPersonaJpaService.actualizarPorApellido("MEN", "Virgolini");
         LOG.info("cantidad de registros actualizados: "+ resultado);
         
         int resultado1=this.iPersonaJpaService.eliminarPorGenero("F");
         LOG.info("cantidad de registros eliminados: "+ resultado1);
		
	}

}
