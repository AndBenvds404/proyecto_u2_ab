package com.uce.edu.demo.prueba.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//@Entity
//@Table(name="matricula")
public class Matricula {
	
//	@Id
//	@Column(name = "matri_id")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matri_id_seq")
//	@SequenceGenerator (name ="matri_id_seq",sequenceName = "matri_id_seq", allocationSize = 1)
	private Integer id;
	
//	@Column (name = "matri_fechaMatricula")
	private LocalDateTime fechaMatricula;
	
//	@Column (name = "matri_valorMatricula")
	private BigDecimal valorMAtricula;
	
//	@Column (name = "matri_propietario")
	private Propietario propietario;
	
//	@Column (name = "matri_vehiculo")	
	private Vehiculo vehiculo;
	
	
	
	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fechaMatricula=" + fechaMatricula + ", valorMAtricula=" + valorMAtricula
				+ ", propietario=" + propietario + ", vehiculo=" + vehiculo + "]";
	}
	
	//SET AND GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMAtricula() {
		return valorMAtricula;
	}
	public void setValorMAtricula(BigDecimal valorMAtricula) {
		this.valorMAtricula = valorMAtricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	

	
	
	
	

}
