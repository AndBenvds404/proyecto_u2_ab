package com.uce.edu.demo.tarea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.modelo.Pasaporte;
import com.uce.edu.demo.tarea.modelo.Proveedor;
import com.uce.edu.demo.tarea.repository.IProveedorRepository;

@Service
public class ProveedorServiceImpl implements IProveedorService{

	@Autowired
	private IProveedorRepository iProveedorRepository;
	
	@Override
	public void insertar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		this.iProveedorRepository.insertar(proveedor);
		
	}

	@Override
	public Proveedor buscar(String nombre) {
		// TODO Auto-generated method stub
		return this.iProveedorRepository.buscar(nombre);
	}

	@Override
	public void actualizar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		this.iProveedorRepository.actualizar(proveedor);
		
	}

	@Override
	public void eliminar(String numContrato) {
		// TODO Auto-generated method stub
		this.iProveedorRepository.eliminar(numContrato);
		
	}
	
	

}
