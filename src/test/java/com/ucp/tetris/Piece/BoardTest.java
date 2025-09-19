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
    public void testSquareCaeEncimaDeEle() {
    Board board = new Board();

    // 1. Creamos una Ele y la dejamos caer hasta el fondo
    Ele ele = new Ele("■");
    ele.setPosicion(0, 5);
    board.setCurrentPiece(ele);

    for (int i = 0; i < 20; i++) {
        board.tick(); // la Ele llega al fondo y se fija
    }

    // Verificamos que la Ele quedó en fila 17
    assertEquals(17, ele.getFila());

    // 2. Ahora tiramos un Square encima en la misma columna
    Square square = new Square("■");
    square.setPosicion(0, 5);
    board.setCurrentPiece(square);

    for (int i = 0; i < 20; i++) {
        board.tick();
    }

    // El Square debería caer y detenerse justo arriba de la Ele
    // Como la Ele ocupa hasta fila 19, el Square (que mide 2 de alto)
    // debe quedar con su fila inicial en 15
    assertEquals(15, square.getFila());
}









}


