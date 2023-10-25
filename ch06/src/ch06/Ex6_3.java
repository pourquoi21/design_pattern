package ch06;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + " * " + c1.height + ") 이다.");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + " * " + c2.height + ") 이다.");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1의 width와 height를 바꿨습니다. c1과 c2의 width, height를 출력하겠습니다.");

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + " * " + c1.height + ") 이다.");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + " * " + c2.height + ") 이다.");

        System.out.println("c2의 width와 height도 바뀐 것을 확인할 수 있습니다. 이는 width와 height가 cv이기 때문입니다.");
        System.out.println("혼란을 피하기 위하여 cv의 경우 Card.width, Card.height와 같이 Class명으로 접근하는 것을 추천합니다.");
    }
}
