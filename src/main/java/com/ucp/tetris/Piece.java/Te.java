package com.ucp.tetris;

public class Te {
    private String symbol;

    public Te(String symbol) {
        this.symbol = symbol;
    }

    public String getShapeString() {
        // Forma de T:
        return symbol + symbol + symbol + "\n" + " " + symbol + " ";
    }
}

