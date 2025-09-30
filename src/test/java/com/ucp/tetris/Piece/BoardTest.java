package com.ucp.tetris.Piece;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.ucp.tetris.Board;

public class BoardTest {
  @Test
  public void dimensionesCorrectas() {
    Board b = new Board();
    assertEquals(20, b.getFila());
    assertEquals(10, b.getColumna());
  }

  @Test
  public void testEleCaeHastaElFondo() {
    Board board = new Board();
    Ele ele = new Ele("■");

    // empieza en fila 0, columna 5
    board.spawnPiece(ele, 5); //agora sii, el tablero settea la pieza

    assertEquals(0, ele.getFila());
    assertEquals(5, ele.getColumna());

    // ticks
    for (int j = 0; j < 20; j++) {
      board.tick();
    }

    assertEquals(17, ele.getFila());
    assertEquals(5, ele.getColumna());

    /*assertTrue(board.getGrid()[17][5] != 0);
    assertTrue(board.getGrid()[18][5] != 0);
    assertTrue(board.getGrid()[19][5] != 0);
    assertTrue(board.getGrid()[19][6] != 0);*/

  }

  @Test
  public void testSquareCaeEncimaDeEle() {
    Board board = new Board();

    // cae una ele
    Ele ele = new Ele("■");
    board.spawnPiece(ele, 5);

    for (int i = 0; i < 20; i++) {
      board.tick();
    }

    assertEquals(17, ele.getFila());
    assertEquals(5, ele.getColumna());

    // cae un squaree en la misma columna
    Square square = new Square("■");
    board.spawnPiece(square, 5);

    for (int k = 0; k < 20; k++) {
      board.tick();
    }

    // square queda sobre la eLe o sea en filaquince
    assertEquals(15, square.getFila());
    assertEquals(5, square.getColumna());
  }

  @Test
  public void teststickCaeEncimaDeEle() {
    Board board = new Board();

    // cae una ele
    Ele ele = new Ele("■");
    board.spawnPiece(ele, 5);

    for (int i = 0; i < 20; i++) {
      board.tick();
    }

    assertEquals(17, ele.getFila());
    assertEquals(5, ele.getColumna());

    // cae un stick 
    Stick stick = new Stick("■");
    board.spawnPiece(stick, 6);

    for (int k = 0; k < 20; k++) {
      board.tick();
    }
    // stick queda sobre la eLe o sea en filaquince
    assertEquals(15, stick.getFila());

  }

  //test que no entre más allá del borde
  @Test
  public void testSaleDelTablero() {
    Board board = new Board();
    Ele ele = new Ele("■");
    board.spawnPiece(ele, 8); // empieza en columna 8
    board.tick(); // tick para intentar bajar

    // intenta mover fuera del tablero
    ele.setPosicion(0, 9); // mueve a columna 9

    assertEquals("No se puede mover la pieza", 0, ele.getFila()); // sigue en fila 0
    assertEquals("No se puede mover la pieza", 9, ele.getColumna()); // sigue en columna 9
  }

  @Test
  public void testEstaLlenoChe() {
    Board board = new Board();

    // Llenamos la fila 0 manualmente
    for (int j = 0; j < board.getColumna(); j++) {
      board.getGrid()[0][j] = 1; // ocupamos toda la fila superior
    }

    // Intentamos generar una nueva pieza
    PieceBase pieza = new Square("■"); // o cualquier otra
    board.spawnPiece(pieza, 0); // la intentamos colocar en columna 0

    // Verificamos si la pieza se pudo colocar
    boolean puedeColocarse = board.puedeBajarPieza(pieza, 0, 0);

    assertFalse("No debería poder colocarse una pieza si la fila 0 está ocupada", puedeColocarse);
  }

  //test cayeron tantas piezas distintas 
  @Test
  public void testFilaEliminada() {
    Board board = new Board();

    // cae una ele
    Ele ele1 = new Ele("■");
    board.spawnPiece(ele1, 5);

    for (int i = 0; i < 20; i++) {
      board.tick();
    }

    assertEquals(17, ele1.getFila());
    assertEquals(5, ele1.getColumna());

    // cae un squaree 
    Square square = new Square("■");
    board.spawnPiece(square, 3);

    for (int k = 0; k < 20; k++) {
      board.tick();
    }

    assertEquals(18, square.getFila());
    assertEquals(3, square.getColumna());

    // cae una te
    Te te = new Te("■");
    te.rotateLeft();
    te.rotateLeft();

    board.spawnPiece(te, 0);

    for (int n = 0; n < 20; n++) {
      board.tick();
    }

    assertEquals(18, te.getFila());
    assertEquals(0, te.getColumna());

    //cae un square
    Square square2 = new Square("■");
    board.spawnPiece(square2, 7);

    for (int k = 0; k < 20; k++) {
      board.tick();
    }

    assertEquals(18, square2.getFila());
    assertEquals(7, square2.getColumna());

    //cae stick
    Stick stick = new Stick("■");
    board.spawnPiece(stick, 9);

    for (int k = 0; k < 20; k++) {
      board.tick();
    }

    assertEquals(16, stick.getFila());
    assertEquals(9, stick.getColumna());

    assertTrue("Se eliminaron filas", board.filasEliminadas > 0); // se elimino la fila
  }

  @Test
  public void testCompletaCincoLineasYGana() {
    Board board = new Board();

    // Cada Square ocupa 2x2, así que para llenar una fila de 10 columnas necesitamos 5 Squares por fila.
    // Vamos a llenar las filas 15 a 19 (5 filas) completamente.

    for (int fila = 0; fila < 5; fila++) { // 5 filas
      for (int col = 0; col < 10; col += 2) { // 5 Squares por fila
        Square square = new Square("■");
        board.spawnPiece(square, col);

        // Simula los ticks para que cada Square llegue a la fila deseada
        for (int t = 0; t < 20 - (4 - fila); t++) {
          board.tick();
        }
      }
    }

    // Ahora deberían haberse eliminado 5 filas
    assertEquals("El jugador gana al eliminar 5 filas", 4, board.filasEliminadas);
  }

  @Test
  public void testComenzarJuego() {
    Board board = new Board();
    board.startGame();
    board.tick();
    assertTrue("El juego ha comenzado", board.getStartGame());

  }

  @Test
  public void testNoSePuedenIngresarMasPiezasCuandoTableroLleno() {
    Board board = new Board();

    // Llena todas las filas del tablero con Squares
    for (int fila = 0; fila < board.getFila(); fila++) {
      for (int col = 0; col < board.getColumna(); col += 2) {
        Te te = new Te("■");
        board.spawnPiece(te, col);
        for (int t = 0; t < board.getFila(); t++) {
          board.tick();
        }
      }
    }

    // Intenta ingresar una nueva pieza
    Ele nuevaEle = new Ele("■");
    board.spawnPiece(nuevaEle, 5);
    board.tick(); // intenta moverla
    int[][] grid = board.getGrid();
    for (int i = 0; i < board.getFila(); i++) {
      System.out.print("Fila " + i + ": ");
      for (int j = 0; j < board.getColumna(); j++) {
        System.out.print(grid[i][j] + " ");
      }
      System.out.println();

      // Si la fila 0 está llena, la pieza no puede avanzar (sigue en fila 0)
      assertEquals("Perdiste", true, board.gameOver());
      //assertTrue("Perdiste", board.gameOver());
    }

  }
}