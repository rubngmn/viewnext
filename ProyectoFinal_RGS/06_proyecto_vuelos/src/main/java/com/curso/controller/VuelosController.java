package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelo;
import com.curso.service.VuelosService;

/**
 * @author Rubén Gimeno
 *
 */
@RestController
public class VuelosController implements VuelosService {
	@Autowired
	VuelosService service;

	/**
	 * Endpoint para ver todos los vuelos
	 * 
	 * @url http://localhost:1203/vuelos
	 * @return
	 */
//	@GetMapping(value = "vuelos", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Vuelo> findVuelos() {
//		return service.findAllVuelos();
//	}

	/**
	 * Endpoint para ver todos los vuelos pasando por url las plazas
	 * 
	 * @url http://localhost:1203/vuelos/{plazas}
	 * @param plazas
	 * @return
	 */
	@GetMapping(value = "vuelos/{plazas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> getVuelosPlazas(@PathVariable("plazas") int plazas) {
		return service.getVuelosPlazas(plazas);
	}

	/**
	 * Endpoint que actualiza un vuelo
	 * 
	 * @url http://localhost:1203/vuelos/{idVuelo}/{plazasReservadas}
	 * @param idVuelo
	 * @param plazasReservadas
	 */
	@PutMapping(value = "vuelos/{idVuelo}/{plazasReservadas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarVuelo(@PathVariable("idvuelo") int idVuelo,
			@PathVariable("plazasReservadas") int plazasReservadas) {
		service.actualizarVuelo(idVuelo, plazasReservadas);
	}
}
