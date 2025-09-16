package com.ucp.tetris;
import main.java.com.ucp.tetris.Piece;

import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue;

public class EleTest {

    @Test
    public void CrearPiezaItest() {
        Ele n = new Ele("L");
        assertNotNull(pieza);
        assertEquals("L", pieza.getForma());
    }
}