package com.uce.edu.demo.tarea.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tarea.modelo.Producto;
@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto buscar(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Producto p WHERE p.nombre =: datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Producto) myQuery.getSingleResult();
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public void eliminar(String codigoProducto) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarCodigoProducto(codigoProducto));
		
	}

	@Override
	public Producto buscarCodigoProducto(String codigoProducto) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Producto p WHERE p.codigoProducto =: datoCodigoProducto");
		myQuery.setParameter("datoCodigoProducto", codigoProducto);
		return (Producto) myQuery.getSingleResult();
	}
	
	

}
