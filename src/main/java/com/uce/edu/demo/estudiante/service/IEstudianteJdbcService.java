package com.uce.edu.demo.estudiante.service;

import com.uce.edu.demo.estudiante.to.Estudiante;

public interface IEstudianteJdbcService {

	public void insertar (Estudiante e);
	public Estudiante buscar (int cedula);
	public void actualizar (Estudiante e);
	public void eliminar (int cedula);

}
