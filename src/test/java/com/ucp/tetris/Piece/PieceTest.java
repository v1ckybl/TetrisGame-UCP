package com.ucp.tetris.Piece;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class PieceTest {
  
    @Test
    public void generarCuadrado() {
      Square pieza = new Square("■");
      String resultado = pieza.getCuadrado();

      String esperado = "■■\n■■";
      assertEquals(esperado, resultado);
    }

     @Test
    public void generarEleRight() {
        Ele pieza = new Ele("■");
        assertNotNull(pieza);
        String resultado = pieza.getEle();
        String esperado = "■\n■\n■■";

        assertEquals(esperado, resultado);
    
    }

   @Test
    public void generarEleLeft() {
    /*     Ele pieza = new Ele("■");
        assertNotNull(pieza);
        String resultado = pieza.getEle();
        String esperado = "■\n■\n■■";  

        assertEquals(esperado, resultado);
    */
    }
    
    @Test
    public void generarStick() {
        Stick pieza = new Stick("■");
        String resultado = pieza.getStick();
        String esperado = "■\n■\n■\n■";

        assertEquals(esperado, resultado);
    }

    @Test
    public void generarDogRight() {
        Dog dog = new Dog("X");
        assertNotNull(dog);
        assertEquals("X", dog.getSymbol());
    }


    @Test
    public void generarDogLeft() {
    /*     Dog dog = new Dog("X");
        assertNotNull(dog);
        assertEquals("X", dog.getSymbol());
    }*/
}
