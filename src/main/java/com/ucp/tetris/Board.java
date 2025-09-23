package com.ucp.tetris;

import java.util.List;
import java.util.Random;

import com.ucp.tetris.Piece.Dog;
import com.ucp.tetris.Piece.Ele;
import com.ucp.tetris.Piece.PieceBase;
import com.ucp.tetris.Piece.Square;

public class Board implements ITick {
  private final int fila = 20;
  private final int columna = 10;
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

  public void setCurrentPiece(PieceBase pieza) {
    this.currentPiece = pieza;
  }

  public int getFilaPosition() {
        return currentPiece.filaActual;
    }

  public int getColumnaPosition() {
        return currentPiece.columnaActual;
    }

    

  public void setPosicion(PieceBase pieza, int fila, int columna) {
        pieza.filaActual = fila;
        pieza.columnaActual = columna;
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
      moveCurrentPieceDown(); // intenta mover hacia abajo
    }
  }

    public boolean puedeBajarPieza(PieceBase pieza, int nuevaFila, int columnaActual) {
    List<List<String>> forma = pieza.getShape(); // la forma de la pieza (matriz de símbolos)

    for (int i = 0; i < forma.size(); i++) {
        for (int j = 0; j < forma.get(i).size(); j++) {
            if (forma.get(i).get(j) != null) {
                int filaDestino = nuevaFila + i;
                int columnaDestino = columnaActual + j;

                // Verifica si se sale del tablero
                if (filaDestino >= this.fila || columnaDestino < 0 || columnaDestino >= this.columna) {
                    return false;
                }

                // Verifica si la celda está ocupada
                if (grid[filaDestino][columnaDestino] != 0) {
                    return false;
                }
            }
        }
    }
    return true; // si pasó todas las validaciones, puede bajar
}

    public void fijarPieza(PieceBase pieza) {
    List<List<String>> forma = pieza.getShape();
    int fila = pieza.getFila();
    int columna = pieza.getColumna();

    for (int i = 0; i < forma.size(); i++) {
        for (int j = 0; j < forma.get(i).size(); j++) {
            if (forma.get(i).get(j) != null) {
                grid[fila + i][columna + j] = 1; // marca la celda como ocupada
            }
        }
    }
}

public void generarNuevaPieza() {
    PieceBase nueva;
    int tipo = new Random().nextInt(3); // 0, 1 o 2

    switch (tipo) {
        case 0 -> nueva = new Square("■");
        case 1 -> nueva = new Dog("■");
        case 2 -> nueva = new Ele("■");
        default -> nueva = new Square("■");
    }

    int ancho = nueva.getShape().get(0).size();
    int columnaInicial = new Random().nextInt(columna - ancho);

    nueva.setPosicion(0, columnaInicial);
    this.currentPiece = nueva;
}


}

