package com.ucp.tetris.Piece;

public class DogLeft {

    public class Dog {
        private String symbol;

        public Dog(String symbol) {
            this.symbol = symbol;
        }

        public String getShapeString() {    // Representación en forma de S
            return symbol + symbol + "\n" + " " + symbol + symbol;
        }

        public String getSymbol() {
            return symbol;
        }

    }
}
