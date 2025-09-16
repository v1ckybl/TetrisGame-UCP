package com.ucp.tetris;
import com.ucp.tetris.Piece.Square;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {
  
    @Test
    public void generarCuadrado() {
      Square pieza = new Square("■");
      String resultado = pieza.getCuadrado();

      String esperado = "■■\n■■";
      assertEquals(esperado, resultado);
    }
   
    @Test
    public void rotar90DebeSerIgual() {
        Square pieza = new Square("■");
        String esperado = pieza.getCuadrado();

        assertEquals(esperado, pieza.rotarSquare90()); 
    }
}
