package com.ucp.tetris.Piece;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    public class DogLeft extends PieceBase {

  public DogLeft(String symbol) {
        setShape (new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol, symbol, null),
            Arrays.asList(null, symbol, symbol))));
    }

  public String getDog() {
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

}