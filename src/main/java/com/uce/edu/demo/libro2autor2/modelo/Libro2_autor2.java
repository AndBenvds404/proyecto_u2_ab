package com.uce.edu.demo.libro2autor2.modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro2_autor2")
public class Libro2_autor2 {
	
	@Id
	@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Liau2_id_seq")
    @SequenceGenerator(name = "Liau2_id_seq", sequenceName = "Liau2_id_seq", allocationSize = 1)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "aut2_id_autor2")
	private Autor2 autor2;
	
	@ManyToOne
	@JoinColumn(name = "lib2_id_libro2")
	private Libro2 libro2;

	
//	@Override
//	public String toString() {
//		return "Libro2_autor2 [id=" + id + ", autor2=" + autor2 + ", libro2=" + libro2 + "]";
//	}


	//SET AND GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Autor2 getAutor2() {
		return autor2;
	}
	public void setAutor2(Autor2 autor2) {
		this.autor2 = autor2;
	}
	public Libro2 getLibro2() {
		return libro2;
	}
	public void setLibro2(Libro2 libro2) {
		this.libro2 = libro2;
	}

	
	


}
