package com.ucp.tetris.Piece;
import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class EleTest {

    @Test
    public void CrearPiezaLtest() {
        Ele pieza = new Ele("■");
        assertNotNull(pieza);
        String resultado = pieza.getEle();
        String esperado = "■\n■\n■■";

        assertEquals(esperado, resultado);
    
    
    }
}