package com.curso.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Rubén Gimeno
 *
 */
@Entity
@Table(name = "vuelos")
public class Vuelo {
	
	@Id
	@Column(name = "id_vuelo")
	private int idVuelo;
	private String compania;
	private LocalDate fecha;
	private double precio;
	private int plazas;

	public Vuelo() {
		super();
	}

	public Vuelo(String compania, double precio, int plazas) {
		super();
		this.compania = compania;
		this.fecha = LocalDate.now();
		this.precio = precio;
		this.plazas = plazas;
	}

	public Vuelo(int idVuelo, String compania, double precio, int plazas) {
		super();
		this.idVuelo = idVuelo;
		this.compania = compania;
		this.fecha = LocalDate.now();
		this.precio = precio;
		this.plazas = plazas;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

}
