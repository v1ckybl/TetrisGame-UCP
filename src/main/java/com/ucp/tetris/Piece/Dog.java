package com.ucp.tetris.Piece;

public class Dog {
    private String symbol;
    private boolean isLeft; // true = S (izquierda)  false = Z (derecha)

    public Dog(String symbol, boolean isLeft) {
        this.symbol = symbol;
        this.isLeft = isLeft;
    }

    public String getShapeString() {
        if (isLeft) {
            // Forma S
            return " " + symbol + symbol + "\n" +
                   symbol + symbol;
        } else {
            // Forma Z
            return symbol + symbol + "\n" +
                   " " + symbol + symbol;
        }
    }
}
