package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

//@SuppressWarnings("unused")
public class EleTest {

  
@Test
public void testEleShapeString() {
    Ele ele = new Ele("■");
    String expectedString = "■ \n■ \n■■\n"; // Note the spaces and newlines
    assertEquals(expectedString, ele.getEle());
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
    

}
