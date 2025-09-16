package com.ucp.tetris.Piece;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StickTest {

  @Test
  public void generarStick() {
    Stick pieza = new Stick("■");
    String resultado = pieza.getStick();
    String esperado = "■\n■\n■\n■";
    
    assertEquals(esperado, resultado);
  }

  @Test
  public void rotar90() {
    Stick pieza = new Stick("■");
    String resultado = pieza.rotarStick90();
    String esperado = "■■■■";

    assertEquals(esperado, resultado);
  }
}
