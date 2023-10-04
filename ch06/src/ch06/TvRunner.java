package ch06;

public class TvRunner {

    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 11;
        t.channelDown();
        System.out.println(t.channel);
    }
}
