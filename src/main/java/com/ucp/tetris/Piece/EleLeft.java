package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class EleLeft {
  private String symbol;
  private List<List<String>> shape;

    public EleLeft(String symbol) {
        this.symbol = symbol;
        this.shape = new ArrayList<>(List.of(
            List.of(null, symbol),
            List.of(null, symbol),
            List.of(symbol, symbol)));
    }
    
    public void rotarEle90() {
          //return COMO ES LA ELE ROTADA???????;
  }

}
