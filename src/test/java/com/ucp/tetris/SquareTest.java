package com.ucp.tetris;

import com.ucp.tetris.Piece.Square;
import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void CreacionTestsquare() {
        Square square = new Square("O");
        assertNotNull(square);
        assertEquals("O", square.getSymbol());
    }

}