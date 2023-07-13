package com.in28minutes.ifstatement.examples;

public class MyNumberRunner {

    public static void main(String[] args) {
        MyNumber number = new MyNumber(9);
        System.out.println(number.isPrime());
        int sum = number.sumUptoN();
        System.out.println(sum);
        int divSum = number.sumOfDivisors();
        System.out.println(divSum);
    }

}
