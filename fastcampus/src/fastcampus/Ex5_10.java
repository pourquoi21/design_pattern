package fastcampus;

import java.util.Scanner;

public class Ex5_10 {

    public static void main(String[] args) {
        String[][] words = { { "chaise", "의자" }, { "ordinateur", "컴퓨터" }, { "fenetre", "창문" } };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i + 1, words[i][0]);

            String tmp = scanner.nextLine();

            if (tmp.equals(words[i][1])) {
                System.out.printf("정답입니다. %n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 " + "\"" + "%s" + "\"" + "입니다. %n%n", words[i][1]);
            }
//            System.out.println("");
        }

    }

}
