package com.uce.edu.demo.tarea.repository;

import com.uce.edu.demo.tarea.modelo.Producto;

public interface IProductoRepository {

	public void insertar (Producto producto);
	public Producto buscar (String nombre );
	public void actualizar (Producto producto);
	public void eliminar (String codigoProducto);
	public Producto buscarCodigoProducto (String codigoProducto);
}
