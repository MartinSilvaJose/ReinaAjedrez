package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	static Reina reina;
	
	public static void ejecutarOpcion(int opcion) {
		if(opcion>=1 && opcion<=4) {
			switch(opcion){
				case 1:
					crearReinaDefecto();
					mostrarReina();
					break;
				case 2:
					crearReinaColor(Consola.elegirOpcion());
					mostrarReina();
					break;
				case 3:
					mostrarReina();
					mover();
					mostrarReina();
					break;
				case 4:
					Consola.despedirse();
					break;
			}

		}

	}
	public static void crearReinaDefecto() {
		reina=new Reina();
	}
	public static void crearReinaColor(Color color) {
		reina=new Reina(color);
	}
	public static void mover() {
		Direccion direccion=Consola.elegirDireccion();
		int pasos=Consola.elegirPasos();
		
		try {
			reina.mover(direccion,pasos);
		} catch (OperationNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void mostrarReina() {
		if(reina==null) {
			throw new IllegalArgumentException("La reina aún no esta creada.");
		}
		else {
			System.out.println(reina);
		}
	}
	public static void main(String[] args) {
		int opcion=0;
		
		do {
			try {
				Consola.mostrarMenu();
				opcion=Consola.elegirOpcionMenu();
				MainApp.ejecutarOpcion(opcion);
			}catch (IllegalArgumentException | NullPointerException e) {
				System.out.println(e.getMessage());
			}

			
		}while(opcion!=4);

		
	}
}
