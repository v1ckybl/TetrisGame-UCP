package com.ucp.tetris.Piece;

public class Square {
    private String symbol;

    public Square(String symbol) {
        this.symbol = symbol;
    }

    public String getCuadrado() {
      return symbol + symbol + "\n" + symbol + symbol;
    }

    // Puedes agregar este método en tu clase de pieza

  private String rotate90(String shape) {
      String[] rows = shape.split("\n");
      int n = rows.length;
      int m = rows[0].length();
      char[][] matrix = new char[n][m];
      for (int i = 0; i < n; i++) {
          matrix[i] = rows[i].toCharArray();
      }
      char[][] rotated = new char[m][n];
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              rotated[j][n - 1 - i] = matrix[i][j];
          }
      }
      StringBuilder sb = new StringBuilder();
      for (char[] row : rotated) {
          sb.append(new String(row)).append("\n");
      }
      return sb.toString().trim();
  }
}
