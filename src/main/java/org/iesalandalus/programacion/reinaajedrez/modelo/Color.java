package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
	BLANCO("Blanco"),
	NEGRO("Negro");
	
	String nombre;
	
	private Color(String cadenaAMostrar) {
		this.nombre=cadenaAMostrar;
	}
	public String toString() {
		return "Color= " + nombre;
	}
}
