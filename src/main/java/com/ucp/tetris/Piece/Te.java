package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Te extends PieceBase {

  public Te(String symbol) {
    setShape(new ArrayList<>(Arrays.asList(
        Arrays.asList(symbol, symbol, symbol),
        Arrays.asList(null, symbol, null))));
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
