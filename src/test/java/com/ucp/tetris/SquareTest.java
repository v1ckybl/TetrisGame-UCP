package src.test.java.com.ucp.tetris;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import src.main.java.com.ucp.tetris.Piece.Square;

public class SquareTest {
/* 
    @Test
    public void CrearPiezaItest() {
        Piece pieza = new Piece("I");
        assertEquals("I", pieza.getForma());
    }
*/
  
    @Test
    public void generarCuadrado(){
        Square pieza = new Square("■");
        String resultado = pieza.getShapeString();

        String esperado = "■■\n■■";
        assertEquals(esperado, resultado);
    }
   

}
