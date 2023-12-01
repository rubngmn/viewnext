package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;

public interface HotelesService {
	/**
	 * Método que devuelve todos los hoteles disponibles
	 * 
	 * @return
	 */
	List<Hotel> hotelesDisponibles();

	/**
	 * Método que devuelve un hotel al pasarle el nombre
	 * 
	 * @param nombre
	 * @return
	 */
	Hotel getHotelesNombre(String nombre);

}
