package com.ucp.tetris.Piece;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StickTest {

  @Test
  public void rotar90() {
    Stick pieza = new Stick("■");
    String resultado = pieza.rotarStick90();
    String esperado = "■■■■";

    assertEquals(esperado, resultado);
  }
}
