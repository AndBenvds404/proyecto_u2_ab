package com.uce.edu.demo.estudiante.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;


@Repository
public class EstudianteJdbcRepositoryImpl implements IEstudianteJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertar(Estudiante e) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("insert into estudiante (id,nombre,apellido,semestre,materias,horas) values (?,?,?,?,?,?)",
				new Object[] {e.getCedula(),e.getNombre(),e.getApellido(),e.getSemestre(),e.getNumeroMaterias(),e.getNumeroHorasSemanales()});
		
	}

	@Override
	public Estudiante buscar(Integer cedula) {
		// TODO Auto-generated method stub
        return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", 
                new Object[] {cedula},new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		 this.jdbcTemplate.update("update estudiante set id =?, nombre=?, apellido=?,semestre=?,materias=?,horas=? where id=?", 
				 new Object[] {e.getCedula(),e.getNombre(),e.getApellido(),e.getSemestre(),e.getNumeroMaterias(),e.getNumeroHorasSemanales(),e.getCedula()});
	}

	@Override
	public void eliminar(Integer cedula) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("delete from estudiante where id =?", new Object[] {cedula});
		
	}

	
	
	

}
