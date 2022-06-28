package com.uce.edu.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.estudiante.repository.IEstudianteJdbcRepository;
import com.uce.edu.demo.estudiante.to.Estudiante;
@Service
public class EstudianteJdbcServiceImpl implements IEstudianteJdbcService{
	@Autowired
	private IEstudianteJdbcRepository iEstudianteJdbcRepository;
	
	@Override
	public void insertar(Estudiante e) {
		// TODO Auto-generated method stub
		this.iEstudianteJdbcRepository.insertar(e);
		
	}

	@Override
	public Estudiante buscar(int cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteJdbcRepository.buscar(cedula);
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		this.iEstudianteJdbcRepository.actualizar(e);
	}

	@Override
	public void eliminar(int cedula) {
		// TODO Auto-generated method stub
		this.iEstudianteJdbcRepository.eliminar(cedula);
		
	}
	

}
