package com.uce.edu.demo.estudiante.to;

public class Estudiante {
	
	private int cedula;
	private String nombre;
	private String apellido;
	private String semestre;
	private int numeroMaterias;
	private int numeroHorasSemanales;
	
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(int cedula, String nombre, String apellido, String semestre, int numeroMaterias,
			int numeroHorasSemanales) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.semestre = semestre;
		this.numeroMaterias = numeroMaterias;
		this.numeroHorasSemanales = numeroHorasSemanales;
	}


	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", semestre="
				+ semestre + ", numeroMaterias=" + numeroMaterias + ", numeroHorasSemanales=" + numeroHorasSemanales
				+ "]";
	}

	//set and get
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
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
	public int getNumeroMaterias() {
		return numeroMaterias;
	}
	public void setNumeroMaterias(int numeroMaterias) {
		this.numeroMaterias = numeroMaterias;
	}
	public int getNumeroHorasSemanales() {
		return numeroHorasSemanales;
	}
	public void setNumeroHorasSemanales(int numeroHorasSemanales) {
		this.numeroHorasSemanales = numeroHorasSemanales;
	}
	
	
	

}
