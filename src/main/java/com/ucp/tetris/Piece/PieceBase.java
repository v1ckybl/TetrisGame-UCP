package com.ucp.tetris.Piece;

import java.util.ArrayList;

import com.ucp.tetris.IRotar;

public abstract class PieceBase implements IRotar {
    private String symbol;
    private ArrayList<String> rotations;
    private int rotationIndex = 0;

    public PieceBase(String symbol, ArrayList<String> rotations){
        this.symbol = symbol;
        this.rotations = rotations;

    }

    public String getSymbol() {
        return symbol;
    
    }

    public String getShapeString(){
        return rotations.get(rotationIndex);
    }


    @Override
    public void rotateRight() {

        rotationIndex = (rotationIndex + 1) % rotations.size();
        
    }

    @Override
    public void rotateLeft() {

       rotationIndex = (rotationIndex + rotations.size() - 1) % rotations.size();
        
    }
    








}
