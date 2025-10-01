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
    
@Test
public void testTickDeGame() {
    Board board = new Board();
    Game game = new Game(board);

    // cae una ele
    Ele ele1 = new Ele("■");
    board.spawnPiece(ele1, 5);
    
    int filaInicial = ele1.getFila();
    game.tick(); // mueve la pieza y avanza el estado del tablero
    
    assertEquals("La pieza debe bajar una fila después de tick", filaInicial + 1, ele1.getFila());
}


}
