package com.ucp.tetris;
import main.java.com.ucp.tetris.Piece;
import main.java.com.ucp.tetris.Square;

import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class SquareTest {
/* 
    @Test
    public void CrearPiezaItest() {
        Piece pieza = new Piece("I");
        assertEquals("I", pieza.getForma());
    }
*/
  
    @Test
    public void generarCuadrado(){
        Square pieza = new Square("■");
        String resultado = pieza.getShapeString();

        String esperado = "**\n**";
        assertEquals(esperado, resultado);
    }
   

}
