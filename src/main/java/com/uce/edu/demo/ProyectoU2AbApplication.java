package com.uce.edu.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.service.IPersonaJpaService;


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
		
		
		LOG.info("Estudiante Sencillo: "+this.iEstudianteJpaService.buscarPorSemestreHorasSencillo("primero", 24));
		
		LOG.info("Estudiantes Intervalo edad: "+this.iEstudianteJpaService.buscarIntervaloEdadSemestre("18"));
	
	}

}
