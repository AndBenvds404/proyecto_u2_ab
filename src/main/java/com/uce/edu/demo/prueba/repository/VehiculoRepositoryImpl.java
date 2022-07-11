package com.uce.edu.demo.prueba.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.prueba.modelo.Vehiculo;
@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
		
		
	}

	@Override
	public Vehiculo buscarPorPlaca(String placa) {
		Query jpqlQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v WHERE v.placa = :datoplaca");
		jpqlQuery.setParameter("datoplaca", placa);
		return (Vehiculo) jpqlQuery.getSingleResult();
	}

	
	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorPlaca(placa));
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Query jpqlQuery =this.entityManager.createQuery("UPDATE Vehiculo v SET v.tipo = :datotipo, v.marca = :datomarca, v.precio = :datoprecio WHERE v.placa = :datoplaca");
		jpqlQuery.setParameter("datotipo", vehiculo.getTipo());
		jpqlQuery.setParameter("datomarca", vehiculo.getMarca());
		jpqlQuery.setParameter("datoprecio",vehiculo.getPrecio());
		jpqlQuery.setParameter("datoplaca", vehiculo.getPlaca());
		jpqlQuery.executeUpdate();
	}


	
	
}
