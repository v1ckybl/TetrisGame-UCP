package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ele extends PieceBase {


  public Ele(String symbol) {
        setShape (new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol, null),
            Arrays.asList(symbol, null),
            Arrays.asList(symbol, symbol))));
    }

    public String getEle() {
        StringBuilder sb = new StringBuilder();
    List<List<String>> shape = getShape();

    for (int i = 0; i < shape.size(); i++) {
      List<String> row = shape.get(i);
      for (String cell : row) {
        sb.append(cell != null ? cell : " ");
      }
      if (i < shape.size() - 1) { //que no haya un salto de linea mas 
        sb.append("\n");
      }
    }
    return sb.toString();
  }
/*
  public Ele(String symbol) {
        setShape (new ArrayList<>(List.of(
            List.of(symbol, null),
            List.of(symbol, null),
            List.of(symbol, symbol))));
    }

  public String getEle() {
        StringBuilder sb = new StringBuilder();
        for (List<String> row : getShape()) {
            for (String cell : row) {
                sb.append(cell != null ? cell : " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

 */

}