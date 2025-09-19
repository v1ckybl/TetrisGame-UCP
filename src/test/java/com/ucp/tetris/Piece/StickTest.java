package com.ucp.tetris.Piece;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StickTest {

  @Test
    public void generarStick() {
        Stick stick = new Stick("■");

        String symbol = "■";
        List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol),
            Arrays.asList(symbol),
            Arrays.asList(symbol),
            Arrays.asList(symbol)));
        
        assertEquals(expectedRotatedShape, stick.getShape());
    }

  //test rotar derecha
  @Test
  public void testStickRotateRightOnce() {
    Stick Stick = new Stick("■");
    Stick.rotateRight();

    String symbol = "■";
    List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
        Arrays.asList(symbol, symbol, symbol, symbol)));

    assertEquals(expectedRotatedShape, Stick.getShape());
  }

  @Test
  public void testStickRotateLeft() {
    Stick Stick = new Stick("■");
    Stick.rotateLeft();

    String symbol = "■";
    List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
        Arrays.asList(symbol, symbol, symbol, symbol)));

    assertEquals(expectedRotatedShape, Stick.getShape());
  }

@Test
  public void testStickRotateRight180() {
    Stick Stick = new Stick("■");
    Stick.rotateRight();
    Stick.rotateRight();

    String symbol = "■";
    List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
        Arrays.asList(symbol),
        Arrays.asList(symbol),
        Arrays.asList(symbol),
        Arrays.asList(symbol)));

    assertEquals(expectedRotatedShape, Stick.getShape());
  }


}