package com.ucp.tetris.Piece;
import static org.junit.Assert.assertEquals; 
import com.ucp.tetris.Piece.Ele;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

@SuppressWarnings("unused")
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