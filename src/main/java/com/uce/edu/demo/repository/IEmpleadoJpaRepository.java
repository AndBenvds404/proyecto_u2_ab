package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Empleado;


public interface IEmpleadoJpaRepository {

	public void insertar (Empleado c);
	public Empleado buscar (String codigoIess);
	public void actualizar (Empleado c);
	public void eliminar (String codigoIess);
}
