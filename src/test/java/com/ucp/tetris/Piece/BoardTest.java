package com.ucp.tetris.Piece;

import static org.junit.Assert.assertEquals;
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
    ele.setPosicion(0, 5);  //la posicion la dbe setear EL TABLEROOOOOOO no la pieza
    board.setCurrentPiece(ele);

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
    ele.setPosicion(0, 5);
    board.setCurrentPiece(ele);

    for (int i = 0; i < 20; i++) {
        board.tick();
    }

    assertEquals(17, ele.getFila());
    assertEquals(5, ele.getColumna());

    // cae un squaree en la misma columna
    Square square = new Square("■");
    square.setPosicion(0, 5);
    board.setCurrentPiece(square);

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
    ele.setPosicion(0, 5);
    board.setCurrentPiece(ele);

    for (int i = 0; i < 20; i++) {
        board.tick();
    }

    assertEquals(17, ele.getFila());
    assertEquals(5, ele.getColumna());

    // cae un sticke en la misma columna
    Stick stick = new stick("■");
    stick.setPosicion(0, 5);
    board.setCurrentPiece(stick);

    for (int k = 0; k < 20; k++) {
        board.tick();
    }
    // square queda sobre la eLe o sea en filaquince
    assertEquals(15, stick.getFila());
}


}