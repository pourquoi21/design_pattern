package ch06;

public class Card {

    String kind;
    int number;

    static int width = 100;
    static int height = 250;

    public static void main(String[] args) {
        Card c = new Card();
        c.kind = "HEART";
        c.number = 5;
//        c.width = 200;
//        c.height = 300;
        Card.width = 200; // cv앞에는 c.(참조변수)가 아닌 class명이 붙어야 한다. iv와 헷갈릴수있으므로.
        Card.height = 300;

    }

}
