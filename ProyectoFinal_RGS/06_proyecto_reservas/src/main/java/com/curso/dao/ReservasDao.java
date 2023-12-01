package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Reserva;

/**
 * @author Rubén Gimeno
 *
 */
public interface ReservasDao extends JpaRepository<Reserva, Integer> {
	
}
