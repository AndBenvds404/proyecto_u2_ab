package com.uce.edu.demo.repository;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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
	public List<Persona> buscarPorGenero(String genero) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.genero= :datogenero");	
		myQuery.setParameter("datogenero", genero); //reemplaza datoapellido por el apellido del parametro

		return myQuery.getResultList();
	}
	
	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.apellido= :datoapellido");	
		myQuery.setParameter("datoapellido", apellido); //reemplaza datoapellido por el apellido del parametro

		return  myQuery.getResultList();// para listas
	}

	@Override
	public int actualizarPorApellido(String genero, String apellido) {//int si se requiere sabercuantos se actualizaron, caso contrario VOID
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createQuery("UPDATE Persona p SET p.genero = :datoGenero WHERE p.apellido = :datoApellido ");
		myQuery.setParameter("datoGenero", genero);
		myQuery.setParameter("datoApellido",apellido);
		return myQuery.executeUpdate(); //metodo cuando el metodo va actualizar una tabla
	}
	

	
	
	@Override
	public int eliminarPorGenero(String genero) {
		Query myQuery = this.entityManager.createQuery("DELETE FROM Persona p where p.genero = :datoGenero");
		myQuery.setParameter("datoGenero", genero);
		return myQuery.executeUpdate();
	}


	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.nombre= :datonombre");	
		myQuery.setParameter("datonombre", nombre); //reemplaza datoapellido por el apellido del parametro

		return myQuery.getResultList();
	}
	
	// TypedNamed
	@Override
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido) {
		Query miQuery =this.entityManager.createNamedQuery("Persona.buscarPorNombreApellido",Persona.class);
		miQuery.setParameter("datoNombre",nombre);
		miQuery.setParameter("datoApellido",apellido);
		return miQuery.getResultList();
	}

	//  JPQL
	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query JpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula= :datocedula");	
		JpqlQuery.setParameter("datocedula", cedula); //reemplaza datocedula por la cedula del parametro
		
		// JpqlQuery.getSingleResult()  -> retorna un objeto y por eso se castea
		return (Persona) JpqlQuery.getSingleResult();
	}
	

	//  TypedQuery
	@Override
	public Persona buscarPorCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> miTypedQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula= :datocedula", Persona.class);
		miTypedQuery.setParameter("datocedula", cedula);
		return miTypedQuery.getSingleResult();
	}
	
	//  NamedQuery
	@Override
	public Persona buscarPorCedulaNamed(String cedula) {
		// TODO Auto-generated method stub
		Query miQuery =this.entityManager.createNamedQuery("Persona.buscarPorCedula");
		miQuery.setParameter("datocedula",cedula);
		return (Persona) miQuery.getSingleResult();
	}
	
	//TypedNamed
	public Persona buscarPorCedulaTypedNamed(String cedula) {
		// TODO Auto-generated method stub
			TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula", Persona.class);
	        myQuery.setParameter("datocedula", cedula);
	        return myQuery.getSingleResult();
	}
	
	// Native Query
	@Override
	public Persona buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM persona  WHERE pers_cedula = :datoCedula", Persona.class); // query nativo y el tipo de retorno
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();
	}
	
	//Native NamedQuery
	@Override
	public Persona buscarPorCedulaNamedNative(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedulaNamedNative",Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();
	}
	
	
	// Criteria API
	@Override
	public Persona buscarPorCedulaCriteriaApi(String cedula) {
		
		// SELECT p FROM Persona p WHERE p.cedula= :datocedula
		
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder= this.entityManager.getCriteriaBuilder(); //criterialBuilder la fabrica para construir nuestro Consulta
		
		//Especificamoa el retorno de mi SQL
		CriteriaQuery<Persona> myQuery= myBuilder.createQuery(Persona.class); //FROM Persona
		
		//Aqui empesamo a construir el SQL
			//Root 
		Root<Persona> personaFrom = myQuery.from(Persona.class); //From Persona
			// myQuery.select(personaFrom) select p from Persona
			//las condiciones WHERE en criteria API selos conoce como predicados
		Predicate p1 = myBuilder.equal(personaFrom.get("cedula"), cedula );
			//myQuery.select(personaFrom).where(p1) ; // construimos el WHERE
		CriteriaQuery<Persona> myQueryCompleto = myQuery.select(personaFrom).where(p1);
		
		//enviamos el Query a la base 
		TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQueryCompleto);
		
		return myQueryFinal.getSingleResult();
	}
	
	
	@Override
	public Persona buscarDinamicamente(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Persona> myQuery = myCriteria.createQuery(Persona.class);
		Root<Persona> myTable= myQuery.from(Persona.class);
		Predicate predicateNombre = myCriteria.equal(myTable.get("nombre"), nombre);// (nombre de la entidad, nombre de parametro)
		Predicate predicateApellido = myCriteria.equal(myTable.get("apellido"), apellido);// (nombre de la entidad, nombre de parametro)

		//pers_nombre='diana' and pers_apellido='Muñoz'
		Predicate myPredicateFinal =null;
		
		if ( genero.equals("M")) {
			//Predicate predicateFecha = myCriteria.equal(myTable.get("cedula"),"cedula"); como ejemplso se puede añadir mas condiciones despues
			myPredicateFinal = myCriteria.and(predicateNombre,predicateApellido);

		}else if (genero.equals("F")) {
			myPredicateFinal = myCriteria.or(predicateNombre,predicateApellido);

		}
		
		myQuery.select(myTable).where(myPredicateFinal);
		TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);
		
		return myQueryFinal.getSingleResult();
	}
	
	@Override
	public Persona buscarDinamicamenteGenero(String nombre, String apellido, String genero) {

	CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
	CriteriaQuery<Persona> myQuery = myCriteria.createQuery(Persona.class);
	Root<Persona> myTable= myQuery.from(Persona.class);
	Predicate predicateNombre = myCriteria.equal(myTable.get("nombre"), nombre);// (nombre de la entidad, nombre de parametro)
	Predicate predicateApellido = myCriteria.equal(myTable.get("apellido"), apellido);// (nombre de la entidad, nombre de parametro)
	Predicate predicateGenero = myCriteria.equal(myTable.get("genero"), genero);// (nombre de la entidad, nombre de parametro)

	//pers_nombre='diana' and pers_apellido='Muñoz'
	Predicate myPredicateFinal =null;
	
	if ( genero.equals("M")) {
		//Predicate predicateFecha = myCriteria.equal(myTable.get("cedula"),"cedula"); como ejemplso se puede añadir mas condiciones despues
		myPredicateFinal = myCriteria.or(predicateNombre,predicateApellido);
		myPredicateFinal = myCriteria.and(myPredicateFinal,predicateGenero);
	}else if (genero.equals("F")) {
		myPredicateFinal = myCriteria.and(predicateNombre,predicateApellido);
		myPredicateFinal = myCriteria.or(myPredicateFinal,predicateGenero);

	}
	
	myQuery.select(myTable).where(myPredicateFinal);
	TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);
	
	return myQueryFinal.getSingleResult();
	}
	
	

	
}
