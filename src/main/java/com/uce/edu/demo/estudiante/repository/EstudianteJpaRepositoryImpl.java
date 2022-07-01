package com.uce.edu.demo.estudiante.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;


@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Estudiante e) {
		// TODO Auto-generated method stub
		this.entityManager.persist(e);		
	}

	@Override
	public Estudiante buscar(Integer cedula) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class,cedula);
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		this.entityManager.merge(e);
		
	}

	@Override
	public void eliminar(Integer cedula) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(cedula));
	}
	
	

}
