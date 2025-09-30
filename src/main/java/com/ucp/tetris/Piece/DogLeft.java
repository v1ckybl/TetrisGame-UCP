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

}