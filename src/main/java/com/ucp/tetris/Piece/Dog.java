package com.ucp.tetris.Piece;

public class Dog {
    private String symbol;

    public Dog(String symbol) {
        this.symbol = symbol;
    }

    public String getShapeString() {    // Representación en forma de S
        return " " + symbol + symbol + "\n"
         + symbol + symbol + " ";
    }

    public String getSymbol() {
        return symbol;
    }

    public String rotateRight() {    // Rotación simple (cambia la orientación de S a Z)
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