package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;

/**
 * @author Rubén Gimeno
 *
 */
public interface ReservasService {
	
	/**
	 * Método que devuelve todas las reservas
	 * 
	 * @return
	 */
//	void hacerReserva(Reserva reserva);
	
	/**
	 * Método que devuelve las reservas de un hotel al darle el nombre
	 * 
	 * @param nombre
	 * @return
	 */
	List<Reserva> buscarReservasHotelNombre(String nombre);
}
