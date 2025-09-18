package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

public class Ele {
    private String symbol;
    private List<List<String>> shape;

    public Ele(String symbol) {
        this.symbol = symbol;
        this.shape = new ArrayList<>();
            // Fila 1
            List<String> row1 = new ArrayList<>();
            row1.add(symbol);
            row1.add(null);
            this.shape.add(row1);
            // Fila 2
            List<String> row2 = new ArrayList<>();
            row2.add(symbol);
            row2.add(null);
            this.shape.add(row2);
            // Fila 3
            List<String> row3 = new ArrayList<>();
            row3.add(symbol);
            row3.add(symbol);
            this.shape.add(row3);
        }

        public String getEle() {
            StringBuilder sb = new StringBuilder();
            for (List<String> row : shape) {
                for (String cell : row) {
                    sb.append(cell != null ? cell : " ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }
        
        // Rotar 90 grados a la derecha
        public void rotateRight() {
            List<List<String>> rotatedShape = new ArrayList<>();
            int rows = shape.size();
            int cols = shape.get(0).size();

        }
