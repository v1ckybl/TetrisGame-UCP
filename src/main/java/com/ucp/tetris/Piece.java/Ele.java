package com.ucp.tetris;

public class Ele {
    private String symbol;

    public Ele(String symbol) {
        this.symbol = symbol;
    }

    public String getShapeString() {
        return symbol + "\n" +
               symbol + "\n" +
               symbol + symbol;
    }
}
