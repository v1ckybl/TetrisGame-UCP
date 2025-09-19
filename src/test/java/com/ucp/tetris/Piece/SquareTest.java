package com.ucp.tetris.Piece;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SquareTest {
   
@Test
    public void testsquareRotateRightOnce() {
        Square square = new Square("■");

        String symbol = "■";
        List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol, symbol),
            Arrays.asList(symbol, symbol)));
        
        assertEquals(expectedRotatedShape, square.getShape());
    }

}