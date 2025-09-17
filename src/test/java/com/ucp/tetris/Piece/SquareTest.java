package com.ucp.tetris.Piece;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SquareTest {
   
    @Test
    public void rotar90() {
      Square pieza = new Square("■");
      String esperado = pieza.getCuadrado();

      assertEquals(esperado, pieza.rotar90());
    }
    
    @Test
    public void rotar180() {
      Square pieza = new Square("■");
      String esperado = pieza.getCuadrado();

      assertEquals(esperado, pieza.rotar180());
    }
    
    @Test
    public void rotar270() {
      Square pieza = new Square("■");
      String esperado = pieza.getCuadrado();

      assertEquals(esperado, pieza.rotar270());
    }
    
    @Test
    public void rotar360() {
        Square pieza = new Square("■");
        String esperado = pieza.getCuadrado();

        assertEquals(esperado, pieza.rotar360()); 
    }
}