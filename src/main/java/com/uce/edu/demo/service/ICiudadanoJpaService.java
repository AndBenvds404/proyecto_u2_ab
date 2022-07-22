package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Ciudadano;

public interface ICiudadanoJpaService {

	public void insertar (Ciudadano c);
	public Ciudadano buscar (String cedula);
	public void actualizar (Ciudadano c);
	public void eliminar (String cedula);
	
	public Ciudadano buscarPorCedula (String cedula);
	public void eliminarPorCedula (String cedula);
}
