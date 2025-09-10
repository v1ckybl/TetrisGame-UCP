package com.ucp.tetris.Piece;

public class EleInvertida {
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