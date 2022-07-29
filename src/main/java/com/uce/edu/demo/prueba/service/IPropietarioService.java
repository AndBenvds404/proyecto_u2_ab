package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.modelo.Propietario;

public interface IPropietarioService {
	
	public void insertar (Propietario p);
	public void eliminar (String cedula);
	public Propietario consultar(String cedula);
	public void actualizar (Propietario p);
	
}
