package com.ucp.tetris;

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
