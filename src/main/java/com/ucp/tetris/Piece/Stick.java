package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class Stick extends PieceBase {

  public Stick(String symbol) {
        setShape (new ArrayList<>(List.of(
            List.of(symbol),
            List.of(symbol),
            List.of(symbol),
            List.of(symbol))));
    }

    public String getStick() {
      StringBuilder sb = new StringBuilder();
      for (List<String> row : getShape()) {
        for (String cell : row) {
          sb.append(cell != null ? cell : " ");
        }
        sb.append("\n");
      }
      return sb.toString();
    }
    
    private List<List<String>> rotateMatrixLeft(List<List<String>> matrix) {
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        List<List<String>> rotated = new ArrayList<>();

        for (int col = cols - 1; col >= 0; col--) {
            List<String> newRow = new ArrayList<>();
            for (int row = 0; row < rows; row++) {
                newRow.add(matrix.get(row).get(col));
            }
            rotated.add(newRow);
        }
        return rotated;
    }
    

}
