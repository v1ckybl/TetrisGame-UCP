package com.ucp.tetris.Piece;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class DogTest {

    @Test
    public void CreaciondedogTest() {
        Dog dog = new Dog("X");
        assertNotNull(dog);
        assertEquals("X", dog.getSymbol());
    }
}