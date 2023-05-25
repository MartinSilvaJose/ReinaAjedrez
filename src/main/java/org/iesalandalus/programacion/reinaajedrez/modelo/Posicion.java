package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {
	private int fila;
	private char columna;
	
	public Posicion(int fila,char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	public Posicion(Posicion p) {
		if(p==null) {
			throw new NullPointerException("ERROR:El objeto que se quiere copiar en nulo.");
		}
		else {
			setFila(p.getFila());
			setColumna(p.getColumna());
		}
	}
	public int getFila() {
		return fila;
	}
	
	public void setFila(int fila) {
		if(fila>=1 && fila<=8) {
			this.fila = fila;
		}
		else {
			throw new IllegalArgumentException("ERROR:La fila no está entre los posibles movimientos.");
		}
	}
	
	public char getColumna() {
		return columna;
	}
	
	public void setColumna(char columna) {
		if(columna=='a' || columna=='b' || columna=='c' || columna=='d' || columna=='e' || columna=='f' || columna=='g' || columna=='h') {
			this.columna = columna;
		}
		else {
			throw new IllegalArgumentException("ERROR:La columna no está entre los posibles movimientos.");
		}
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return "Posicion [fila=" + getFila() + ", columna=" + getColumna() + "]";
	}
	
	
}
