package com.ucp.tetris;
    
public class Board {
    private final int fila = 10;
    private final int columna = 20;
    private final int[][] grid;

    public Board() {
        grid = new int[fila][columna];
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void moveCurrentPieceDown() {
      // Lógica para mover la pieza actual hacia abajo
      
      
    }
}
