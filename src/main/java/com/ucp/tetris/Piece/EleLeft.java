package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EleLeft extends PieceBase {

  public EleLeft(String symbol) {
        setShape (new ArrayList<>(Arrays.asList(
            Arrays.asList(null, symbol),
            Arrays.asList(null, symbol),
            Arrays.asList(symbol, symbol))));
    }

  public String getEleLeft() {
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