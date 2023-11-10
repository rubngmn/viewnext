package com.curso.ejercicioJueves09;

/**
 * @author Ruben
 */
import java.util.ArrayList;

public class Supermercado {

	public static void main(String[] args) {
		// Creamos un Arraylist y añadimos los empleados
		Reponedor reponedor1 = new Reponedor(1, "Andrés", "Valencia");
		Cajero cajero1 = new Cajero(2, "Jorge", "Bilbao", 6);
		ArrayList<EmpleadoSupermercado> empleados = new ArrayList<>();
		empleados.add(reponedor1);
		empleados.add(cajero1);

		// Este bucle dictamina si el empleado es de tipo Reponedor o Cajero,
		// en base a eso puede realizar unas acciones u otras
		System.out.println(empleados.size());
		for (EmpleadoSupermercado i : empleados) {
			if (i instanceof Cajero) {
				((Cajero) i).cobrar();
				((Cajero) i).validarParking();
			} else  {
				((EmpleadoSupermercado) i).saludar();
				((EmpleadoSupermercado) i).reponer();
			}
				
			System.out.println(i.getCiudad());
		}

	}

}
