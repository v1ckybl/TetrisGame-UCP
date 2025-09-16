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

  // rotar 90 grados no cambia la forma del cuadrado
  public String rotarSquare90() {
    return getCuadrado();
  }

  //rotar 180 grados no cambia la forma del cuadrado
  public String rotar180() {
    return getCuadrado();
  }

  //rotar 270 grados no cambia la forma del cuadrado
  public String rotar270() {
    return getCuadrado();
  }

  //rotar 360 grados no cambia la forma del cuadrado
  public String rotar360() {
    return getCuadrado();
  }
}