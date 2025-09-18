package com.ucp.tetris;

public class Game {

    private final Board tablero;       
    private boolean[][] piezaActual;   
    private int fila;                  
    private int columna;               

    public Game() {
        this.tablero = new Board();    
        this.piezaActual = null;       
        this.fila = 0;
        this.columna = 3;              
    }

                                  
    public Board getTablero() {  //Devuelve el tablero actual
        return tablero;
    }
