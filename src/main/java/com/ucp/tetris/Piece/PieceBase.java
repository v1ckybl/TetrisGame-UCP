package com.ucp.tetris.Piece;

import com.ucp.tetris.IRotar;

public abstract class PieceBase implements IRotar {
    private String symbol;
    private String[] rotations;
    private int rotationIndex = 0;

    public PieceBase(String symbol, String[] rotations){
        this.symbol = symbol;
        this.rotations = rotations;

    }

    public String getSymbol() {
        return symbol;
    
    }

    public String getShapeString(){
        return rotations[rotationIndex];

    }


    @Override
    public void rotateRight() {

        rotationIndex = (rotationIndex + 3) % 4;
        
    }

    @Override
    public void rotateLeft() {

        rotationIndex = (rotationIndex + 1) % 4;
        
    }
    








}
