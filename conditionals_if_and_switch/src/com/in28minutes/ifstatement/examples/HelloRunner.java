package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class HelloRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you feel?");
        System.out.println("1 - Happy");
        System.out.println("2 - So So");
        System.out.println("3 - Sad");
        System.out.println("4 - Angry");

        int emotion = scanner.nextInt();

        reactionToEmotion(emotion);
    }

    private static void reactionToEmotion(int emotion) {
        switch (emotion) {
        case 1:
            System.out.println("I am happy for you too!");
            break;
        case 2:
            System.out.println("I hope you will be happier!");
            break;
        case 3:
            System.out.println("Aww, don't be sad.");
            break;
        case 4:
            System.out.println("What made you angry?");
            break;
        default:
            System.out.println("You chose a wrong number!");
            break;
        }
    }

}
