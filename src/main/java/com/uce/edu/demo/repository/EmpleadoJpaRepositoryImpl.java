package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Empleado;

@Repository
@Transactional
public class EmpleadoJpaRepositoryImpl implements IEmpleadoJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
		
	}

	@Override
	public Empleado buscar(String codigoIess) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, codigoIess);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
		
	}

	@Override
	public void eliminar(String codigoIess) {
		// TODO Auto-generated method stub
		this.entityManager.remove(codigoIess);
		
	}
	
	

}
