package com.ucp.tetris.Piece;

public class Dog {
    private String symbol;

    public Dog(String symbol) {
        this.symbol = symbol;
    }

    // Representación en forma de "S"
    public String getShapeString() {
        return " " + symbol + symbol + "\n" +
               symbol + symbol + " ";
    }

    public String getSymbol() {
        return symbol;
    }

                                      // Rotación simple (cambia la orientación de S a Z)
    public String rotateRight() {
        return symbol + "\n" +
               symbol + symbol + "\n" +
               " " + symbol;
    }

    public String rotateLeft() {
        return " " + symbol + "\n" +
               symbol + symbol + "\n" +
               symbol;
    }
}
