package com.ucp.tetris.Piece;
import java.util.ArrayList;
import java.util.List;
public class Dog extends PieceBase {

  public Dog(String symbol) {
        setShape (new ArrayList<>(List.of(
            List.of(null, symbol, symbol),
            List.of(symbol, symbol, null))));
    }

  public String getDog() {
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