package com.ucp.tetris.Piece;
import static org.junit.Assert.assertEquals; 

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DogTest {

    @Test
    public void CreaciondedogTest() {
        Dog dog = new Dog("X");
        assertNotNull(dog);
        assertEquals("X", dog.getSymbol());
    }
}