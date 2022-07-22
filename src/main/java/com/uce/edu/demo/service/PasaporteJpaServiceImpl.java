package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPasaporteJpaRepository;
import com.uce.edu.demo.repository.modelo.Pasaporte;

@Service
public class PasaporteJpaServiceImpl implements IPasaporteJpaService {

	
	@Autowired
	private IPasaporteJpaRepository iPasaporteJpaRepository;
	
	@Override
	public void insertar(Pasaporte p) {
		// TODO Auto-generated method stub
		this.iPasaporteJpaRepository.insertar(p);
		
	}

	@Override
	public Pasaporte buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPasaporteJpaRepository.buscar(cedula);
	}

	@Override
	public void actualizar(Pasaporte p) {
		// TODO Auto-generated method stub
		this.iPasaporteJpaRepository.actualizar(p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.iPasaporteJpaRepository.eliminar(cedula);
		
	}
	
	

}
