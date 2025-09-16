package com.ucp.tetris.Piece;
import main.java.com.ucp.tetris.Piece;

import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue;

public class Ele {

    @Test
    public void CrearPiezaItest() {
        Ele n = new Ele("L");
        assertNotNull(pieza);
        assertEquals("L", Ele.getForma());
    }
}