package com.uce.edu.demo;

import java.util.List;

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
		
		
		Estudiante estudiante = new Estudiante();
		estudiante.setCedula(1727015);
		estudiante.setApellido("Pizza");
		estudiante.setNombre("Guillermo");
		estudiante.setSemestre("cuarto");
		estudiante.setEdad("22");
		estudiante.setNumeroMaterias(5);
		estudiante.setNumeroHorasSemanales(22);
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setCedula(1727011);
		estudiante1.setApellido("Falconi");
		estudiante1.setNombre("Guillermo");
		estudiante1.setSemestre("primero");
		estudiante1.setEdad("22");
		estudiante1.setNumeroMaterias(8);
		estudiante1.setNumeroHorasSemanales(22);
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setCedula(1727012);
		estudiante2.setApellido("Carrillo");
		estudiante2.setNombre("Guillermo");
		estudiante2.setSemestre("tercero");
		estudiante2.setEdad("24");
		estudiante2.setNumeroMaterias(5);
		estudiante2.setNumeroHorasSemanales(22);
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setCedula(1727003);
		estudiante3.setApellido("vitery");
		estudiante3.setNombre("Cynthia");
		estudiante3.setSemestre("cuarto");
		estudiante3.setEdad("21");
		estudiante3.setNumeroMaterias(7);
		estudiante3.setNumeroHorasSemanales(28);
		
		Estudiante estudiante4 = new Estudiante();
		estudiante4.setCedula(1727004);
		estudiante4.setApellido("Moreno");
		estudiante4.setNombre("Lennyn");
		estudiante4.setSemestre("quinto");
		estudiante4.setEdad("22");
		estudiante4.setNumeroMaterias(10);
		estudiante4.setNumeroHorasSemanales(22);
		
//		this.iEstudianteJpaService.insertar(estudiante);
//		this.iEstudianteJpaService.insertar(estudiante1);
//		this.iEstudianteJpaService.insertar(estudiante2);
//		this.iEstudianteJpaService.insertar(estudiante3);
//		this.iEstudianteJpaService.insertar(estudiante4);

		// TypedQuery
		LOG.info("Estudiantes con edad igual a 18: "+this.iEstudianteJpaService.buscarPorEdad("18"));
	
		LOG.info("Estudiantes de primer semestre"+this.iEstudianteJpaService.buscarPorSemestre("primero"));

		//NamedQuery
		LOG.info("Estudiantes de nombre Guillermo"+this.iEstudianteJpaService.buscarPorNombre("Guillermo"));
		
		LOG.info("Estudiantes con 22 horas semanales de clase"+this.iEstudianteJpaService.buscarPorNumHoras(22));

		//TypedNamed
		LOG.info("Lista de estudiantes por edad nombre "+this.iEstudianteJpaService.buscarPorEdadNombre("22", "Guillermo"));
		LOG.info("Lista de estudiantes por semestre y horas" +this.iEstudianteJpaService.buscarPorSemestreHoras("primero", 22));

		
		
		
		
	}

}
