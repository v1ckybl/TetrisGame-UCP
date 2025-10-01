package com.ucp.tetris;

//import com.ucp.tetris.Piece.PieceBase;
import com.ucp.tetris.Piece.Ele;

public class Game implements ITick {
    private Board board;

    public Game(Board board) {
        this.board = board;
        board.setCurrentPiece(new Ele("■")); // genera la pieza
    }

    @Override
    public void tick() {
      board.moveCurrentPieceDown();// tick llama a board.move...(que basicamente  actualiz a la posicion de la pieza, fija la pieza en el board si no puede bajar mas, y genera una nueva pieza)
    } 

} 