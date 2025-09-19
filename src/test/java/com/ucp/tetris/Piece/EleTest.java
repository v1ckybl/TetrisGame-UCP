package com.ucp.tetris.Piece;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

//@SuppressWarnings("unused")
public class EleTest {

  
@Test
public void testEleShapeString() {
    Ele ele = new Ele("■");
    String expectedString = "■ \n■ \n■■\n"; // Note the spaces and newlines
    assertEquals(expectedString, ele.getEle());
}


@Test
    public void rotarDerecha() {
        Ele l = new Ele("L");

        l.rotateRight();
        List<List<String>> actual = l.getShape();

        List<List<String>> esperado = List.of(
            List.of(null, null, "L"),
            List.of("L", "L", "L")
        );

        assertTrue(formasIguales(esperado, actual));
    }

    private boolean formasIguales(List<List<String>> a, List<List<String>> b) {
    if (a.size() != b.size()) return false;

    for (int i = 0; i < a.size(); i++) {
        List<String> filaA = a.get(i);
        List<String> filaB = b.get(i);

        if (filaA.size() != filaB.size()) return false;

        for (int j = 0; j < filaA.size(); j++) {
            String celdaA = filaA.get(j);
            String celdaB = filaB.get(j);

            if (celdaA == null && celdaB != null) return false;
            if (celdaA != null && !celdaA.equals(celdaB)) return false;
        }
    }

    return true;
}


}
