package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICiudadanoJpaRepository;
import com.uce.edu.demo.repository.modelo.Ciudadano;

@Service
public class CiudadanoJpaServiceImpl implements ICiudadanoJpaService {

	@Autowired
	private ICiudadanoJpaRepository iCiudadanoJpaRepository;

	@Override
	public void insertar(Ciudadano c) {

		this.iCiudadanoJpaRepository.insertar(c);
	}

	@Override
	public Ciudadano buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iCiudadanoJpaRepository.buscar(cedula);
	}

	@Override
	public void actualizar(Ciudadano c) {
		// TODO Auto-generated method stub
		this.iCiudadanoJpaRepository.actualizar(c);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.iCiudadanoJpaRepository.eliminar(cedula);
	}

	@Override
	public Ciudadano buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iCiudadanoJpaRepository.buscarPorCedula(cedula);
	}

	@Override
	public void eliminarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		this.iCiudadanoJpaRepository.eliminarPorCedula(cedula);
		
	}
	
	
	
}
