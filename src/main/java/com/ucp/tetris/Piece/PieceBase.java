package com.ucp.tetris.Piece;

import java.util.ArrayList;
import java.util.List;

import com.ucp.tetris.IRotar;

public abstract class PieceBase implements IRotar {
    private  List<List<String>> shape;

    public List<List<String>> getShape() {
    return shape;
}

public void setShape(List<List<String>> newShape) {
    this.shape = newShape;
}


    
    public void rotateLeft() {
        shape = rotateMatrixLeft(shape);
    }

    
    public void rotateRight() {
        shape = rotateMatrixRight(shape);
    }

    private List<List<String>> rotateMatrixLeft(List<List<String>> matrix) {
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        List<List<String>> rotated = new ArrayList<>();

        for (int col = cols - 1; col >= 0; col--) {
            List<String> newRow = new ArrayList<>();
            for (int row = 0; row < rows; row++) {
                newRow.add(matrix.get(row).get(col));
            }
            rotated.add(newRow);
        }
        return rotated;
    }

    private List<List<String>> rotateMatrixRight(List<List<String>> matrix) {
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        List<List<String>> rotated = new ArrayList<>();

        for (int col = 0; col < cols; col++) {
            List<String> newRow = new ArrayList<>();
            for (int row = rows - 1; row >= 0; row--) {
                newRow.add(matrix.get(row).get(col));
            }
            rotated.add(newRow);
        }
        return rotated;
    }
}

    
