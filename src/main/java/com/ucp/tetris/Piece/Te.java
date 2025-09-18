package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class Te extends PieceBase {

  private String symbol;
  private List<List<String>> shape;

  public Te(String symbol) {
    super(symbol, new ArrayList<>());
    this.symbol = symbol;
    this.shape = new ArrayList<>(List.of(
        List.of(symbol, symbol, symbol),
        List.of(null, symbol, null)));
  }

  public String getTe() {
    StringBuilder sb = new StringBuilder();
    for (List<String> row : shape) {
      for (String cell : row) {
        sb.append(cell != null ? cell : " "); //Si la celda no es null, agrega el symbol a la cadena.
      }
      sb.append("\n");
    }
    return sb.toString();
  }

  // llamar el metodo para rotar de la interfaz Irotar que implementa PieceBase
  public void rotateRight() {
    super.rotateRight();
  
  // Actualizar la forma después de rotar
   
  
  }
}

