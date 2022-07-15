package com.uce.edu.demo.estudiante.repository;

import java.util.List;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteJpaRepository {
	
	public void insertar (Estudiante e);
	public void actualizar (Estudiante e);
	public void eliminar (Integer cedula);
	public Estudiante buscar (Integer cedula);
	
	public List<Estudiante> buscarPorEdad (String edad);
	public List<Estudiante> buscarPorSemestre(String semestre);

	public List<Estudiante> buscarPorNombre(String nombre);
	public List<Estudiante> buscarPorNumHoras(Integer horas);
	
	public List <Estudiante> buscarPorEdadNombre (String edad, String nombre);
	public List<Estudiante> buscarPorSemestreHoras(String semestre, Integer horas);

	public Estudiante buscarPorCedulaNative(Integer cedula);
	public List<Estudiante> buscarPorNombreNative(String nombre);
	
	public Estudiante buscarPorSemestreApellidoNamedNative(String semestre, String apellido);
	public List<Estudiante> buscarPorEdadNamedNative(String edad);
}
