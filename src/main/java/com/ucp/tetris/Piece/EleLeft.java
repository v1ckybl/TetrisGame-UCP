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

}