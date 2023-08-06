package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class OperationRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        System.out.println("5 - Exit");

        int operation = 0;

        do {
            System.out.println("Choose Operation: ");
            operation = scanner.nextInt();
            operation(operation, number1, number2);
        } while (operation != 5);

    }

    private static void operation(int operation, int number1, int number2) {
        switch (operation) {
        case 1:
            System.out.println("Result is " + (number1 + number2));
            break;
        case 2:
            System.out.println("Result is " + (number1 - number2));
            break;
        case 3:
            System.out.println("Result is " + (number1 / number2));
            break;
        case 4:
            System.out.println("Result is " + (number1 * number2));
            break;
        case 5:
            System.out.println("Okay! Bye bye!");
            break;
        }
    }

}
