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

    // va en fila 0, columna 5
    ele.setPosicion(0, 5);
    board.setCurrentPiece(ele);

    // ticks
    for (int i = 0; i < 20; i++) {
        board.tick();
    }

    assertEquals(17, ele.getFila());
}

    @Test
    public void testEleChocaConOtraPieza() {
        Board board = new Board();

        // Fijamos un cuadrado en el fondo en columna 5
        Square bloqueFijo = new Square("■");
        bloqueFijo.setPosicion(18, 5); // ocupa filas 18 y 19
        board.fijarPieza(bloqueFijo);

        // Creamos una Ele que empieza en fila 0, columna 5
        Ele ele = new Ele("■");
        ele.setPosicion(0, 5);
        board.setCurrentPiece(ele);

        // Hacemos caer la Ele simulando ticks
        for (int i = 0; i < 20; i++) {
            board.tick();
        }

        // La Ele debería detenerse en fila 15, justo encima del cuadrado
        assertEquals(15, ele.getFila());
}









}


