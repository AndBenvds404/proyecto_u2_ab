package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJpaService {
	
	public List <Persona> buscarPorApellido(String apellido);
	public List <Persona> buscarPorGenero (String genero);

	public List <Persona> buscarPorNombre (String Nombre);
	public Persona buscarPorCedula(String cedula);
	public Persona buscarPorId (Integer id);
	public void insertar (Persona p);
	public void actualizar (Persona p);
	public void eliminar(Integer id);

	public int actualizarPorApellido(String genero, String apellido);
	public int eliminarPorGenero(String genero); 
	
	public Persona buscarPorCedulaTyped(String cedula);
	public Persona buscarPorCedulaNamed(String cedula);
	public Persona buscarPorCedulaTypedNamed(String cedula);
	
	public List <Persona> buscarPorNombreApellido(String nombre, String apellido);

	
}
