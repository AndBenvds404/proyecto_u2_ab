package com.uce.edu.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table (name = "persona1")// nombre de la tabla de la base de datos
public class Persona {
	
	@Id
	@Column (name = "id")//nombre de la columna en la tabla DB
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "pers_id_seq")//nombre (original/referencia) del secuencia de la db
	@SequenceGenerator(name="pers_id_seq", sequenceName = "pers_id_seq",allocationSize = 1)//nombre dela secuecia de la base de datos (obligatorio debe ser igual) y tamaño de incremento
	private Integer id;
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "apellido")
	private String apellido;
	
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	//set and get
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
	
	
	
	
}
