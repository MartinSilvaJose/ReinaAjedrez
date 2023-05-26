package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private Consola(){
		
	}
	public static void mostrarMenu(){
		System.out.println("Elija una opción del 1 al 4:");
		System.out.println("1.-Crear reina por defecto.");
		System.out.println("2.-Crear reina eligiendo el color.");
		System.out.println("3.-Mover");
		System.out.println("4.-Salir");
	}
	public static int elegirOpcionMenu() {
		int opcion;
		
		opcion=Entrada.entero();
		
		return opcion;
	}
	public static Color elegirOpcion(){
		int opcion;
		
		System.out.println("Elija color de la reina:");
		System.out.println("1.-Blanca");
		System.out.println("2.-Negra");
		
		do {
			opcion=Entrada.entero();
		}while(opcion<1||opcion>2);
		
		
		if(opcion==1) {
			return Color.BLANCO;
		}
		else {
			return Color.NEGRO;
		}

	}
	public static Direccion elegirDireccion(){
		System.out.println("Selecciona la dirección a la que desea moverse.");
		System.out.println("1.-Norte");
		System.out.println("2.-Sur");
		System.out.println("3.-Este");
		System.out.println("4.-Oeste");
		System.out.println("5.-Noreste");
		System.out.println("6.-Noroeste");
		System.out.println("7.-Sureste");
		System.out.println("8.-Suroeste");
		
		int opcion;
		
		do {
			opcion=Entrada.entero();
		}while(opcion<1||opcion>8);
		
		switch (opcion) {
		case 1: {
			return Direccion.NORTE;
			
		}
		case 2: {
			return Direccion.SUR;
			
		}
		case 3: {
			return Direccion.ESTE;
			
		}
		case 4: {
			return Direccion.OESTE;
			
		}
		case 5: {
			return Direccion.NORESTE;
			
		}
		case 6: {
			return Direccion.NOROESTE;
			
		}
		case 7: {
			return Direccion.SURESTE;
			
		}
		case 8: {
			return Direccion.SUROESTE;
			
		}
		
		default:
			throw new IllegalArgumentException("Valor inesperador: " + opcion);
		}
	}
	
	public static int elegirPasos(){
		int pasos;
		System.out.println("Selecciona el número de paso a mover del 1 al 8.");
		do {
			pasos=Entrada.entero();
		}while(pasos<1||pasos>8);
		
		return pasos;
	}
	
	public static void despedirse() {
		System.out.println("Hasta la próxima.");
	}

}
