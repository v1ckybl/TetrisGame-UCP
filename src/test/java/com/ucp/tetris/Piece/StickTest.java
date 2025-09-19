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
    Stick stick = new Stick("■");
    stick.rotateRight();

    String symbol = "■";
    List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
        Arrays.asList(symbol, symbol, symbol, symbol)));

    assertEquals(expectedRotatedShape, stick.getShape());
  }

  @Test
  public void testStickRotateLeft() {
    Stick stick = new Stick("■");
    stick.rotateLeft();

    String symbol = "■";
    List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
        Arrays.asList(symbol, symbol, symbol, symbol)));

    assertEquals(expectedRotatedShape, stick.getShape());
  }

@Test
  public void testStickRotateRight180() {
    Stick stick = new Stick("■");
    stick.rotateRight();
    stick.rotateRight();

    String symbol = "■";
    List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
        Arrays.asList(symbol),
        Arrays.asList(symbol),
        Arrays.asList(symbol),
        Arrays.asList(symbol)));

    assertEquals(expectedRotatedShape, stick.getShape());
  }


}