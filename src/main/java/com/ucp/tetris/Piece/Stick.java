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

  public String getStick() {
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
