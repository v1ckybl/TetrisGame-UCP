package com.ucp.tetris.Piece;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Dog extends PieceBase {

  public Dog(String symbol) {
        setShape (new ArrayList<>(Arrays.asList(
            Arrays.asList(null, symbol, symbol),
            Arrays.asList(symbol, symbol, null))));
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