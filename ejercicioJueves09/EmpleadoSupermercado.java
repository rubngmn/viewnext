package com.curso.ejercicioJueves09;

/**
 * @author Ruben
 */
public class EmpleadoSupermercado {
	// Todos los empleados tienen un número de empleado,
	// un nombre y una ciudad donde trabajan
	protected int numEmpleado;
	protected static String nombreEmpleado;
	protected String ciudad;
	
	// Constructor con todos los atributos de los empleados
	public EmpleadoSupermercado(int numEmpleado, String nombreEmpleado, String ciudad) {
		super();
		this.numEmpleado = numEmpleado;
		EmpleadoSupermercado.nombreEmpleado = nombreEmpleado;
		this.ciudad = ciudad;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public String getCiudad() {
		return ciudad;
	}
	// Todos los empleados saludan y reponen
	protected void saludar() {
		System.out.println(
				nombreEmpleado + " con número de empleado " + numEmpleado + " ha saludado a un cliente en " + ciudad);
	}

	protected void reponer() {
		System.out.println(nombreEmpleado + " está reponiendo");
	}
}
