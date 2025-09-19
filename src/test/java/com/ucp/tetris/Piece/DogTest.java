package com.ucp.tetris.Piece;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DogTest {

    @Test
    public void testDogRotateRightOnce() {
    Dog dog = new Dog("■");
    dog.rotateRight();

    String symbol = "■";
    List<List<String>> expectedRotatedShape = new ArrayList<>(Arrays.asList(
        Arrays.asList(symbol, null),
        Arrays.asList(symbol, symbol),
        Arrays.asList(null, symbol)
    ));

    assertEquals(expectedRotatedShape, dog.getShape());
}


}

