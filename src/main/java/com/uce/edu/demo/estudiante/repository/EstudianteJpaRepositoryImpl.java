package com.uce.edu.demo.estudiante.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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

	
	// TypedQuery ---------------------------------------------------------------
	
	@Override
	public List<Estudiante>  buscarPorEdad(String edad) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.edad = :datoEdad ",Estudiante.class);
		miTypedQuery.setParameter("datoEdad", edad);
		return miTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorSemestre(String semestre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.semestre = :datoSemestre",Estudiante.class);
		miTypedQuery.setParameter("datoSemestre", semestre);
		
		return miTypedQuery.getResultList();
	}
	
	// NamedQuery ----------------------------------------------------------------
	
	@Override
	public List<Estudiante>  buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miNamedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre");
		miNamedQuery.setParameter("datoNombre", nombre);
		
		return (List<Estudiante>) miNamedQuery.getResultList();
	}

	
	@Override
	public List<Estudiante> buscarPorNumHoras(Integer horas) {
		Query miNamedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNumHoras");
		miNamedQuery.setParameter("datoNumHoras", horas);
		return (List<Estudiante>) miNamedQuery.getResultList();
	}

	// TypedNamedQuery ---------------------------------------------------------------
	
	@Override
	public List<Estudiante> buscarPorEdadNombre(String edad, String nombre) {
		// TODO Auto-generated method stub
		Query miQuery =this.entityManager.createNamedQuery("Estudiante.buscarPorEdadNombre",Estudiante.class);
		miQuery.setParameter("datoEdad",edad);
		miQuery.setParameter("datoNombre",nombre);
		return miQuery.getResultList();
	}
	
	@Override
	public List<Estudiante> buscarPorSemestreHoras(String semestre, Integer horas) {
		// TODO Auto-generated method stub
		Query miQuery =this.entityManager.createNamedQuery("Estudiante.buscarPorSemestreHoras",Estudiante.class);
		miQuery.setParameter("datoSemestre",semestre);
		miQuery.setParameter("datoNumHoras",horas);
		return miQuery.getResultList();
	}
	
	

}
