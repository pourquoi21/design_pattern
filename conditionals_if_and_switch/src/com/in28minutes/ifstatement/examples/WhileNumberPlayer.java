package com.in28minutes.ifstatement.examples;

public class WhileNumberPlayer {
    int number;

    public WhileNumberPlayer(int number) {
        this.number = number;
    }

    public void printSquaresUptoLimit() {
        int i = 1;
        while (i * i < number) {
            System.out.println(i * i);
            i++;
        }

    }

    public void printCubesUptoLimit() {
        int i = 1;
        while (i * i * i < number) {
            System.out.println(i * i * i);
            i++;
        }

    }

}
