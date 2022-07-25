package com.uce.edu.demo.tarea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tarea.modelo.Producto;
import com.uce.edu.demo.tarea.repository.IProductoRepository;
@Service
public class ProductorServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.insertar(producto);
	}

	@Override
	public Producto buscar(String nombre) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(nombre);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(producto);
	}

	@Override
	public void eliminar(String codigoProducto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(codigoProducto);
	}
	
	

}
