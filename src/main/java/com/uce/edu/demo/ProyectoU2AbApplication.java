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
        p.setNombre("Franchesco");
        p.setApellido("Virgolini");
        p.setCedula("17272004");
        p.setGenero("M");
        
        //Guardar
        this.iPersonaJpaService.insertar(p);;
        
        //Buscar por cedula
        LOG.info(this.iPersonaJpaService.buscarPorCedula("17272004"));// retorna un unico resultado
        
        //Buscar por id
       
        LOG.info(this.iPersonaJpaService.buscarPorId(14));
        
        List<Persona> listaPersona = this.iPersonaJpaService.buscarPorApellido(("Virgolini"));
        for (Persona item: listaPersona) {
        	LOG.info("Persona" + item);
        }
        
        Persona p1 = new Persona();
        //p1.setId(1727);
        p1.setNombre("Luigui");
        p1.setApellido("Bros");
        p1.setCedula("17272002");
        //Actualizar
        //this.iPersonaJpaService.actualizar(p1);

        //Eliminar
        //this.iPersonaJpaService.eliminar(1);
		
		
        
        List<Persona> listaPersona1 = this.iPersonaJpaService.buscarPorGenero(("M"));
        for (Persona item: listaPersona1) {
        	LOG.info("Genero" + item);
        }
        
        List<Persona> listaPersona2 = this.iPersonaJpaService.buscarPorNombre(("Francesco"));
        for (Persona item: listaPersona2) {
        	LOG.info("Nombres" + item);
        }
		
	}

}
