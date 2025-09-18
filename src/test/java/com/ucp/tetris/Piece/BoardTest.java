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
}


