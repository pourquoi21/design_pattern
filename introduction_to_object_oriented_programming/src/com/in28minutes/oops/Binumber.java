package com.in28minutes.oops;

public class Binumber {
    private int number1;
    private int number2;

    Binumber() {
        this(2, 3);
    }

    Binumber(int firstNumber, int secondNumber) {
        this.number1 = firstNumber;
        this.number2 = secondNumber;

    }

    public int add() {
        return (number1 + number2);
    }

    public int multiply() {
        return (number1 * number2);
    }

    public void twice() {
        this.number1 *= 2;
        this.number2 *= 2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

}
