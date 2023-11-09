package com.curso.ejercicioJueves09;

/**
 * @author Ruben
 */
public class Reponedor extends EmpleadoSupermercado {

	public Reponedor(int numEmpleado, String nombreEmpleado, String ciudad) {
		super(numEmpleado, nombreEmpleado, ciudad);
	}

	@Override
	protected void saludar() {
		super.saludar();
	}

	@Override
	protected void reponer() {
		super.reponer();
		System.out.println(nombreEmpleado + " está reponiendo la fruta");
	}

}
