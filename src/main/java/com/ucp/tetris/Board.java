package com.ucp.tetris;

import com.ucp.tetris.Piece.PieceBase;

public class Board implements ITick {
    private final int fila = 10;
    private final int columna = 20;
    private final int[][] grid;
    private PieceBase currentPiece; // La pieza que está actualmente en juego

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

     @Override
    public void tick() {
        if (currentPiece != null) {
            currentPiece.moveCurrentPieceDown(this); // intenta mover hacia abajo
        }
}
