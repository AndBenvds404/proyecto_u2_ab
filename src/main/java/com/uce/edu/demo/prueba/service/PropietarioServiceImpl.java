package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(cedula);
		
	}

}
