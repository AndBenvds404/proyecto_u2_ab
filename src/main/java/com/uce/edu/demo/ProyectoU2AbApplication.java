package com.uce.edu.demo;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.prueba.modelo.Propietario;
import com.uce.edu.demo.prueba.modelo.Vehiculo;
import com.uce.edu.demo.prueba.service.IPropietarioService;
import com.uce.edu.demo.prueba.service.IVehiculoService;
import com.uce.edu.demo.service.IPersonaJpaService;


@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
//	@Autowired
//	private IMatriculaGestorService iMatriculaGestorService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Ingresar un propietario
		
		Propietario p = new Propietario();
		p.setApellido("Benavides");
		p.setNombre("Andres");
		p.setCedula("1209876550");
		this.iPropietarioService.insertar(p);
		
		//Eliminar propietario
		this.iPropietarioService.eliminar("1209876549");
		
		
///////////////////////// CRUD VEHICULOS ////////////////////	
		
		//Insertar vehiculo
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("PCT002");
		vehiculo.setPrecio(new BigDecimal(30000));
		vehiculo.setTipo("L");
		this.iVehiculoService.insertar(vehiculo);
		
		
		//Actualizar vehiculo
		
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("PCT4321");
		vehiculo.setPrecio(new BigDecimal(40000));
		vehiculo.setTipo("Pesado");
		this.iVehiculoService.actualizar(vehiculo);
		
		//Buscar vehiculo por placa
		LOG.info(this.iVehiculoService.buscarPorPlaca("PCT4321"));
		
		//eliminar vehiculo
		this.iVehiculoService.eliminar("PCT001");
		
/////////////////////// Crear Matricula ////////////////////	
		
		//matricular un vehiculo con propietario
		//this.iMatriculaGestorService.generar(p.getCedula(), vehiculo.getPlaca());
				
		
		
	}

}
