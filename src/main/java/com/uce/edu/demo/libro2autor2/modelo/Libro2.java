package com.uce.edu.demo.libro2autor2.modelo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro2")
public class Libro2 {
	@Id
	@Column(name = "lib2_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lib2_id_seq")
    @SequenceGenerator(name = "lib2_id_seq", sequenceName = "lib2_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "lib2_titulo")
	private String titulo;
	
	@Column(name = "lib2_cantidad_paginas")
	private String paginas;
	
	@OneToMany (mappedBy = "libro2", cascade = CascadeType.ALL)
	private Set<Libro2_autor2> libro2_autor2;

//	@Override
//	public String toString() {
//		return "Libro2 [id=" + id + ", titulo=" + titulo + ", paginas=" + paginas + ", libro2_autor2=" + libro2_autor2
//				+ "]";
//	}

	//SET AND GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public Set<Libro2_autor2> getLibro2_autor2() {
		return libro2_autor2;
	}

	public void setLibro2_autor2(Set<Libro2_autor2> libro2_autor2) {
		this.libro2_autor2 = libro2_autor2;
	}
	
	

}
