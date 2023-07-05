package com.in28minutes.ifstatement.examples;

public class IfStatementRunner {

    public static void main(String[] args) {
        int i = 25;
        if (i == 25) {
            System.out.println("i = 25");
        } else if (i == 24) {
            System.out.println("i = 24");
        } else {
            System.out.println("i is neither 25 or 24");
        }

        int number = -1;
        if (number < 0) {
            number = number + 10;
        }
        number++;
        System.out.println(number);
    }

}
