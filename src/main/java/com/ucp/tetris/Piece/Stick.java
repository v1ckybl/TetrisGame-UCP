package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class Stick {
    private String symbol;
    private List<List<String>> shape;

    public Stick(String symbol) {
        this.symbol = symbol;
        this.shape = new ArrayList<>(List.of(
            List.of(symbol),
            List.of(symbol),
            List.of(symbol),
            List.of(symbol)));
    }
    public String getStick() {
        StringBuilder sb = new StringBuilder();
        for (List<String> row : shape) {
            for (String cell : row) {
                sb.append(cell != null ? cell : " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    
}