package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJpaRepository {
	
	
	public List <Persona> buscarPorApellido(String apellido);
	public List <Persona> buscarPorNombre (String Nombre);
	public List <Persona> buscarPorGenero (String genero);
	
	public Persona buscarPorCedula(String cedula);
	public Persona buscarPorId (Integer id);
	public void insertar (Persona p);
	public void actualizar (Persona p);
	public void eliminar(Integer id);
}
