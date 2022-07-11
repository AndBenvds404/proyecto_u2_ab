package com.uce.edu.demo.prueba.repository;

import com.uce.edu.demo.prueba.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void insertar (Propietario p);
	public void eliminar (String cedula);
	public Propietario consultarPorCedula(String cedula);

}
