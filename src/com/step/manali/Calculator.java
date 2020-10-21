package com.step.manali;

public class Calculator{
  private double value;

  public Calculator() {
    this.value = 0.0;
  }

  @Override
  public String toString() {
    return String.format("Calculator {\"value\": %.2f}", this.value);
  }

  public double add(double value){
    this.value += value;
    return this.value;
  }

  public double multiply(double value){
    this.value *= value;
    return this.value;
  }

  public double reset(){
    this.value = 0;
    return this.value;
  }

  public double reset(double value){
    this.value = value;
    return this.value;
  }
}