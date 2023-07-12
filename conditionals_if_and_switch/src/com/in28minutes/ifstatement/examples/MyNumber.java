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
                if (i == 1)
                    continue;
                if (i == number)
                    return true;
                return false;
            }
        }
        return false;
    }

}
