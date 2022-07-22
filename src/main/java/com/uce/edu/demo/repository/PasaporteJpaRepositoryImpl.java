package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Pasaporte;
@Repository
@Transactional
public class PasaporteJpaRepositoryImpl implements IPasaporteJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Pasaporte pasaporte) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pasaporte);
	}

	@Override
	public Pasaporte buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Pasaporte.class, cedula);
	}

	@Override
	public void actualizar(Pasaporte pasaporte) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pasaporte);
		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(cedula));
		
	}
	
	
	

}
