package com.uce.edu.demo.repository.modelo.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "libro")
public class Libro {  //elegimos como main
	@Id 
	@Column(name = "libr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr_id_seq") // nombre (original/referencia) del																				// secuencia de la db
	@SequenceGenerator(name = "libr_id_seq", sequenceName = "libr_id_seq", allocationSize = 1) // nombre dela secuecia	
	private Integer id;
	
	@Column(name ="libr_titulo" )
	private String titulo;
	
	@Column(name = "libr_cantidad_paginas")
	private String paginas;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "libro_autor", joinColumns = @JoinColumn(name="liau_id_libro"),//elegimos cualquiera como tabla maestra
				inverseJoinColumns = @JoinColumn(name="liau_id_autor")) 
	private Set<Autor> autores;
	
	
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
	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
	public Set<Autor> getAutores() {
		return autores;
	}
	
}
