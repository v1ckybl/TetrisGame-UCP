package com.ucp.tetris.Piece;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClockTest {
    
     @Test
    public void testTicksAcumulan() {
        Runnable dummy = () -> {};
        Clock clock = new Clock(5, dummy);

        for (int i = 0; i < 3; i++) {
            clock.tick();
        }

        assertEquals(3, clock.getTicks());
    }
}
