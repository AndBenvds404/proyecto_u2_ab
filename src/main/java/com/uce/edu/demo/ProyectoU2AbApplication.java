package com.uce.edu.demo;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.manytomany.Autor;
import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.service.manytomany.IAutorService;
import com.uce.edu.demo.service.manytomany.ILibroService;


@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private ILibroService iLibroService;
	
	@Autowired
	private IAutorService iAutorService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Autor a = new Autor();
		a.setNombre("Amdre3");
		//a.setLibros(null); Este no se necesita Setear (solo en MANYtoMANY)
		
	//	this.iAutorService.insert(a);
		Libro l = new Libro();
		l.setTitulo("Las flores XD 3");
		l.setPaginas("200");
		Set<Autor> autores = new HashSet<>();
		autores.add(a);
		l.setAutores(autores);
		this.iLibroService.insertar(l);
	}

}
