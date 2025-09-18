package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class Ele extends PieceBase {

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

 

}