package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.service.ReservasService;
import com.curso.model.Reserva;

/**
 * @author Rubén Gimeno
 *
 */
@RestController
public class ReservasController {
	@Autowired
	ReservasService service;

//	@PostMapping(value = "reservas", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public void hacerReserva(@RequestBody Reserva reserva) {
//		service.hacerReserva(reserva);
//	}
	/**
	 * Endpoint que devuelve las reservas de un hotel dado su nombre
	 * 
	 * @url http://localhost:1202/reservas/hotel/nombre/{nombre}
	 * @param nombre
	 * @return
	 */
	@GetMapping(value = "reservas/hotel/nombre/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> buscarReservasHotelNombre(@PathVariable("nombre") String nombre) {
		return service.buscarReservasHotelNombre(nombre);
	}
}
