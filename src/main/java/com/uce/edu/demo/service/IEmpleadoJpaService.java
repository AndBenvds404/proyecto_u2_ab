package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Empleado;

public interface IEmpleadoJpaService {
	
	public void insertar (Empleado c);
	public Empleado buscar (String codigoIess);
	public void actualizar (Empleado c);
	public void eliminar (String codigoIess);

}
