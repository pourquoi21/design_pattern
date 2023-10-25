package ch06;

public class Ex6_1 {

    public static void main(String[] args) {
        Tele t = new Tele();
        // tv t; t = new Tv(); 도 가능
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다.");

        Tele[] tvArr = new Tele[3]; // Tele tv1, tv2, tv3; Tele타입의 참조변수 tv1~tv3를 배열로 바꾼 형태

        // 객체를 생성해서 배열의 각 요소에 저장
        tvArr[0] = new Tele();
        tvArr[1] = new Tele();
        tvArr[2] = new Tele();

        // 이는 이렇게 간단히 초기화할 수 있다: Tele[] tvArr = { new Tele(), new Tele(), new Tele() };
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
