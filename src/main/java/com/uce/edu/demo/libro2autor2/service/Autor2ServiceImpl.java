package com.uce.edu.demo.libro2autor2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libro2autor2.modelo.Autor2;
import com.uce.edu.demo.libro2autor2.repository.IAutor2Repository;
@Service
public class Autor2ServiceImpl implements IAutor2Service{

	@Autowired
	private IAutor2Repository iAutor2Repository;
	
	@Override
	public void insert(Autor2 a) {
		// TODO Auto-generated method stub
		this.iAutor2Repository.insertar(a);
		
	}

}
