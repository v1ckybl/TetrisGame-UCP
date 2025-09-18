package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class Square extends PieceBase {
  private String symbol;
  private List<List<String>> shape;

  public Square(String symbol) {
      super(symbol);
        this.symbol = symbol;
        this.shape = new ArrayList<>(List.of(
            List.of(symbol, symbol),
            List.of(symbol, symbol)));
    }

  public String getSquare() {
    StringBuilder sb = new StringBuilder();
    for (List<String> row : shape) {
      for (String cell : row) {
        sb.append(cell != null ? cell : " "); //Si la celda no es null, agrega el symbol a la cadena.
      }
      sb.append("\n");
    }
    return sb.toString();
  }




}

