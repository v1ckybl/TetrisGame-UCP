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

    // cae un stick en la misma columna
    Stick stick = new Stick("■");
    board.spawnPiece(stick, 5);

    for (int k = 0; k < 20; k++) {
      board.tick();
    }
    // square queda sobre la eLe o sea en filaquince
    assertEquals(13, stick.getFila());
  }

  //test que limpie 
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

  //test cayeron tantas piezas distintas en la misma columna que no puede caer más
  @Test
  public void testNoCaeMasPiezas() {
    Board board = new Board();

    // cae una ele
    Ele ele1 = new Ele("■");
    board.spawnPiece(ele1, 5);

    for (int i = 0; i < 20; i++) {
      board.tick();
    }

    assertEquals(17, ele1.getFila());
    assertEquals(5, ele1.getColumna());

    // cae un squaree en la misma columna
    Square square = new Square("■");
    board.spawnPiece(square, 5);

    for (int k = 0; k < 20; k++) {
      board.tick();
    }

    assertEquals(15, square.getFila());
    assertEquals(5, square.getColumna());

    // cae un stick en la misma columna
    Stick stick = new Stick("■");
    board.spawnPiece(stick, 5);

    for (int m = 0; m < 20; m++) {
      board.tick();
    }

    assertEquals(11, stick.getFila());
    assertEquals(5, stick.getColumna());

    // cae una te en la misma columna
    Te te = new Te("■");
    board.spawnPiece(te, 5);

    for (int n = 0; n < 20; n++) {
      board.tick();
    }

    assertEquals(10, te.getFila());
    assertEquals(5, te.getColumna());

    //recorro la columna 5 en filas de 19 a la 10 y verifico que estan llenas (hasta la 10)
    int[][] grid = board.getGrid();
    for (int fila = 19; fila >= 10; fila--) {
      assertTrue("La columna no está llena en fila " + fila, grid[fila][5] != 0);
    }
    //recorro la columna 5 y veo que la fila 9 esta vacia
    for (int fila = 9; fila >= 9; fila--) {
      assertFalse("La columna no está llena en fila " + fila, grid[fila][5] != 0);
    }

  }
}