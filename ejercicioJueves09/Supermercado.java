package com.curso.ejercicioJueves09;

/**
 * @author Ruben
 */
import java.util.ArrayList;

public class Supermercado {
	
	public static void main(String[] args) {
		// Creamos un Arraylist y añadimos los empleados
		ArrayList<EmpleadoSupermercado> empleados = new ArrayList<EmpleadoSupermercado>();
		empleados.add(new Reponedor(1, "Andrés", "Valencia"));
		empleados.add(new Cajero(2, "Jorge", "Bilbao", 6));
		
		// Este bucle dictamina si el empleado es de tipo Reponedor o Cajero, 
		// en base a eso puede realizar unas acciones u otras
		for (EmpleadoSupermercado i : empleados) {
			if (i instanceof AtenderCliente) {
				((AtenderCliente) i).cobrar();
				((AtenderCliente) i).validarParking();
				((EmpleadoSupermercado) i).saludar();
				((EmpleadoSupermercado) i).reponer();
			} else {
				i.saludar();
				i.reponer();
			}

		}

	}

}
