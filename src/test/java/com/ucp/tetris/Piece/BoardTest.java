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

    // cae un squaree 
    Square square = new Square("■");
    board.spawnPiece(square, 3);

    for (int k = 0; k < 20; k++) {
      board.tick();
    }

    assertEquals(18, square.getFila());
    assertEquals(3, square.getColumna());

    // cae una te en la misma columna
    Te te = new Te("■");
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

    //cae ele invertida
    Stick stick = new Stick("■");
    board.spawnPiece(stick, 9);

    for (int k = 0; k < 20; k++) {
      board.tick();
    }

    assertEquals(16, stick.getFila());
    assertEquals(9, stick.getColumna());

    //fila 19 completa
    int[][] grid = board.getGrid();
    for (int j = 0; j < board.getColumna(); j++) {
      assertEquals(1, grid[19][j]); // toda la fila inferior debe estar llena
    }
  }

    @Test
    public void testLimpiaLinea(){
      Board board = new Board();

       int[][] grid = board.getGrid();

        // llenar manualmente la fila 5 con "1" (fila completa)
        for (int j = 0; j < board.getColumna(); j++) {
            grid[5][j] = 1;
        }

         // fila 4 tendrá una sola celda ocupada
        grid[4][0] = 1;

        // ejecutamos la limpieza
        board.cleanLine();

        // verificar que la fila 5 ahora tiene el contenido de la fila 4 original
        assertEquals(1, grid[5][0]);
        for (int j = 1; j < board.getColumna(); j++) {
            assertEquals(0, grid[5][j]);
        }

        // verificar que la fila 4 (que se movió desde la fila 3 original) esté vacía
        boolean fila4Vacia = true;
        for (int j = 0; j < board.getColumna(); j++) {
            if (grid[4][j] != 0) {
                fila4Vacia = false;
                break;
            }
        }
        assertTrue(fila4Vacia);

        // verificar que la fila 0 también esté vacía
        for (int j = 0; j < board.getColumna(); j++) {
            assertEquals(0, grid[0][j]);
        }
    }

    @Test
    public void testCleanLine() {

    Board board = new Board();

    // llenar la última fila (fila 19) a mano
    for (int j = 0; j < board.getColumna(); j++) {
        board.getGrid()[19][j] = 1; // marco todas las celdas como ocupadas
    }

    //  limpiar las líneas completas
    board.cleanLine();

    // ahora la fila 19 debe estar vacía
    for (int j = 0; j < board.getColumna(); j++) {
        assertEquals("la fila 19 debería estar vacía después de limpiar", 0, board.getGrid()[19][j]); 
            
    }
  }
}


  