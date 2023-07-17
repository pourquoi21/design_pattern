package com.in28minutes.ifstatement.examples;

public class MyNumber {
    int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {

        // 처음에 짰던 코드
//        for (int i = 1; i <= number; i++) {
//            if (number % i > 0) {
//                continue;
//            }
//
//            if (number % i == 0) {
//                if (i == 1) {
//                    continue;
//                }
//
//                if (i == number) {
//                    return true;
//                }
//                return false;
//            }
//        }
//        return false;

        if (number < 2) { // guard check (조건이 유효한지 체크)
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
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
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                divSum += i;
            } else {
                continue;
            }
        }
        return divSum;
    }

    public void printANumberTriangle() {
//        String stringLine = "";
//        for (int i = 1; i <= number; i++) {
//            stringLine += i;
//            stringLine += " ";
//            System.out.println(stringLine);
//        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

}
