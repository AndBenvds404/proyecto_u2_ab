package com.uce.edu.demo.tarea.service;

import com.uce.edu.demo.tarea.modelo.Producto;

public interface IProductoService {
	
	public void insertar (Producto producto);
	public Producto buscar (String nombre );
	public void actualizar (Producto producto);
	public void eliminar (String codigoProducto);
}
