package fastcampus;

import java.util.Scanner;

public class Ex4_18 {

    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("메뉴를 선택하세요(종료는 0)");

            String choice = scanner.nextLine();
            menu = Integer.parseInt(choice);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(menu >= 1 && menu <= 3)) {
                System.out.println("잘못 선택하셨습니다. 메뉴 화면으로 돌아갑니다.");
                continue;
            }

            System.out.println("선택하신 메뉴는 " + menu + "입니다.");
        }
    }

}
