package com.ucp.tetris.Piece;

public class EleLeft {
    private String symbol;

    public EleLeft(String symbol) {
        this.symbol = symbol;
    }

    public String getEle() {
      return " " + symbol + "\n" +
             " " + symbol + "\n" +
             symbol + symbol;
    }
    
    public void rotarEle90() {
          //return COMO ES LA ELE ROTADA???????;
  }

}
