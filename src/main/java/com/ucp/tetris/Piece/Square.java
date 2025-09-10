package com.ucp.tetris.Piece;

public class Square {
    private String symbol;

    public Square(String symbol) {
        this.symbol = symbol;
    }

    public String getCuadrado() {
        return symbol + symbol + "\n" + symbol + symbol;
    }
}
