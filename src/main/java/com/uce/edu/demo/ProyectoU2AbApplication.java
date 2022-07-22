package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Pasaporte;
import com.uce.edu.demo.service.ICiudadanoJpaService;


@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	
	@Autowired
	private ICiudadanoJpaService iCiudadanoJpaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Ciudadano ciu1 = new Ciudadano();
		ciu1.setNombre("Mike6");
		ciu1.setApellido("Wasouski6");
		ciu1.setCedula("172706");
		ciu1.setFechaNacimiento(LocalDateTime.of(1996, 6, 25, 17, 41));
		
		
		Pasaporte pasa1 = new Pasaporte();
		pasa1.setNumero("006");
		pasa1.setFechaEmision(LocalDateTime.of(2012,6,8, 12, 21));
		pasa1.setFechaCaducidad(LocalDateTime.now());
		pasa1.setCiudadano(ciu1);
		ciu1.setPasaporte(pasa1);
		
		//Insertar 
		this.iCiudadanoJpaService.insertar(ciu1);
		
		//Actualizar

		ciu1.setNombre("Miguel");
		ciu1.setApellido("Walter");
		ciu1.setCedula("172705");
		ciu1.setFechaNacimiento(LocalDateTime.of(1996, 6, 25, 17, 41));
		pasa1.setFechaCaducidad(LocalDateTime.of(2021,2,2, 12, 22));
		ciu1.setPasaporte(pasa1);
		this.iCiudadanoJpaService.actualizar(ciu1);
		
		//Buscar
		LOG.info("Ciudadano: "+this.iCiudadanoJpaService.buscarPorCedula("172701"));
		
		//Eliminar
		this.iCiudadanoJpaService.eliminarPorCedula("172704");
		
		
		

		
	}

}
