package com.uce.edu.demo.tarea.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tarea.modelo.Proveedor;
@Repository
@Transactional
public class ProveedorRepositoryImpl implements IProveedorRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(proveedor);
	}

	@Override
	public Proveedor buscar(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Proveedor p WHERE p.nombre =: datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Proveedor) myQuery.getSingleResult();
	}
	
	@Override
	public Proveedor buscarNumContrato(String numContrato) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Proveedor p WHERE p.numContrato =: datoNumeroContrato");
		myQuery.setParameter("datoNumeroContrato", numContrato);
		return (Proveedor) myQuery.getSingleResult();
	}
	

	@Override
	public void actualizar(Proveedor proveedor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(proveedor);
	}

	@Override
	public void eliminar(String numContrato) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarNumContrato(numContrato));
		
	}
	
	

}
