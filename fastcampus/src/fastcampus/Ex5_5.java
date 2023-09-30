package fastcampus;

import java.util.Arrays;

public class Ex5_5 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int[] ball2 = new int[6];

        for (int i = 0; i < 6; i++) {
            int j = (int) (Math.random() * 45);
            ball2[i] = j;
        }

        System.out.println(Arrays.toString(ball2));

        int tmp = 0;
//        int j = 0;

        for (int i = 0; i < 6; i++) {
            int j = (int) (Math.random() * 45);
            ball[i] = ball[j];
            tmp = ball[i];
            ball[j] = tmp;
        }
        System.out.println(Arrays.toString(ball));

    }
}
