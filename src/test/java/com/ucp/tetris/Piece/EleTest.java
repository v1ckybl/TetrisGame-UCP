package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class EleTest {
  
@Test
    public void generarEle() {
        Ele ele = new Ele("■");

        String symbol = "■";
        List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol, null),
            Arrays.asList(symbol, null),
            Arrays.asList(symbol, symbol)));
        
        assertEquals(expectedRotatedShape, ele.getShape());
    }

//test rotar derecha
@Test
    public void testEleRotateRightOnce() {
        Ele ele = new Ele("■");
        ele.rotateRight();

        String symbol = "■";
        List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol, symbol, symbol),
            Arrays.asList(symbol, null, null)
        ));
        
        assertEquals(expectedRotatedShape, ele.getShape());
    }
    
@Test
public void testEleRotateRight180() {
  Ele ele = new Ele("■");
  ele.rotateRight();
  ele.rotateRight();

  String symbol = "■";
  List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
      Arrays.asList(symbol, symbol),
      Arrays.asList(null, symbol),
      Arrays.asList(null, symbol)));

  assertEquals(expectedRotatedShape, ele.getShape());
}
    
@Test
public void testEleRotateLeft() {
  Ele ele = new Ele("■");
  ele.rotateLeft();

  String symbol = "■";
  List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
      Arrays.asList(null, null, symbol),
      Arrays.asList(symbol, symbol, symbol)));

  assertEquals(expectedRotatedShape, ele.getShape());
}

@Test
public void testEleRotateRight270() {
  Ele ele = new Ele("■");
  ele.rotateRight();
  ele.rotateRight();
  ele.rotateRight();

  String symbol = "■";
  List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
      Arrays.asList(null, null, symbol),
      Arrays.asList(symbol, symbol, symbol)));

  assertEquals(expectedRotatedShape, ele.getShape());
}
 
//eleINVERTIDAAAAAAA
@Test
    public void generarEleiNVERTIDA() {
        EleLeft elelef = new EleLeft("■");

        String symbol = "■";
        List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
            Arrays.asList(null, symbol),
            Arrays.asList(null, symbol),
            Arrays.asList(symbol, symbol)));
        
        assertEquals(expectedRotatedShape, elelef.getShape());
    }

//test rotar derecha
@Test
public void eleInvertidaRotateRight() {
  EleLeft l = new EleLeft("■");
  l.rotateRight();

  String symbol = "■";
  List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
      Arrays.asList(symbol, null, null),
      Arrays.asList(symbol, symbol, symbol)));

  assertEquals(expectedRotatedShape, l.getShape());
}

@Test
    public void eleInvertidaRotateRight180() {
        EleLeft l = new EleLeft("■");
        l.rotateRight();
        l.rotateRight();

        String symbol = "■";
        List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol, symbol),
            Arrays.asList(symbol, null),
            Arrays.asList(symbol, null)));
        
        
        assertEquals(expectedRotatedShape, l.getShape());
    }    

}
