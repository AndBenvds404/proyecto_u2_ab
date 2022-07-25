package com.uce.edu.demo.tarea.service;

import com.uce.edu.demo.tarea.modelo.Proveedor;

public interface IProveedorService {

	public void insertar (Proveedor proveedor);
	public Proveedor buscar (String nombre );
	public void actualizar (Proveedor proveedor);
	public void eliminar (String numContrato);
}
