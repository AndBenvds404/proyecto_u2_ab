package com.uce.edu.demo.cajero.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="ciudadano2")
@Table(name = "ciudadano2")
public class Ciudadano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_id_seq")
    @SequenceGenerator(name = "ciud_id_seq", sequenceName = "ciud_id_seq", allocationSize = 1)
	@Column(name = "ciud_id")
	private Integer id;
	
	@Column(name = "ciud_nombre")
	private String nombre;
	
	@Column(name = "ciud_apellidos")
	private String apelldio;

	@OneToOne(mappedBy = "ciudadano")
	private Cliente cliente;

	
	
	//SET AND GET
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

	public String getApelldio() {
		return apelldio;
	}

	public void setApelldio(String apelldio) {
		this.apelldio = apelldio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
