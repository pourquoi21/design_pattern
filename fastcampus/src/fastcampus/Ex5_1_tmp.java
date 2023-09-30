package fastcampus;

import java.util.Arrays;

public class Ex5_1_tmp {

    public static void main(String[] args) {
        int[] score; // 배열 score를 선언
        score = new int[5]; // 배열의 생성

        int[] numbers = new int[5]; // 배열의 선언과 생성 동시에

        int[] arr = new int[5];
        System.out.println("arr.length = " + arr.length);

        int[] arr2 = { 50, 60, 70, 80, 90 };
        System.out.printf("%d, %d", arr2[0], arr2[1]);
        System.out.println();

        System.out.println(Arrays.toString(arr2));
    }

}
