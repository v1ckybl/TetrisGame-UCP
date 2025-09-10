package com.ucp.tetris;
import main.java.com.ucp.tetris.Piece;

import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue;

public class PieceTest {

    @Test
    public void CrearPiezaItest() {
        Piece pieza = new Piece("I");
        assertNotNull(pieza);
        assertEquals("I", pieza.getForma());
    }
}
