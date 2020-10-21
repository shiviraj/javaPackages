package com.step.manali;
import com.step.manali.Calculator;
import com.step.manali.Assert;

public class TestCalculator{

  public static void main(String[] args) {
    TestCalculator.add();
    TestCalculator.multiply();
    TestCalculator.reset();
  }

  public static void add(){
    Calculator calculator = new Calculator();
    Assert.equal(calculator.add(5), 5, "Should calculate the sum");
    Assert.equal(calculator.add(-5), 0, "Should calculate the sum of negative number");
  }

  public static void multiply(){
    Calculator calculator = new Calculator();
    calculator.add(5);
    Assert.equal(calculator.multiply(5), 25.0, "Should calculate the product");
    Assert.equal(calculator.multiply(0.5), 12.5, "Should calculate the product of float value");
  }

  public static void reset(){
    Calculator calculator = new Calculator();
    Assert.equal(calculator.reset(5), 5.0, "Should reset the calculator with given value");
    Assert.equal(calculator.reset(), 0, "Should reset the calculator");
  }

}