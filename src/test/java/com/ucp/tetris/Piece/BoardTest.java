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
    ele.setPosicion(0, 5);
    board.setCurrentPiece(ele);

    // ticks
    for (int j = 0; j < 20; j++) {
      board.tick();
    }

    assertEquals(17, ele.getFila());
  }

  @Test
    public void testSquareCaeEncimaDeEle() {
    Board board = new Board();

    // 1. Crear la Ele y dejarla caer hasta el fondo
    Ele ele = new Ele("■");
    ele.setPosicion(0, 5);
    board.setCurrentPiece(ele);

    for (int i = 0; i < 20; i++) {
        board.tick();
    }

    // La Ele debería quedar en fila 17 (porque mide 3 de alto)
    assertEquals(17, ele.getFila());

    // 2. Ahora tiramos un Square en la misma columna
    Square square = new Square("■");
    square.setPosicion(0, 5);
    board.setCurrentPiece(square);

    for (int k = 0; k < 20; k++) {
        board.tick();
    }

    // El Square mide 2 de alto, así que debería quedar en fila 15 (encima de la Ele)
    assertEquals(15, square.getFila());
}

}