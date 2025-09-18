package com.ucp.tetris;

public class Game {

  private final Board tablero; // El tablero donde se juegan las piezas
  private boolean[][] piezaActual; // Matriz que representa la pieza en juego
  private int fila; // Fila donde está la pieza
  private int columna; // Columna donde está la pieza              

  public Game() {
        this.tablero = new Board();    // Crear un nuevo tablero vacío
        this.piezaActual = null;       // Al inicio no hay pieza
        this.fila = 0;
        this.columna = 3;              // Arranca más o menos en el medio

                                  
    public Board getTablero() {  //Devuelve el tablero actual
        return tablero;
    }
}
}
  
