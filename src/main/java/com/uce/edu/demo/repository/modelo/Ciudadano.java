package com.uce.edu.demo.repository.modelo;

import java.time.LocalDateTime;

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
@Table(name = "ciudadano")
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
	
	@Column(name = "ciud_cedula")
	private String cedula;
	
	@Column(name = "ciud_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)// nombre de variable igual al del atributo en la Tabla/entidad Empleado
	private Pasaporte pasaporte;
	
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)// nombre de variable igual al del atributo en la Tabla/entidad Empleado
	private Empleado empleado;

	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", fechaNacimiento=" + fechaNacimiento + ", pasaporte=" + pasaporte + ", empleado=" + empleado + "]";
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	
	
	
	
	
	
	


	
	
}