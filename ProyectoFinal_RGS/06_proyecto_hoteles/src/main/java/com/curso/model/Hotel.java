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
@Table(name = "hoteles")
public class Hotel {

	@Id
	@Column(name = "id_hotel")
	private int idHotel;
	private String nombre;
	private int categoria;
	private String precio;
	private boolean disponibilidad;

	public Hotel() {
		super();
	}

	public Hotel(String nombre, int categoria, String precio, boolean disponibilidad) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}

	public Hotel(int idHotel, String nombre, int categoria, String precio, boolean disponibilidad) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
