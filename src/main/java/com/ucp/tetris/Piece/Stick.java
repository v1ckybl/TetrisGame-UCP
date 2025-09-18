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




}
