package com.uce.edu.demo;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.service.ICiudadanoJpaService;
import com.uce.edu.demo.service.IPersonaJpaService;


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
		ciu1.setNombre("Mike");
		ciu1.setApellido("Wasouski");
		
		Empleado empl1 = new Empleado();
		empl1.setCodigoIess("1234");
		empl1.setSalario(new BigDecimal(100));
		//empl1.setCiudadano(ciu1);
		
		ciu1.setEmpleado(empl1);
		
		this.iCiudadanoJpaService.Insertar(ciu1);
		
		Ciudadano ciu2 = new Ciudadano();
		ciu1.setNombre("Mike2");
		ciu1.setApellido("Wasouski2");
		
		Empleado empl2 = new Empleado();
		empl2.setCodigoIess("12344");
		empl2.setSalario(new BigDecimal(100));
		empl2.setCiudadano(ciu2);
		
		ciu1.setEmpleado(empl2);
		//this.iCiudadanoJpaService.Insertar(empl2);
		
	}

}
