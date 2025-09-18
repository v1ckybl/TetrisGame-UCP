package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class Te extends PieceBase {

  public Te(String symbol) {
    setShape(new ArrayList<>(List.of(
        List.of(symbol, symbol, symbol),
        List.of(null, symbol, null))));
  }

  public String getTe() {
    StringBuilder sb = new StringBuilder();
    for (List<String> row : getShape()) {
      for (String cell : row) {
        sb.append(cell != null ? cell : " ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }

}
