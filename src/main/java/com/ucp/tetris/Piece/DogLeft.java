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
        for (List<String> row : getShape()) {
            for (String cell : row) {
                sb.append(cell != null ? cell : " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}