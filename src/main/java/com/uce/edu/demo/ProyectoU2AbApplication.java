package com.uce.edu.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.service.ICiudadanoJpaService;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;


@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private IHotelService ihotelService;
	
	@Autowired
	private IHabitacionService iHabitacionService;
	
	@Autowired
	private ICiudadanoJpaService iCiudadanoJpaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Hotel hotel1 = new Hotel();
		hotel1.setId(1);
		
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setNumero("A1");
		habitacion1.setPiso("2");
		habitacion1.setTipo("matrimonial");
		habitacion1.setHotelr(hotel1);
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setNumero("A2");
		habitacion2.setTipo("solitario");
		habitacion2.setPiso("2");
		habitacion2.setHotelr(hotel1);
		
		this.iHabitacionService.insertar(habitacion1);

		
	}

}
