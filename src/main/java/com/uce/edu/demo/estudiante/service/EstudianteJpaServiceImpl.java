package com.uce.edu.demo.estudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.estudiante.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService{

	@Autowired
	private IEstudianteJpaRepository iEstudianteJpaRepository;
	
	
	@Override
	public void insertar(Estudiante e) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.insertar(e);
	}

	@Override
	public Estudiante buscar(Integer cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscar(cedula);
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.actualizar(e);
	}

	@Override
	public void eliminar(Integer cedula) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.eliminar(cedula);
	}

	@Override
	public List<Estudiante> buscarPorEdad(String edad) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorEdad(edad);
	}

	@Override
	public List<Estudiante> buscarPorSemestre(String semestre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorSemestre(semestre);
	}

	@Override
	public List<Estudiante> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombre(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNumHoras(Integer horas) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNumHoras(horas);
	}

	@Override
	public List<Estudiante> buscarPorEdadNombre(String edad, String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorEdadNombre(edad, nombre);
	}

	@Override
	public List<Estudiante> buscarPorSemestreHoras(String semestre, Integer horas) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorSemestreHoras(semestre, horas);
	}
	
	

}
