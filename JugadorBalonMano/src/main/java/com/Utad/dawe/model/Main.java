package com.Utad.dawe.model;

public class Main {

	public static void main(String[] args) {
        // Crear dos objetos de la clase JugadorBalonMano
        JugadorBalonmano jugador1 = new JugadorBalonmano("Juan", 10);
        JugadorBalonmano jugador2 = new JugadorBalonmano("Pedro", 7);

        Controlador controlador = new Controlador();
        controlador.setJugador(jugador1);
        controlador.mostrarEstadisticas();
        controlador.calcularEstadisticas();
        controlador.registrarGoles(10, (int) (Math.random() * 5)); 
        controlador.calcularEstadisticas();

        for (int i = 0; i < 10; i++) {
        	controlador.registrarGoles(i + 1, (int) (Math.random() * 5)); 
        	controlador.registrarGoles(i + 1, (int) (Math.random() * 5));
        }

        controlador.setJugador(jugador2);
        controlador.mostrarEstadisticas();
        controlador.calcularEstadisticas();
        controlador.registrarGoles(10, (int) (Math.random() * 5)); 
        controlador.calcularEstadisticas();

    }

}
