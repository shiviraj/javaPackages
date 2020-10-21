package com.step.manali;

public class Assert{
  public static void equal(Object a, Object b, String text) {
    boolean result = a.equals(b);
    String resultString = "✅ " + text;
    if(!result){
      resultString = "❌ " + text;
      resultString += "\nActual: " + a + "\nExpected: " + b + "\n";
    }
    System.out.println(resultString);
  }

  public static void equal(int a, int b, String text) {
    boolean result = a == b;
    String resultString = "✅ " + text;
    if(!result){
      resultString = "❌ " + text;
      resultString += "\nActual: " + a + "\nExpected: " + b + "\n";
    }
    System.out.println(resultString);
  }

  public static void equal(double a, double b, String text) {
    boolean result = a == b;
    String resultString = "✅ " + text;
    if(!result){
      resultString = "❌ " + text;
      resultString += "\nActual: " + a + "\nExpected: " + b + "\n";
    }
    System.out.println(resultString);
  }

  public static void equal(String a, String b, String text) {
    boolean result = a.equals(b);
    String resultString = "✅ " + text;
    if(!result){
      resultString = "❌ " + text;
      resultString += "\nActual: " + a + "\nExpected: " + b + "\n";
    }
    System.out.println(resultString);
  }
}