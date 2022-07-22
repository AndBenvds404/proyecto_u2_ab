package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Pasaporte;

public interface IPasaporteJpaService {

	public void insertar (Pasaporte c);
	public Pasaporte buscar (String cedula);
	public void actualizar (Pasaporte c);
	public void eliminar (String cedula);

}
