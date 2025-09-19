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

  @Test
  public void testStick() {
    Stick stick = new Stick("■");
    String expectedString = "■\n■\n■\n■"; // Note the spaces and newlines
    assertEquals(expectedString, stick.getStick());
  }

  //test rotar derecha
  @Test
  public void testStickRotateRightOnce() {
    Stick Stick = new Stick("■");
    Stick.rotateRight();

    String symbol = "■";
    List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
        Arrays.asList(symbol, symbol, symbol),
        Arrays.asList(symbol, null, null)));

    assertEquals(expectedRotatedShape, Stick.getShape());
  }

}