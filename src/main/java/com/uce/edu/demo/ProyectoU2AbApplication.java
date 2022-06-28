package com.uce.edu.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJdbcService;
import com.uce.edu.demo.estudiante.to.Estudiante;

@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);


	@Autowired
	private IEstudianteJdbcService  iEstudianteJdbcService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante();
		estudiante.setCedula(1727000);
		estudiante.setApellido("Lasso");
		estudiante.setNombre("Guillermo");
		estudiante.setSemestre("primero");
		estudiante.setNumeroMaterias(6);
		estudiante.setNumeroHorasSemanales(22);
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setCedula(1727001);
		estudiante1.setApellido("Iza");
		estudiante1.setNombre("Leonidas");
		estudiante1.setSemestre("segundo");
		estudiante1.setNumeroMaterias(7);
		estudiante1.setNumeroHorasSemanales(28);
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setCedula(1727002);
		estudiante2.setApellido("Correa");
		estudiante2.setNombre("Rafael");
		estudiante2.setSemestre("tercero");
		estudiante2.setNumeroMaterias(5);
		estudiante2.setNumeroHorasSemanales(22);
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setCedula(1727003);
		estudiante3.setApellido("vitery");
		estudiante3.setNombre("Cynthia");
		estudiante3.setSemestre("cuarto");
		estudiante3.setNumeroMaterias(7);
		estudiante3.setNumeroHorasSemanales(28);
		
		Estudiante estudiante4 = new Estudiante();
		estudiante4.setCedula(1727004);
		estudiante4.setApellido("Moreno");
		estudiante4.setNombre("Lennyn");
		estudiante4.setSemestre("quinto");
		estudiante4.setNumeroMaterias(10);
		estudiante4.setNumeroHorasSemanales(22);
		
		//insertar
 		this.iEstudianteJdbcService.insertar(estudiante);
		this.iEstudianteJdbcService.insertar(estudiante1);
		this.iEstudianteJdbcService.insertar(estudiante2);
		this.iEstudianteJdbcService.insertar(estudiante3);
		this.iEstudianteJdbcService.insertar(estudiante4);
		
		//actualizar
		estudiante4.setApellido("Moreno");
		estudiante4.setNombre("Lenin");
		this.iEstudianteJdbcService.actualizar(estudiante4);
	
		//eliminar
		this.iEstudianteJdbcService.eliminar(1727000);
		
		//buscar
		LOG.info(this.iEstudianteJdbcService.buscar(1727004)); 
		
		
		
		
	}

}
