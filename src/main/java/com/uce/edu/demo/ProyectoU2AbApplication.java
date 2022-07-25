package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.tarea.modelo.Producto;
import com.uce.edu.demo.tarea.modelo.Proveedor;
import com.uce.edu.demo.tarea.service.IProductoService;
import com.uce.edu.demo.tarea.service.IProveedorService;


@SpringBootApplication
public class ProyectoU2AbApplication implements CommandLineRunner{
	
	Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	private IProveedorService iProveedorService;
	@Autowired
	private IProductoService iProductoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2AbApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Proveedor prov = new Proveedor();
		prov.setNombre("MaxLimpio3");
		prov.setEmail("MaxLimpio3gmail.com");
		prov.setNumContrato("300");
		
		
		Producto prod = new Producto();
		prod.setNombre("shampoo");
		prod.setCantidad(13);
		prod.setCodigoProducto("003");
		prod.setPrecio(new BigDecimal(3));

		List<Producto> productos = new ArrayList<>();
		productos.add(prod);
		
		prov.setProductos(productos);
		prod.setProveedor(prov);
		
		this.iProveedorService.insertar(prov);
		this.iProveedorService.buscar("MaxLimpio2");
		this.iProveedorService.actualizar(prov);
		this.iProveedorService.eliminar("200");
		
	}

}
