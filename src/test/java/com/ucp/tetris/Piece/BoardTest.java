package com.ucp.tetris.Piece;

import static org.junit.Assert.*;
import org.junit.Test;
import com.ucp.tetris.Board;

public class BoardTest {
    @Test
    public void dimensionesCorrectas() {
        Board b = new Board();
        assertEquals(10, b.getFila());
        assertEquals(20, b.getColumna());
    }

    @Test
    public void testEleCaeHastaElFondo() {
    Board board = new Board();
    Ele ele = new Ele("■");

    // va en fila 0, columna 5
    ele.setPosicion(0, 5);
    board.setCurrentPiece(ele);

    // ticks
    for (int i = 0; i < 15; i++) {
        board.tick();
    }

    // El Ele tiene altura 2, así que su fila máxima es 8 (para que no se salga del tablero de 10 filas)
    assertEquals(7, ele.getFila());
}


}


