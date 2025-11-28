package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.Arrays;


public class Square extends PieceBase {

  public Square(String symbol) {
        setShape (new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol, symbol),
            Arrays.asList(symbol, symbol))));
    }

  /*public String getSquare() {
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
  }*/

}

