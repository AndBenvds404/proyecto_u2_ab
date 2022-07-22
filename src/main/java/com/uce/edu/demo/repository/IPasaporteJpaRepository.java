package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Pasaporte;

public interface IPasaporteJpaRepository {
	
	public void insertar (Pasaporte c);
	public Pasaporte buscar (String cedula);
	public void actualizar (Pasaporte c);
	public void eliminar (String cedula);

}
