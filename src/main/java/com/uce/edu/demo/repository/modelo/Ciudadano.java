package com.uce.edu.demo.repository.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Ciudadano")
public class Ciudadano {
	@Id
	@Column(name = "ciud_id") // nombre de la columna en la tabla DB
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_id_seq") // nombre (original/referencia) del																				// secuencia de la db
	@SequenceGenerator(name = "ciud_id_seq", sequenceName = "ciud_id_seq", allocationSize = 1) // nombre dela secuecia	
	private Integer id;
	
	@Column(name = "ciud_nombre")
	private String nombre;
	
	@Column(name = "ciud_apellido")
	private String apellido;
	
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)// nombre de variable igual al del atributo en la Tabla/entidad Empleado
	private Empleado empleado;
	
	
	
	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Empleado getEmpleado() {
		return empleado;
	}

	
	
}