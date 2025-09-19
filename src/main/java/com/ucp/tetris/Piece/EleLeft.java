package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class EleLeft extends PieceBase {

  public EleLeft(String symbol) {
        setShape (new ArrayList<>(List.of(
            List.of(null, symbol),
            List.of(null, symbol),
            List.of(symbol, symbol))));
    }

  public String getEleLeft() {
        StringBuilder sb = new StringBuilder();
    List<List<String>> shape = getShape();

    for (int i = 0; i < shape.size(); i++) {
      List<String> row = shape.get(i);
      for (String cell : row) {
        sb.append(cell != null ? cell : " ");
      }
      if (i < shape.size() - 1) { // Check if it's not the last row
        sb.append("\n");
      }
    }
    return sb.toString();
  }

}