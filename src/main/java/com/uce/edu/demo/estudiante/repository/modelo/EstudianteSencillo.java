package com.uce.edu.demo.estudiante.repository.modelo;

public class EstudianteSencillo {
	private String semestre;
	private Integer numeroHorasSemanales;
	
	public EstudianteSencillo() {
		// TODO Auto-generated constructor stub
	}
	
	public EstudianteSencillo (String semestre, Integer horas) {
		this.semestre = semestre;
		this.numeroHorasSemanales=horas;
	}

	@Override
	public String toString() {
		return "EstudianteSencillo [semestre=" + semestre + ", horas=" + numeroHorasSemanales + "]";
	}
	
	//SET AND GET
	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public Integer getHoras() {
		return numeroHorasSemanales;
	}

	public void setHoras(Integer horas) {
		this.numeroHorasSemanales = horas;
	}
	
	
	

}
