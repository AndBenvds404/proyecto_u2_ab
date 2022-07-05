package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Persona;
@Repository
@Transactional
public class PersonaJpaRepositoryImpl implements IPersonaJpaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class,id); //clase de la entidad y la anotacion con "id"
	}
	
	public Persona buscarPorCedula(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class,id); //clase de la entidad y la anotacion con "id"
	}

	@Override
	public void insertar(Persona p) {
		// TODO Auto-generated method stub
		this.entityManager.persist(p);
		
	}

	@Override
	public void actualizar(Persona p) {
		// TODO Auto-generated method stub
		this.entityManager.merge(p);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorId(id));//remove recibe un entidad/modelo
		
		
	}

	
}
