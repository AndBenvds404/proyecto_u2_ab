package com.uce.edu.demo.prueba.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.prueba.modelo.Propietario;
@Repository
@Transactional
public class PropietarioRepositoryImpl implements IPropietarioRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		this.entityManager.persist(p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.consultarPorCedula(cedula));
	}

	@Override
	public Propietario consultarPorCedula(String cedula) {
		// TODO Auto-generated method stub
	
		Query JpqlQuery = this.entityManager.createQuery("SELECT p FROM Propietario p WHERE p.cedula= :datocedula");	
		JpqlQuery.setParameter("datocedula", cedula); //reemplaza datoapellido por el apellido del parametro

		return (Propietario) JpqlQuery.getSingleResult();
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		this.entityManager.merge(p);
		
	}
	
	
	
	

}
