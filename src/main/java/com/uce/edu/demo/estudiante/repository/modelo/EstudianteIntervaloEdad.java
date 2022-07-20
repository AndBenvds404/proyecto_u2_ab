package com.uce.edu.demo.estudiante.repository.modelo;

public class EstudianteIntervaloEdad {
	
	private Integer cedula;
	private String apellido;
	
	public EstudianteIntervaloEdad() {
		// TODO Auto-generated constructor stub
	}
	
	public EstudianteIntervaloEdad(Integer cedula, String apellido) {
		// TODO Auto-generated constructor stub
		this.cedula=cedula;
		this.apellido=apellido;
	}

	@Override
	public String toString() {
		return "EstudianteIntervaloEdad [cedula=" + cedula + ", apellido=" + apellido + "]";
	}
	

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	

}
