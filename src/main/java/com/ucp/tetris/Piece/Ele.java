package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class Ele {
  private String symbol;
  private List<List<String>> shape;

  public Ele(String symbol) {
        this.symbol = symbol;
        this.shape = new ArrayList<>(List.of(
            List.of(symbol, null),
            List.of(symbol, null),
            List.of(symbol, symbol)));
    }

  public String getEle() {
    StringBuilder sb = new StringBuilder();
    for (List<String> row : shape) {
      for (String cell : row) {
        sb.append(cell != null ? cell : " ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }

  // Rotar 90 grados a la derecha
  public void rotateRight() {
    List<List<String>> rotatedShape = new ArrayList<>();
    int rows = shape.size();
    int cols = shape.get(0).size();

  }
}