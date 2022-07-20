package com.uce.edu.demo.repository.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@Column(name =  "empl_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empl_id_seq") // nombre (original/referencia) del																				// secuencia de la db
	@SequenceGenerator(name = "empl_id_seq", sequenceName = "empl_id_seq", allocationSize = 1) // nombre dela secuecia	
	private Integer id;
	@Column(name =  "empl_codigo_iess")
	private String codigoIess;
	@Column(name =  "empl_salario")
	private BigDecimal salario;
	@OneToOne
	@JoinColumn(name="empl_id_ciudadano")
	private Ciudadano ciudadano;// nombre de variable igual al del atributo en la Tabla/entidad Ciudadno

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", codigoIess=" + codigoIess + ", salario=" + salario + "]";
	}
	
	//SET AND GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoIess() {
		return codigoIess;
	}
	public void setCodigoIess(String codigoIess) {
		this.codigoIess = codigoIess;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}
	public Ciudadano getCiudadano() {
		return ciudadano;
	}
	
	
	
}
