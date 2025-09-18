package com.ucp.tetris;

public class Clock implements ITick {
    private int ticks;
    private int interval;
    private Runnable callback;

    public Clock(int interval, Runnable callback) {
        this.ticks = 0;
        this.interval = interval;
        this.callback = callback;
    }

    @Override
    public void tick() {
        ticks++;
        if (ticks >= interval) {
            callback.run();
            ticks = 0;
        }
    }
     public int getTicks() {
        return ticks;
    }
    
}
