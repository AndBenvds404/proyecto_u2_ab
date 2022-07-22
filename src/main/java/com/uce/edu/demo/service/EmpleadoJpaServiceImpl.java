package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEmpleadoJpaRepository;
import com.uce.edu.demo.repository.modelo.Empleado;

@Service
public class EmpleadoJpaServiceImpl implements IEmpleadoJpaService {

	@Autowired
	private IEmpleadoJpaRepository iEmpleadoJpaRepository;
	
	@Override
	public void insertar(Empleado c) {
		// TODO Auto-generated method stub
		this.iEmpleadoJpaRepository.insertar(c);
	}

	@Override
	public Empleado buscar(String codigoIess) {
		// TODO Auto-generated method stub
		return this.iEmpleadoJpaRepository.buscar(codigoIess);
	}

	@Override
	public void actualizar(Empleado c) {
		// TODO Auto-generated method stub
		this.iEmpleadoJpaRepository.actualizar(c);
		
	}

	@Override
	public void eliminar(String codigoIess) {
		// TODO Auto-generated method stub
		this.iEmpleadoJpaRepository.eliminar(codigoIess);
		
	}
	
	

}
