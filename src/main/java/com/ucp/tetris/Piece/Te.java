<<<<<<< HEAD
package src.main.java.com.ucp.tetris.Piece;
=======
package com.ucp.tetris;
>>>>>>> a0e0eba03ba75d12b50614ce3dcd03bc31fe558c

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

