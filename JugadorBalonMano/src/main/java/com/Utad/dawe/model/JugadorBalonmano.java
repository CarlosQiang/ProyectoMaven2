package com.Utad.dawe.model;

public class JugadorBalonmano {

	private String nombre; 
	private int dorsal , anotacion ,bloqueo, tiempoJugado;
	
	public JugadorBalonmano(String nombre , int dorsal) {
		this.nombre = nombre;
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getAnotacion() {
		return anotacion;
	}

	public void setAnotacion(int anotacion) {
		this.anotacion = anotacion;
	}

	public int getBloqueo() {
		return bloqueo;
	}

	public void setBloqueo(int bloqueo) {
		this.bloqueo = bloqueo;
	}

	public int getTiempoJugado() {
		return tiempoJugado;
	}

	public void setTiempoJugado(int tiempoJugado) {
		this.tiempoJugado = tiempoJugado;
	}

	@Override
	public String toString() {
		return "JugadorBalonmano [nombre=" + nombre + ", dorsal=" + dorsal + ", anotacion=" + anotacion + ", bloqueo="
				+ bloqueo + ", tiempoJugado=" + tiempoJugado + "]";
	}
	
}
