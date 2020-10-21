package com.step.manali;

public class Assert{
  private static void showResult(boolean result, String actual, String expected, String text){
    String resultString = "✅ " + text;
    if(!result){
      resultString = "❌ " + text;
      resultString += "\nActual: " + actual + "\nExpected: " + expected + "\n";
    }
    System.out.println(resultString);
  }

  public static void equal(Object actual, Object expected, String text) {
    boolean result = actual.equals(expected);
    Assert.showResult(result, actual.toString(), expected.toString(), text);
  }

  public static void equal(int actual, int expected, String text) {
    boolean result = actual == expected;
    Assert.showResult(result, Integer.toString(actual), Integer.toString(expected), text);
  }

  public static void equal(double actual, double expected, String text) {
    boolean result = actual == expected;
    Assert.showResult(result, Double.toString(actual), Double.toString(expected), text);
  }

  public static void equal(String actual, String expected, String text) {
    boolean result = actual.equals(expected);
    Assert.showResult(result, actual, expected, text);
  }
}