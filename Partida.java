/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Tomas
 */
public class Partida {

    public final int filas = 6;
    public final int columnas = 6;
    private final int[][] tablero;
    private String hora;
    private int numeroDePartida;
    private String ganador;
    private int puntajeRojo;
    private int puntajeAzul;

    public Partida() {
        this.tablero = new int[filas][columnas];
    }

    public static void horaJugada(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        // "dd-MM-yyyy HH:mm:ss" formato con fecha
        String formatDateTime = now.format(format);
        System.out.println("Hora de la jugada: " + formatDateTime);
    }

    public int getFilas() {
        return this.filas;
    }

    public int getColumnas() {
        return this.columnas;
    }

    public void setHora(String formatDateTime) {
        this.hora = formatDateTime;
    }

    public String getHora() {
        return this.hora;
    }

    public void setNumeroDePartida(int numeroDePartida) {

        this.numeroDePartida = numeroDePartida;
    }

    public int getNumeroDePartida() {
        return this.numeroDePartida;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getGanador() {
        return this.ganador;
    }

    public void setPuntajeRojo(int puntajeRojo) {
        this.puntajeRojo = puntajeRojo;
    }

    public int getPuntajeRojo() {
        return this.puntajeRojo;
    }

    public void setPuntajeAzul(int puntajeAzul) {
        this.puntajeAzul = puntajeAzul;
    }

    public int getPuntajeAzul() {
        return this.puntajeAzul;
    }
}
