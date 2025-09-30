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


    public Board getBoard() {// esto hace que la pieza  actual se muestre en el tablero
      return board;
    }
    
    // timer para tick cada 2 segundos
    public void start() {
        java.util.Timer timer = new java.util.Timer();    //  si no se puede bajar mas la pieza, el tablero  se encarga de fijarla , limpiar lineas y crear una nueva pieza
        timer.scheduleAtFixedRate(new java.util.TimerTask() {
            @Override
          public void run() {
            tick();
          }
        }, 0, 2000);
    }

} 