package com.curso.ejercicioJueves09;

/**
 * @author Ruben
 */
public class Cajero extends EmpleadoSupermercado implements AtenderCliente {
	// Los empleados Cajero tienen además el atributo Caja que es donde atienden al
	// cliente
	protected int caja;

	public Cajero(int numEmpleado, String nombreEmpleado, String ciudad, int caja) {
		super(numEmpleado, nombreEmpleado, ciudad);
	}

	public int getCaja() {
		return caja;
	}

	// Los empleados Cajero cobran y validan el parking
	@Override
	public void cobrar() {
		System.out.println(nombreEmpleado + " ha cobrado a un cliente por la caja " + caja);
	}

	@Override
	public void validarParking() {
		System.out.println(nombreEmpleado + " ha validado el parking a un cliente");
	}

}
