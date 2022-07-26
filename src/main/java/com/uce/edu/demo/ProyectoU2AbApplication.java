package com.uce.edu.demo;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.libro2autor2.modelo.Autor2;
import com.uce.edu.demo.libro2autor2.modelo.Libro2;
import com.uce.edu.demo.libro2autor2.modelo.Libro2_autor2;
import com.uce.edu.demo.libro2autor2.service.IAutor2Service;
import com.uce.edu.demo.libro2autor2.service.ILibro2Service;


@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private ILibro2Service iLibro2Service;
	
	@Autowired
	private IAutor2Service iAutor2Service;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		// 1 Autor con 2 libros
		Autor2 a = new Autor2();
		a.setNombre("bukowski7");
		
		
		Libro2_autor2 libroAutor = new Libro2_autor2();
		libroAutor.setAutor2(a);
		
			Libro2 libro = new Libro2();
			libro.setTitulo("Senda del Perdedor6");
			libro.setPaginas("600");
		libroAutor.setLibro2(libro);
		
		Libro2 libro2 = new Libro2();
			libro2.setTitulo("Senda del Perdedor7");
			libro2.setPaginas("700");
		Libro2_autor2 libroAutor2 = new Libro2_autor2();
		libroAutor2.setAutor2(a);
		libroAutor2.setLibro2(libro2);
		
		Set<Libro2_autor2> listaLibrosAutor = new HashSet<>();
		
		listaLibrosAutor.add(libroAutor);
		listaLibrosAutor.add(libroAutor2);
		
		a.setLibro2_autor2(listaLibrosAutor);
		

		this.iLibro2Service.insertar(libro);
		this.iLibro2Service.insertar(libro2);
		this.iAutor2Service.insert(a);

		
		// 2 autores 1 libro
		
		Libro2 libro3 = new Libro2();
		libro3.setTitulo("El gran retroceso1");
		libro3.setPaginas("600");
	
		
		Libro2_autor2 libro2Autor22 = new Libro2_autor2();
			Autor2 a1 = new Autor2();
			a1.setNombre("Juakin1");

		libro2Autor22.setAutor2(a1);
		libro2Autor22.setLibro2(libro3);
		
		Libro2_autor2 libro2Autor23 = new Libro2_autor2();
			Autor2 a2 = new Autor2();
			a2.setNombre("Ramon1");
		libro2Autor23.setAutor2(a2);
		libro2Autor23.setLibro2(libro3);
			
		
		Set<Libro2_autor2> listaLibrosAutor2 = new HashSet<>();
		listaLibrosAutor2.add(libro2Autor22);
		listaLibrosAutor2.add(libro2Autor23);
		
		libro3.setLibro2_autor2(listaLibrosAutor2);
		
		this.iAutor2Service.insert(a2);
		this.iAutor2Service.insert(a1);
		this.iLibro2Service.insertar(libro3);
		
		
		
		
		
	}

}
