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
    int nuevaFila = currentPiece.getFila() + 1;
    int columnaActual = currentPiece.getColumna();

    if (puedeBajarPieza(currentPiece, nuevaFila, columnaActual)) {
        currentPiece.setPosicion(nuevaFila, columnaActual); // actualiza la posición
    } else {
        fijarPieza(currentPiece);     // la deja fija en el tablero
        generarNuevaPieza();          // crea una nueva pieza
    }
}


  @Override
  public void tick() {
    if (currentPiece != null) {
      currentPiece.moveCurrentPieceDown(this); // intenta mover hacia abajo
    }
  }




    /*Verifica si la pieza puede bajar una fila sin salirse del tablero ni chocar con otra pieza.
    public boolean puedeBajarPieza(PieceBase pieza, int nuevaFila, int columnaActual) {
        var forma = pieza.getShape(); // matriz de la forma de la pieza

        for (int i = 0; i < forma.size(); i++) {
            for (int j = 0; j < forma.get(i).size(); j++) {
                if (forma.get(i).get(j) != null) {
                    int filaDestino = nuevaFila + i;
                    int columnaDestino = columnaActual + j;

                    // Verifica si se sale del tablero o pisa una celda ocupada
                    if (filaDestino >= this.fila || columnaDestino < 0 || columnaDestino >= this.columna || grid[filaDestino][columnaDestino] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }*/

}

