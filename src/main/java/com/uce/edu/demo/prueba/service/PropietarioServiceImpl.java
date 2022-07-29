package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	@Autowired
	private IPropietarioRepository ipropietarioRepository;
	
	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		this.ipropietarioRepository.insertar(p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.ipropietarioRepository.eliminar(cedula);
		
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		return this.ipropietarioRepository.consultarPorCedula(cedula);
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		this.ipropietarioRepository.actualizar(p);
	}
	
	

}
