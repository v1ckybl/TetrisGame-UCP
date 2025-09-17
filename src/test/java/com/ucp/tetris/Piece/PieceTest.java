package com.ucp.tetris.Piece;
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


    