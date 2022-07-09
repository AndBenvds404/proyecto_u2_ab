package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		return this.entityManager.find(Persona.class,id); //find unicamente para primary Key (con anotacion "id" en modelo)
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


	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query JpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula= :datocedula");	
		JpqlQuery.setParameter("datocedula", cedula); //reemplaza datocedula por la cedula del parametro
		
		// JpqlQuery.getSingleResult()  -> retorna un objeto y por eso se castea
		return (Persona) JpqlQuery.getSingleResult();
	}


	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.apellido= :datoapellido");	
		myQuery.setParameter("datoapellido", apellido); //reemplaza datoapellido por el apellido del parametro

		return  myQuery.getResultList();// para listas
	}


	@Override
	public List<Persona> buscarPorGenero(String genero) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.genero= :datogenero");	
		myQuery.setParameter("datogenero", genero); //reemplaza datoapellido por el apellido del parametro

		return myQuery.getResultList();
	}


	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.nombre= :datonombre");	
		myQuery.setParameter("datogenero", nombre); //reemplaza datoapellido por el apellido del parametro

		return myQuery.getResultList();
	}



	
}
