package com.ucp.tetris.Piece;

public class Square {
  private String symbol;

  public Square(String symbol) {
    this.symbol = symbol;
  }

  public String getCuadrado() {
    return symbol + symbol + "\n" +
        symbol + symbol;
  }
  //la forma del cuadrado no cambia nunca al rotar
  // rotar 90
  public String rotarSquare90() {
    return getCuadrado();
  }

  //rotar 180
  public String rotarSquare180() {
    return getCuadrado();
  }

  //rotar 270
  public String rotarSquare270() {
    return getCuadrado();
  }

  //rotar 360
  public String rotarSquare360() {
    return getCuadrado();
  }
}