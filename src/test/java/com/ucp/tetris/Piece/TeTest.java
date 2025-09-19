package com.ucp.tetris.Piece;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeTest {
    
 

    @Test
    public void testTeRotateleftOnce() {
        Te te = new Te("■");
        te.rotateLeft();

        String symbol = "■";
        List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol, null),
            Arrays.asList(symbol, symbol),
            Arrays.asList(symbol, null)
        ));

        assertEquals(expectedRotatedShape, te.getShape());

}

}
