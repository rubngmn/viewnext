package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelesService;

/**
 * @author Rubén Gimeno
 *
 */
@RestController
public class HotelesController implements HotelesService {
	@Autowired
	HotelesService service;

	/**
	 * Devuelve los hoteles disponibles
	 * 
	 * @url http://localhost:1201/hoteles
	 * @param disponibilidad
	 * @return
	 */
	@Override
	@GetMapping(value = "hoteles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> hotelesDisponibles() {
		return service.hotelesDisponibles();
	}

	/**
	 * Devuelve la información de un hotel al pasarle su nombre
	 * 
	 * @url http://localhost:1201/hoteles/nombre/{nombre}
	 * @param nombre
	 * @return
	 */
	@Override
	@GetMapping(value = "hoteles/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hotel getHotelesNombre(@PathVariable("nombre") String nombre) {
		return service.getHotelesNombre(nombre);
	}

}
