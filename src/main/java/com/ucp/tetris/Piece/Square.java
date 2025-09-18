package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class Square extends PieceBase {

  public Square(String symbol) {
        setShape (new ArrayList<>(List.of(
            List.of(symbol, symbol),
            List.of(symbol, symbol))));
    }

  public String getSquare() {
        StringBuilder sb = new StringBuilder();
        for (List<String> row : getShape()) {
            for (String cell : row) {
                sb.append(cell != null ? cell : " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

 @Override
    public ArrayList<ArrayList<String>> rotar() {
        // Rotar a la derecha por defecto
        rotateRight();
        // Convertir a ArrayList<ArrayList<String>> para cumplir la interfaz
        return new ArrayList<>(getShape().stream()
                .map(ArrayList::new)
                .toList());
    }




}

