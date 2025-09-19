package com.ucp.tetris;

/*public class Game {

  private final Board tablero; // El tablero donde se juegan las piezas
  private boolean[][] piezaActual; // Matriz que representa la pieza en juego
  private int fila; // Fila donde está la pieza
  private int columna; // Columna donde está la pieza              

  public Game() {
        this.tablero = new Board();    // Crear un nuevo tablero vacío
        this.piezaActual = null;       // Al inicio no hay pieza
        this.fila = 0;
        this.columna = 3;              // Arranca más o menos en el medio

                                  
    public Board getTablero() {  //Devuelve el tablero actual
        return tablero;
    }
}
*/

import com.ucp.tetris.Piece.PieceBase;

import java.util.List;

public class Game implements ITick{
    private Board board;  // atributos del juego, como Board, piezas, etc.

    public Game(Board board) {
        this.board = board;
    }

    public void spawnPiece(PieceBase piece) {
        // Lógica para colocar la pieza en la parte superior del tablero
        // Por ejemplo, podrías centrarla en la parte superior
        int startCol = (board.getColumna() - piece.getShape().get(0).size()) / 2;
       
    }

    @Override
    public void tick() {
        // por ejemplo, mover la pieza actual hacia abajo
        board.moveCurrentPieceDown();
        // o cualquier otra lógica que deba ejecutarse cada tick
    }
}






    /*
    // Hace caer una pieza hasta la posición más baja posible
    public void dropPiece(PieceBase piece) {
        int[][] grid = board.getGrid();
        List<List<String>> shape = piece.getShape();

        int pieceHeight = shape.size();
        int pieceWidth = shape.get(0).size();

        int x = 0; // columna inicial (después lo podés centrar)
        int y = 0; // fila inicial arriba de todo

        // Bajar mientras no haya colisión
        while (canMove(shape, y + 1, x, grid)) {
            y++;
        }

        // Colocar la pieza en el grid
        for (int i = 0; i < pieceHeight; i++) {
            for (int j = 0; j < pieceWidth; j++) {
                if (shape.get(i).get(j) != null) {
                    grid[y + i][x + j] = 1; // 1 = celda ocupada
                }
            }
        }
    }

    // Verifica si la pieza se puede mover a la posición (y, x)
    private boolean canMove(List<List<String>> shape, int y, int x, int[][] grid) {
        int pieceHeight = shape.size();
        int pieceWidth = shape.get(0).size();

        if (y + pieceHeight > board.getFila()) return false;

        for (int i = 0; i < pieceHeight; i++) {
            for (int j = 0; j < pieceWidth; j++) {
                if (shape.get(i).get(j) != null) {
                    if (grid[y + i][x + j] != 0) {
                        return false; // colisión con otra pieza
                    }
                }
            }
        }
        return true;
    }
*/


  
