package ch06;

public class Tv {

    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelUp();
        System.out.println(t.channel);
    }
}
