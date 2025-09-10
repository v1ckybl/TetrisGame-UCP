package com.ucp.tetris.Piece;

public class Stick {
    private String symbol;

    public Stick(String symbol) {
        this.symbol = symbol;
    }

    public String getShapeString() {
        return symbol + symbol + symbol + "\n" + " " + symbol + " ";
    }
}