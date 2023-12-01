package com.curso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Rubén Gimeno
 *
 */
@Entity
@Table(name = "reservas")
public class Reserva {
		
	@Id
	@Column(name = "id_reserva")
	private int idReserva;
	@Column(name = "nombre_cliente")
	private String nombreCliente;
	private String dni;
	@Column(name = "id_hotel")
	private int idHotel;	
	@Column(name = "id_vuelo")
	private int idVuelo;

	public Reserva() {
		super();
	}

	public Reserva(String nombreCliente, String dni, int idHotel, int idVuelo) {
		super();
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
	}

	public Reserva(int idReserva, String nombreCliente, String dni, int idHotel, int idVuelo) {
		super();
		this.idReserva = idReserva;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
	}

}
