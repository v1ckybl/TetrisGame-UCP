package src.main.java.com.ucp.tetris.Piece;

public class Te {
    private String symbol;

       public Te(String symbol) {
        this.symbol = symbol;
    }

    public String getShapeString() {
        return symbol + symbol + "\n" + symbol + symbol;
    }
}
