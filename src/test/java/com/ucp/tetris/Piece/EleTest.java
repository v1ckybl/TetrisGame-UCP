package com.ucp.tetris.Piece;

import java.util.List;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

@SuppressWarnings("unused")
public class EleTest {

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

    private boolean formasIguales(List<List<String>> f1, List<List<String>> f2) {
        if (f1.size() != f2.size()) return false;
        for (int i = 0; i < f1.size(); i++) {
            List<String> row1 = f1.get(i);
            List<String> row2 = f2.get(i);
            if (row1.size() != row2.size()) return false;
            for (int j = 0; j < row1.size(); j++) {
                if (row1.get(j) != row2.get(j)) return false;
            }
        }
        return true;
    
    }
}
