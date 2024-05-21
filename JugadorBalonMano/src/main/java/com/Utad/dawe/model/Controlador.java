package com.Utad.dawe.model;

public class Controlador {

    private int[] golesPorJornada;
    JugadorBalonmano jugadorBalonmano = new JugadorBalonmano("Carlos", 0);
    String nombre ;
    int dorsal ;
    
    public void setJugador(JugadorBalonmano jugador) {
		jugadorBalonmano = jugador;
		nombre = jugadorBalonmano.getNombre();
		dorsal = jugadorBalonmano.getDorsal();
	}
	
	 public void registrarGoles(int jornada, int goles) {
	        if (jornada >= 1 && jornada <= 10) {
	            golesPorJornada[jornada - 1] = goles;
	        } else {
	            System.out.println("Jornada no válida.");
	        }
	    }

	    public void mostrarEstadisticas() {
	        System.out.println("Estadísticas de " + nombre + " (Dorsal: " + dorsal + "):");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Jornada " + (i + 1) + ": " + golesPorJornada[i] + " goles");
	        }
	    }

	    public void calcularEstadisticas() {
		    int totalGoles = golesTotales(golesPorJornada);
	        double promedioGoles = totalGoles / 10.0;
	        System.out.println("Estadísticas totales de " + nombre + ":");
	        System.out.println("Total de goles marcados: " + totalGoles);
	        System.out.println("Promedio de goles por jornada: " + promedioGoles);
	    }

	
	    public int golesTotales(int[] goles) {
	    	int aux = 0;
			for (int i = 0; i < goles.length; i++) {
				aux = aux +goles[i];
			}
	    	return aux;
		}
}
