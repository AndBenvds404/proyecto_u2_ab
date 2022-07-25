package com.uce.edu.demo.tarea.repository;

import com.uce.edu.demo.tarea.modelo.Proveedor;

public interface IProveedorRepository {
	
	public void insertar (Proveedor proveedor);
	public Proveedor buscar (String nombre );
	public void actualizar (Proveedor proveedor);
	public void eliminar (String numContrato);
	public Proveedor buscarNumContrato (String numContrato);
	
}
