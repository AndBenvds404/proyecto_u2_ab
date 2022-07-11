package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void insertar(Vehiculo vehiculo);
	public Vehiculo buscarPorPlaca (String placa);
	public void eliminar (String placa);
	public void actualizar (Vehiculo vehiculo);
}
