package com.ucp.tetris.Piece;

public class Square {
    private String symbol;

    public Square(String symbol) {
        this.symbol = symbol;
    }

    // Representación del cuadrado 
    public String getShapeString() {
        return symbol + symbol + "\n" +
               symbol + symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    // Rotaciones que no cambian el cuadrado
    public String rotateRight() {
        return getShapeString();
    }

    public String rotateLeft() {
        return getShapeString();
    }
}

