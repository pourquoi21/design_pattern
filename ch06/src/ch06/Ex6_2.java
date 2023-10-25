package ch06;

public class Ex6_2 {
    public static void main(String[] args) {
        Tele t1 = new Tele();
        Tele t2 = new Tele();

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");

        t2 = t1; // 참조변수 t1의 값을 t2에 저장. 왜 참조변수냐면 Tele는 원시타입이 아니니까.
        // 연결이 끊어진, t2가 원래 가리키던 객체는 GC에 의해 처리될것임

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");

    }
}
