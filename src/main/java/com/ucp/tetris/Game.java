package com.ucp.tetris;

import com.ucp.tetris.Piece.PieceBase;
import com.ucp.tetris.Piece.Ele;

public class Game implements ITick {
    private Board board;

    public Game(Board board) {
        this.board = board;
        board.setCurrentPiece(new Ele("■")); // genera la pieza
    }

    @Override
    public void tick() {
      board.moveCurrentPieceDown();
    }

    public Board getBoard() {
      return board;
    }
    
    // timer para tick cada 2 segundos
    public void start() {
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new java.util.TimerTask() {
            @Override
            public void run() {
                tick();
            }
        }, 0, 2000);
    }
}