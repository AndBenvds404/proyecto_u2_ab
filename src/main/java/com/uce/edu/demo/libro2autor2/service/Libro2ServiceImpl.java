package com.uce.edu.demo.libro2autor2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libro2autor2.modelo.Libro2;
import com.uce.edu.demo.libro2autor2.repository.ILibro2Repository;
@Service
public class Libro2ServiceImpl  implements ILibro2Service{
	
	@Autowired
	private ILibro2Repository iLibro2Repository;
	
	@Override
	public void insertar(Libro2 l) {
		// TODO Auto-generated method stub
		this.iLibro2Repository.insertar(l);
	}

}
