package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.modelo.Matricula;
import com.uce.edu.demo.prueba.modelo.Propietario;
import com.uce.edu.demo.prueba.modelo.Vehiculo;
import com.uce.edu.demo.prueba.repository.IMatriculaRepository;
import com.uce.edu.demo.prueba.repository.IPropietarioRepository;
import com.uce.edu.demo.prueba.repository.IVehiculoRepository;

@Service
public class MatriculaGestorServiceImpl implements IMatriculaGestorService {

	@Autowired
	private IPropietarioRepository propietarioRepository;
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	@Autowired
	@Qualifier("Pesado")
	private IMatriculaService matriculaServicePesado;
	@Autowired
	@Qualifier("Liviano")
	private IMatriculaService matriculaServiceLiviano;
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	
	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario p = this.propietarioRepository.consultarPorCedula(cedula);
		Vehiculo v = this.vehiculoRepository.buscarPorPlaca(placa);
		String tipo = v.getTipo();
		BigDecimal valorMatricula;
		if (tipo.equals("P")) {
			valorMatricula = this.matriculaServicePesado.calcular(v.getPrecio());
		}else {
			valorMatricula = this.matriculaServiceLiviano.calcular(v.getPrecio());
		}
		if (valorMatricula.compareTo(new BigDecimal(2000))> 0) {
			BigDecimal valorDescuento = valorMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
			valorMatricula =valorMatricula.subtract(valorDescuento);
		}
		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setPopietario(p);
		matricula.setValorMAtricula(valorMatricula);
		matricula.setVehiculo(v);
		this.matriculaRepository.crear(matricula);
		
		
		
	}
}
