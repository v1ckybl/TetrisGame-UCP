package com.ucp.tetris.Piece;
import static org.junit.Assert.assertEquals; 

import com.ucp.tetris.Piece.Dog;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void CreaciondedogTest() {
        Dog dog = new Dog("X");
        assertNotNull(dog);
        assertEquals("X", dog.getSymbol());
    }
}