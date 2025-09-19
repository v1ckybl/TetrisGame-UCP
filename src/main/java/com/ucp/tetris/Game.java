package com.ucp.tetris;

import com.ucp.tetris.Piece.PieceBase;

import java.util.List;

public class Game implements ITick{
  private Board board; // atributos del juego, como Board, piezas, etc.
  @SuppressWarnings("unused")
  private PieceBase currentPiece;
  private int pieceRow;
  private int pieceCol;

    public Game(Board board) {
        this.board = board;
    }

    public void spawnPiece(PieceBase piece) { //pongo la pieza
        int startCol = (board.getColumna() - piece.getShape().get(0).size()) / 2;
        this.currentPiece = piece;
        this.pieceRow = 0;
        this.pieceCol = startCol;
        board.fijarPieza(piece, pieceRow, pieceCol); // Assuming Board has a placePiece method
    }

    @Override
    public void tick() {
        // por ejemplo, mover la pieza actual hacia abajo
        board.moveCurrentPieceDown();
        // o cualquier otra lógica que deba ejecutarse cada tick
    }
}
