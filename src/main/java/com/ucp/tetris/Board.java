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
  public int filasEliminadas = 0;

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

  public void spawnPiece(PieceBase pieza, int columnaInicial) {
    pieza.setPosicion(0, columnaInicial); // empieza desde fila 0
    this.currentPiece = pieza;
  }

  public void moveCurrentPieceDown() {
    int nuevaFila = currentPiece.getFila() + 1;
    int columnaActual = currentPiece.getColumna();

    if (puedeBajarPieza(currentPiece, nuevaFila, columnaActual)) {
      currentPiece.setPosicion(nuevaFila, columnaActual); // actualiza la posición
    } else {
      fijarPieza(currentPiece);// la deja fija en el tablero
      cleanLine();    
      generarNuevaPieza();          // crea una nueva pieza
    }
  }

  @Override
  public void tick() {
    if (currentPiece != null) {
      moveCurrentPieceDown(); // intenta mover hacia abajo
    }
  }

  public void startGame() {
    generarNuevaPieza(); // solo genera la pieza
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

    spawnPiece(nueva, columnaInicial);
  }

public void cleanLine(){
  for (int i = 0; i < fila; i++) {
    boolean lineaCompleta = true; // asumo que la línea está completa
    for (int j = 0; j < columna; j++) {
      if (grid[i][j] == 0) {
        lineaCompleta = false; //SI (if) encuentro un espacio vacío, la línea no está completa
        break;
      }
    }
    if (lineaCompleta) {
      removeLine(i); // limpia esa fila y baja las de arriba
      filasEliminadas++;
      i--; // chequea la misma fila nuevamente, ya que las filas de arriba bajaron
    }
  }
}

private void removeLine(int line) {
    for (int i = line; i > 0; i--) {  // baja todas las filas una posición
        for (int j = 0; j < columna; j++) { // recorre todas las columnas para copiar celda por celda.
            grid[i][j] = grid[i - 1][j]; // la fila i se reemplaza por la fila i-1 (bajamos la fila de arriba)
        }
    }

    for (int j = 0; j < columna; j++) { // ahora es necesario limpiar la fila 0 (la de arriba) porque quedó duplicada o con datos viejos.
        grid[0][j] = 0; // marca cada celda de la fila 0 como vacía (0).
    }
}

}
