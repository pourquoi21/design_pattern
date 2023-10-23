package ch06;

public class Ex6_8 {

    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d); // copy method가 끝나면 지역변수 tmp와 d는 사라진다.
        // d2를 참조형으로 받고있다.
        // copy가 static메서드이므로 참조변수를 메서드명 앞에 붙이지 않아도 호출 가능.
        // 같은 클래스이기 때문이기도 하며, static메서드는 객체생성이 없이도 호출가능하다.
        // new Ex6_8() 식으로 객체생성하지 않아도 된다는 이야기.

        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data3 copy(Data3 d) { // 반환타입을 참조형으로 주었으므로
        Data3 tmp = new Data3();

        tmp.x = d.x;

        return tmp; // return타입도 참조형이어야 하며
    }

}

class Data3 {
    int x;
}
