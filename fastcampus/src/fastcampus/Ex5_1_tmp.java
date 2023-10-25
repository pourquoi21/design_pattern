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

        String[] strArr = { "가위", "바위", "보" };

        int i = (int) (Math.random() * 3);

        System.out.println(strArr[i]);

        String str = "ABCDE";

        System.out.println(str.charAt(2));
        System.out.println(str.substring(2, 4));

        int[] arr1 = { 0, 1, 2, 3, 4 };
        int[][] arr2D = { { 11, 12 }, { 21, 22 } };

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
        String[][] str2D2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };

        System.out.println(Arrays.deepEquals(str2D, str2D2));

        int[] arr3 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = Arrays.copyOfRange(arr2D, 0, 1);
        System.out.println(Arrays.deepToString(arr4));

        int[] arrMixed = { 5, 3, 4, 1, 2 };
        Arrays.sort(arrMixed);
        System.out.println(Arrays.toString(arrMixed));
    }

}
