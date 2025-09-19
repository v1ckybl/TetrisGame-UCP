package com.ucp.tetris.Piece;

import static org.junit.Assert.*;
import org.junit.Test;
import com.ucp.tetris.Board;

public class BoardTest {
    @Test
    public void dimensionesCorrectas() {
        Board b = new Board();
        assertEquals(10, b.getFila());
        assertEquals(20, b.getColumna());
    }


@Test
    public void testPieceFallsDownOneStepPerTick() throws NoSuchFieldException, IllegalAccessException {
        Board board = new Board();
        board.spawnNewPiece(); // La pieza se crea en (0, 4) por defecto
        
        // Usamos Reflection para acceder a la posición privada de la pieza en el tablero
        // Esto se hace para fines de testing, ya que la posición no es pública
        Field pieceYField = Board.class.getDeclaredField("pieceY");
        pieceYField.setAccessible(true);
        int initialY = pieceYField.getInt(board);

        // Simulamos un tick, que debería mover la pieza una fila hacia abajo
        board.moveCurrentPieceDown();
        
        int afterMoveY = pieceYField.getInt(board);

        assertEquals(initialY + 1, afterMoveY, "La pieza debe bajar una posición por cada tick.");
    }

}