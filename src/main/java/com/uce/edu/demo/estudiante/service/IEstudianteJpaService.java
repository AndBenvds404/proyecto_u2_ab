package com.uce.edu.demo.estudiante.service;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteJpaService {

	public void insertar (Estudiante e);
	public Estudiante buscar (Integer cedula);
	public void actualizar (Estudiante e);
	public void eliminar (Integer cedula);
}
