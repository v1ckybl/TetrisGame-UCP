package com.ucp.tetris;

public class Square {
    private String symbol;

    public Square(String symbol) {
        this.symbol = symbol;
    }

    public String getShapeString() {
        return symbol + symbol + "\n" + symbol + symbol;
    }
}
