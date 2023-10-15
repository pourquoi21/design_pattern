package ch06;

public class Scope {

    static int cv;
    int iv;

    static int a;
    static int b;

    public static void main(String[] args) {
        System.out.println("add2 first: " + add2());
        int lv;
        a = 2;
        b = 3;
        System.out.println("add2 second: " + add2());

        Scope s = new Scope();

        s.a = 3;
        s.b = 4;

        System.out.println("add2 third: " + add2());
        System.out.println(s.add(a, b));
        System.out.println(s.add2()); // s의 a와 b를 주석처리했으므로 0나옴

        change(s);
        System.out.println("after change(s) : a = " + s.a);
        System.out.println("after change(s) add = " + s.add(a, b));
    }

    String add(int a, int b) {
        int c = a + b;
        return Integer.toString(c); // 두 가지 방법 중 하나로 int > String 가능
//        return String.valueOf(c);
    }

    static String add2() {
        int c = a + b;
        return String.valueOf(c);
    }

    static void change(Scope s) {
        s.a = 2000;
        System.out.println("change() : a = " + s.a);

    }

}
