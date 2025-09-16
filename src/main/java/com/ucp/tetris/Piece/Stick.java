package com.ucp.tetris.Piece;

public class Stick {
    private String symbol;

    public Stick(String symbol) {
        this.symbol = symbol;
    }

    public String getStick() {
      return symbol + "\n" +
             symbol + "\n" +
             symbol + "\n" +
             symbol;
    }
   

    public String rotarStick90() {
          return symbol + symbol + symbol + symbol;
    }
}