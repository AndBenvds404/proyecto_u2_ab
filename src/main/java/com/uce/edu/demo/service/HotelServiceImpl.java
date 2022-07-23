package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IHabitacionRepository;
import com.uce.edu.demo.repository.IHotelRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository iHotelRepository;
	
	@Autowired
	private IHabitacionRepository iHabitacionRepository;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		
		this.iHotelRepository.insertar(hotel);
	}
	
	

}
