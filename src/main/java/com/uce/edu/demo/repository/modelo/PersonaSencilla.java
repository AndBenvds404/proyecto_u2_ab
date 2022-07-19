package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

public class PersonaSencilla implements Serializable{ //objeto para transferencia de datos
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	
	public PersonaSencilla() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonaSencilla( String nombre, String apellido) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	@Override
	public String toString() {
		return "\nPersonaSencilla [nombre=" + nombre + ", apellido=" + apellido + "]";
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
