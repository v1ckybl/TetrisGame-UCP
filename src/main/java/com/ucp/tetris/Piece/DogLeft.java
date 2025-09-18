package com.ucp.tetris.Piece;
import java.util.ArrayList;
import java.util.List;
    public class DogLeft extends PieceBase {

  public DogLeft(String symbol) {
        setShape (new ArrayList<>(List.of(
            List.of(symbol, symbol, null),
            List.of(null, symbol, symbol))));
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