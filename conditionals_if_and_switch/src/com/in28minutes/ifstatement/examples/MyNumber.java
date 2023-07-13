package com.in28minutes.ifstatement.examples;

public class MyNumber {
    int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {

        for (int i = 1; i <= number; i++) {
            if (number % i > 0) {
                continue;
            }

            if (number % i == 0) {
                if (i == 1) {
                    continue;
                }

                if (i == number) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            if (i == number) {
                return sum;
            }
        }
        return sum;
    }

    public int sumOfDivisors() {
        int divSum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divSum += i;
            } else {
                continue;
            }
        }
        return divSum;
    }

    public void printANumberTriangle() {
        for (int i = 1; i <= number; i++) {

        }
    }

}
