package com.step.manali;
import com.step.manali.Calculator;

public class Main{
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("Added 5 : " + calculator.add(5));
    System.out.println("Multiply 5 : " + calculator.multiply(5));
    System.out.println("reset : " + calculator.reset());
    System.out.println("reset 5 : " + calculator.reset(5));
    System.out.println("Added 5 : " + calculator.add(5));
  }
}