package ch06;

public class Ex6_1 {

    public static void main(String[] args) {
        Tele t = new Tele();
        // tv t; t = new Tv(); 도 가능
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }

}

class Tele {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
