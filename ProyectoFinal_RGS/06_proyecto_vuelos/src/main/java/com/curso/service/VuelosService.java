package com.curso.service;

import java.util.List;

import com.curso.model.Vuelo;

/**
 * @author Rubén Gimeno
 *
 */
public interface VuelosService {

	/**
	 * Método que devuelve todos los vuelos
	 * 
	 * @return
	 */
//	List<Vuelo> findAllVuelos();

	/**
	 * Método que devuelve la lista de vuelos disponibles al recibir una petición
	 * get, siempre que haya plazas disponibles
	 * 
	 * @param plazas
	 * @return
	 */
	List<Vuelo> getVuelosPlazas(int plazas);

	/**
	 * Método para actualizar un vuelo
	 * 
	 * @param idVuelo
	 * @param plazas
	 */
	void actualizarVuelo(int idVuelo, int plazas);
}
