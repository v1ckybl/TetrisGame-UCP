package com.ucp.tetris.Piece;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ucp.tetris.Board;
import com.ucp.tetris.Game;

public class GameTest {
    
    @Test
  public void chequeoTablero() {
    Board b = new Board();
    assertEquals(20, b.getFila());
    assertEquals(10, b.getColumna());
  }

  @Test
    public void testConstructorNoException() {
        Board board = new Board();
        new Game(board);
        // Si no lanza excepción, el constructor funciona
    }
}
