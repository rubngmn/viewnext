package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Hotel;

/**
 * @author Rubén Gimeno
 *
 */
public interface HotelesDao extends JpaRepository<Hotel, Integer> {
	
	@Query("SELECT p FROM Hotel p WHERE p.nombre = :nombre")
	Hotel buscarNombre(@Param("nombre") String nombre);
	
}
