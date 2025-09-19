package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.Arrays;

public class Stick extends PieceBase {

  public Stick(String symbol) {
        setShape (new ArrayList<>(Arrays.asList(
            Arrays.asList(symbol),
            Arrays.asList(symbol),
            Arrays.asList(symbol),
            Arrays.asList(symbol))));
    }




}
