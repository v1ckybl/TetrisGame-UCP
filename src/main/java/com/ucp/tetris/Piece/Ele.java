package com.ucp.tetris.Piece;

public class Ele {
    private String symbol;

    public Ele(String symbol) {
        this.symbol = symbol;
    }

    public String getEle() {
        return symbol + "\n" +
               symbol + "\n" +
               symbol + symbol;
    }
}
