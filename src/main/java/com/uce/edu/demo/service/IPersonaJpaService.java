package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJpaService {
	public Persona buscarPorId (Integer id);
	public void insertar (Persona p);
	public void actualizar (Persona p);
	public void eliminar(Integer id);
}
