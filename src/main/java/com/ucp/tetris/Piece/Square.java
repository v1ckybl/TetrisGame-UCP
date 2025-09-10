package main.java.com.ucp.tetris.Piece;

public class Square {
    private String symbol;

    public Square(String symbol) {
        this.symbol = symbol;
    }

    public String getShapeString() {
        return symbol + symbol + "\n" + symbol + symbol;
    }
}
