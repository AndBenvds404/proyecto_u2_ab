package com.uce.edu.demo.libro2autor2.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.libro2autor2.modelo.Libro2;
@Repository
@Transactional
public class Libro2RepositoryImpl implements ILibro2Repository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libro2 l) {
		// TODO Auto-generated method stub
		this.entityManager.persist(l);
	}

}
