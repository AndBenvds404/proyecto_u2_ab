package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.prueba.modelo.Matricula;
import com.uce.edu.demo.prueba.modelo.Propietario;
import com.uce.edu.demo.prueba.modelo.Vehiculo;
import com.uce.edu.demo.prueba.repository.IVehiculoRepository;
import com.uce.edu.demo.prueba.service.IPropietarioService;
import com.uce.edu.demo.prueba.service.IVehiculoService;


@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		

		Propietario propietario = new Propietario();
		propietario.setNombre("Victor");
		propietario.setApellido("Travolta");
		propietario.setCedula("1727007");
		
		List<Matricula> listaMatriculas = new ArrayList<>();
		
		//auto1 matricula1
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Chevrolet");
		vehiculo.setPlaca("phc1237");
		vehiculo.setPrecio(new BigDecimal( 16000));
		vehiculo.setTipo("pesado");
		
		Matricula matricula = new Matricula();
		matricula.setPropietario(propietario);
		matricula.setValorMAtricula(new BigDecimal(460));
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setVehiculo(vehiculo);
		listaMatriculas.add(matricula);		
		
		
		//auto2 matricula2
		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setMarca("Mazda");
		vehiculo2.setPlaca("pgr3127");
		vehiculo2.setPrecio(new BigDecimal( 19000));
		vehiculo2.setTipo("liviano");
		
		Matricula matricula2 = new Matricula();
		matricula2.setPropietario(propietario);
		matricula2.setValorMAtricula(new BigDecimal(200));
		matricula2.setFechaMatricula(LocalDateTime.now());
		matricula2.setVehiculo(vehiculo2);
		
		listaMatriculas.add(matricula);	
		listaMatriculas.add(matricula2);		
	
		propietario.setMatriculas(listaMatriculas);
		
		//insertar
		this.iVehiculoService.insertar(vehiculo);
		this.iVehiculoService.insertar(vehiculo2);
		this.iPropietarioService.insertar(propietario);
		
		//buscar
		LOG.info(this.iPropietarioService.consultar("1727001"));
		//actualizar
		
		propietario.setApellido("Travis");
		this.iPropietarioService.actualizar(propietario);
		//eliminar

		this.iVehiculoService.eliminar("pgr3126");
		
		
		
	}

}
