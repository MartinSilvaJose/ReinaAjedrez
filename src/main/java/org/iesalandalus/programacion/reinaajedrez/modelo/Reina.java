package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Posicion posicion;
	private Color color;
	
	private void setPosicion(Posicion posicion) {
		if(posicion==null) {
			throw new NullPointerException("ERROR:No se puede pasar una posición nula.");
		}
		this.posicion=new Posicion(posicion);
	}
	private void setColor(Color color) {
		if(color==null) {
			throw new NullPointerException("ERROR:No se puede tener un color nulo.");
		}
		this.color=color;
	}
	
	public Posicion getPosicion() {
		return new Posicion(posicion);
	}
	
	public Color getColor() {
		return color;
	}
	
	public Reina() {
		setPosicion(new Posicion(1,'d'));
		setColor(Color.BLANCO);
	}
	public Reina(Color color) {
		if(color==null) {
			throw new NullPointerException("ERROR:El color introducido no puede ser null.");
		}
		if(color==Color.BLANCO) {
			setPosicion(new Posicion(1,'d'));
			setColor(Color.BLANCO);
		}
		if(color==Color.NEGRO) {
			setPosicion(new Posicion(8,'b'));
			setColor(Color.NEGRO);
		}
	}
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if(direccion==null) {
			throw new NullPointerException("ERROR:La dirección no puede ser nula");	
		}
		if(pasos<1 || pasos>7) {
			throw new IllegalArgumentException("ERROR:Los pasos deben estar comprendidos entre 1 y 7");
		}
		if(direccion==Direccion.NORTE) {
			if((posicion.getFila()+pasos)>8) {
				throw new OperationNotSupportedException("ERROR:Se ha excedido el tamaño del tablero.");
			}else {
				posicion.setFila(posicion.getFila()+pasos);
			}
		}
		if(direccion==Direccion.SUR) {
			if((posicion.getFila()-pasos)<1) {
				throw new OperationNotSupportedException("ERROR:Se ha excedido el tamaño del tablero.");
			}else {
				posicion.setFila(posicion.getFila()-pasos);
			}
		}
		if (direccion.equals(Direccion.ESTE)) {
			if(pasos==1) {
				if(posicion.getColumna()=='a') {
					posicion.setColumna('b');
				}
				else if(posicion.getColumna()=='b') {
					posicion.setColumna('c');
				}
				else if(posicion.getColumna()=='c') {
					posicion.setColumna('d');	
				}
				else if(posicion.getColumna()=='d') {
					posicion.setColumna('e');
				}
				else if(posicion.getColumna()=='e') {
					posicion.setColumna('f');	
				}
				else if(posicion.getColumna()=='f') {
					posicion.setColumna('g');
				}
				else if(posicion.getColumna()=='g') {
					posicion.setColumna('h');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==2) {
				if(posicion.getColumna()=='a') {
					posicion.setColumna('c');
				}
				else if(posicion.getColumna()=='b') {
					posicion.setColumna('d');
				}
				else if(posicion.getColumna()=='c') {
						posicion.setColumna('e');
				}
				else if(posicion.getColumna()=='d') {
					posicion.setColumna('f');
				}
				else if(posicion.getColumna()=='e') {
					posicion.setColumna('g');	
				}
				else if(posicion.getColumna()=='f') {
					posicion.setColumna('h');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==3) {
				if(posicion.getColumna()=='a') {
					posicion.setColumna('d');
				}
				else if(posicion.getColumna()=='b') {
					posicion.setColumna('e');
				}
				else if(posicion.getColumna()=='c') {
					posicion.setColumna('f');
				}
				else if(posicion.getColumna()=='d') {
					posicion.setColumna('g');
				}
				else if(posicion.getColumna()=='e') {
					posicion.setColumna('h');	
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==4) {
				 if(posicion.getColumna()=='a') {
					posicion.setColumna('e');
				}
				else if(posicion.getColumna()=='b') {
					posicion.setColumna('f');
				}
				else if(posicion.getColumna()=='c') {
					posicion.setColumna('g');
				}
				else if(posicion.getColumna()=='d') {
					posicion.setColumna('h');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==5) {
				if(posicion.getColumna()=='a') {
					posicion.setColumna('f');
				}
				if(posicion.getColumna()=='b') {
					posicion.setColumna('g');
				}
				if(posicion.getColumna()=='c') {
					posicion.setColumna('h');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==6) {
				if(posicion.getColumna()=='a') {
					posicion.setColumna('g');
				}
				if(posicion.getColumna()=='b') {
					posicion.setColumna('h');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==7) {
				if(posicion.getColumna()=='a') {
					posicion.setColumna('h');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
		}
		
		if (direccion==Direccion.OESTE) {
			if(pasos==1) {
				if(posicion.getColumna()=='h') {
					posicion.setColumna('g');
				}
				else if(posicion.getColumna()=='g') {
					posicion.setColumna('f');
				}
				else if(posicion.getColumna()=='f') {
					posicion.setColumna('e');
				}
				else if(posicion.getColumna()=='e') {
					posicion.setColumna('d');
				}
				else if(posicion.getColumna()=='d') {
					posicion.setColumna('c');	
				}
				else if(posicion.getColumna()=='c') {
					posicion.setColumna('b');
				}
				else if(posicion.getColumna()=='b') {
					posicion.setColumna('a');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==2) {
				if(posicion.getColumna()=='h') {
					posicion.setColumna('f');
				}
				else if(posicion.getColumna()=='g') {
					posicion.setColumna('e');
				}
				else if(posicion.getColumna()=='f') {
					posicion.setColumna('d');
				}
				else if(posicion.getColumna()=='e') {
					posicion.setColumna('c');
				}
				else if(posicion.getColumna()=='d') {
					posicion.setColumna('b');	
				}
				else if(posicion.getColumna()=='c') {
					posicion.setColumna('a');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==3) {
				if(posicion.getColumna()=='h') {
					posicion.setColumna('e');
				}
				else if(posicion.getColumna()=='g') {
					posicion.setColumna('d');
				}
				else if(posicion.getColumna()=='f') {
					posicion.setColumna('c');
				}
				else if(posicion.getColumna()=='e') {
					posicion.setColumna('b');
				}
				else if(posicion.getColumna()=='d') {
					posicion.setColumna('a');	
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==4) {
				if(posicion.getColumna()=='h') {
					posicion.setColumna('d');
				}
				else if(posicion.getColumna()=='g') {
					posicion.setColumna('c');
				}
				else if(posicion.getColumna()=='f') {
					posicion.setColumna('b');
				}
				else if(posicion.getColumna()=='e') {
					posicion.setColumna('a');
				}

				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==5) {
				if(posicion.getColumna()=='h') {
					posicion.setColumna('c');
				}
				else if(posicion.getColumna()=='g') {
					posicion.setColumna('b');
				}
				else if(posicion.getColumna()=='f') {
					posicion.setColumna('a');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==6) {
				if(posicion.getColumna()=='h') {
					posicion.setColumna('b');
				}
				else if(posicion.getColumna()=='g') {
					posicion.setColumna('a');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==7) {
				if(posicion.getColumna()=='h') {
					posicion.setColumna('a');
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
		}
		if (direccion==Direccion.NORESTE) {
			
			if(pasos==1) {
				
				if(posicion.getFila()+1<8) {
					
					posicion.setFila(posicion.getFila()+1);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==2) {
				if(posicion.getFila()+2<8){
					
					posicion.setFila(posicion.getFila()+2);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='c') {
							posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
				
			}
			if(pasos==3) {
				if(posicion.getFila()+3<8) {
					
					posicion.setFila(posicion.getFila()+3);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==4) {
				if(posicion.getFila()+4<8) {
					
					posicion.setFila(posicion.getFila()+4);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==5) {
				if(posicion.getFila()+5<8) {
					
					posicion.setFila(posicion.getFila()+5);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==6) {
				if(posicion.getFila()+6<8) {
					
					posicion.setFila(posicion.getFila()+6);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==7) {

				if(posicion.getColumna()=='a' && posicion.getFila()+7<8) {
					posicion.setColumna('h');
					posicion.setFila(posicion.getFila()+7);
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
		}
		if (direccion==Direccion.NOROESTE) {
			if(pasos==1) {
				if(posicion.getFila()+1<8) {
					
					posicion.setFila(posicion.getFila()+1);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('a');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==2) {
				if(pasos==1) {
					if(posicion.getFila()+2<8) {
						
						posicion.setFila(posicion.getFila()+2);
						
						if(posicion.getColumna()=='h') {
							posicion.setColumna('f');
						}
						else if(posicion.getColumna()=='g') {
							posicion.setColumna('e');
						}
						else if(posicion.getColumna()=='f') {
							posicion.setColumna('d');
						}
						else if(posicion.getColumna()=='e') {
							posicion.setColumna('c');
						}
						else if(posicion.getColumna()=='d') {
							posicion.setColumna('b');
						}
						else if(posicion.getColumna()=='c') {
							posicion.setColumna('a');
						}
						else {
							throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
						}
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
			}
			if(pasos==3) {
				if(posicion.getFila()+3<8) {
					
					posicion.setFila(posicion.getFila()+3);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('a');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}

			}
			if(pasos==4) {
				if(posicion.getFila()+4<8) {
					
					posicion.setFila(posicion.getFila()+4);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('a');
					}

					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==5) {
				if(posicion.getFila()+5<8) {
					
					posicion.setFila(posicion.getFila()+5);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('a');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==6) {
				if(posicion.getFila()+6<8) {
					
					posicion.setFila(posicion.getFila()+6);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('b');

					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('a');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==7) {
				if(posicion.getColumna()=='h' && posicion.getFila()+7<8) {
					posicion.setColumna('a');
					posicion.setFila(posicion.getFila()+7);
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
		}
		if (direccion.equals(Direccion.SURESTE)) {
			
			if(pasos==1) {
				
				if(posicion.getFila()-1>0) {
					
					posicion.setFila(posicion.getFila()-1);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==2) {
				if(posicion.getFila()-2>0){
					
					posicion.setFila(posicion.getFila()-2);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='c') {
							posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
				
			}
			if(pasos==3) {
				if(posicion.getFila()-3>0) {
					
					posicion.setFila(posicion.getFila()-3);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
			if(pasos==4) {
				if(posicion.getFila()-4>0) {
					
					posicion.setFila(posicion.getFila()-4);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==5) {
				if(posicion.getFila()-5>0) {
					
					posicion.setFila(posicion.getFila()-5);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==6) {
				if(posicion.getFila()-6>0) {
					
					posicion.setFila(posicion.getFila()-6);
					
					if(posicion.getColumna()=='a') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('h');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==7) {

				if(posicion.getColumna()=='a' && posicion.getFila()-7>0) {
					posicion.setColumna('h');
					posicion.setFila(posicion.getFila()-7);
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
		}
		if (direccion==Direccion.SUROESTE) {
			if(pasos==1) {
				if(posicion.getFila()-1>0) {
					
					posicion.setFila(posicion.getFila()-1);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('g');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('f');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='c') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='b') {
						posicion.setColumna('a');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==2) {
				if(pasos==1) {
					if(posicion.getFila()-2>0) {
						
						posicion.setFila(posicion.getFila()-2);
						
						if(posicion.getColumna()=='h') {
							posicion.setColumna('f');
						}
						else if(posicion.getColumna()=='g') {
							posicion.setColumna('e');
						}
						else if(posicion.getColumna()=='f') {
							posicion.setColumna('d');
						}
						else if(posicion.getColumna()=='e') {
							posicion.setColumna('c');
						}
						else if(posicion.getColumna()=='d') {
							posicion.setColumna('b');
						}
						else if(posicion.getColumna()=='c') {
							posicion.setColumna('a');
						}
						else {
							throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
						}
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
			}
			if(pasos==3) {
				if(posicion.getFila()-3>0) {
					
					posicion.setFila(posicion.getFila()-3);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('e');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='d') {
						posicion.setColumna('a');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}

			}
			if(pasos==4) {
				if(posicion.getFila()-4>0) {
					
					posicion.setFila(posicion.getFila()-4);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('d');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='e') {
						posicion.setColumna('a');
					}

					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==5) {
				if(posicion.getFila()-5>0) {
					
					posicion.setFila(posicion.getFila()-5);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('c');
					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('b');
					}
					else if(posicion.getColumna()=='f') {
						posicion.setColumna('a');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
					
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==6) {
				if(posicion.getFila()-6>0) {
					
					posicion.setFila(posicion.getFila()-6);
					
					if(posicion.getColumna()=='h') {
						posicion.setColumna('b');

					}
					else if(posicion.getColumna()=='g') {
						posicion.setColumna('a');
					}
					else {
						throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
					}
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}

			}
			if(pasos==7) {
				if(posicion.getColumna()=='h' && posicion.getFila()-7>0) {
					posicion.setColumna('a');
					posicion.setFila(posicion.getFila()-7);
				}
				else {
					throw new OperationNotSupportedException("ERROR:La posición que desea mover no es posible");
				}
			}
		}
	}

	
	
	@Override
	public String toString() {
		return "Reina [ " + posicion + ", " + color + " ]";
	}
	
}
