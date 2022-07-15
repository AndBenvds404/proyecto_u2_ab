package com.uce.edu.demo.estudiante.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.repository.modelo.Persona;

@Entity
@Table (name="estudiante")

@NamedQuery(name = "Estudiante.buscarPorNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre" )
@NamedQuery(name = "Estudiante.buscarPorNumHoras", query = "SELECT e FROM Estudiante e WHERE e.numeroHorasSemanales = :datoNumHoras ORDER BY e.edad ASC")

@NamedQuery(name = "Estudiante.buscarPorEdadNombre", query = "SELECT e FROM Estudiante e WHERE e.edad = :datoEdad AND e.nombre = :datoNombre ORDER BY e.apellido DESC")
@NamedQuery(name = "Estudiante.buscarPorSemestreHoras", query = "SELECT e FROM Estudiante e WHERE e.semestre = :datoSemestre AND e.numeroHorasSemanales = :datoNumHoras ")

@NamedNativeQueries ({
	 @NamedNativeQuery( name = "Estudiante.buscarPorSemestreApellidoNamedNative", query ="SELECT * FROM Estudiante  WHERE estu_semestre = :datoSemestre AND estu_apellido = :datoApellido",resultClass = Estudiante.class),
	 @NamedNativeQuery(name = "Estudiante.buscarPorEdadNamedNative", query = "SELECT * FROM Estudiante  WHERE estu_edad = :datoEdad",resultClass = Estudiante.class )
})

public class Estudiante {
	
	@Id
	@Column(name="estu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_id_seq") 
	@SequenceGenerator(name = "estu_id_seq", sequenceName = "estu_id_seq", allocationSize = 1) 
	private Integer id;
	
	@Column (name= "estu_cedula")
	private Integer cedula;
	
	@Column (name ="estu_nombre")
	private String nombre;
	
	@Column (name ="estu_apellido")
	private String apellido;
	
	@Column (name ="estu_semestre")
	private String semestre;
	
	@Column (name ="estu_materias")
	private Integer numeroMaterias;
	
	@Column (name ="estu_horas")
	private Integer numeroHorasSemanales;
	
	@Column (name = "estu_edad")
	private String edad;
	
	
	

	@Override
	public String toString() {
		return "\n Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", semestre=" + semestre + ", numeroMaterias=" + numeroMaterias + ", numeroHorasSemanales="
				+ numeroHorasSemanales + ", edad=" + edad + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public Integer getNumeroMaterias() {
		return numeroMaterias;
	}

	public void setNumeroMaterias(Integer numeroMaterias) {
		this.numeroMaterias = numeroMaterias;
	}

	public Integer getNumeroHorasSemanales() {
		return numeroHorasSemanales;
	}

	public void setNumeroHorasSemanales(Integer numeroHorasSemanales) {
		this.numeroHorasSemanales = numeroHorasSemanales;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	
	
	

	
	
	
	
}
