package ch06;

public class MyMath2 {
    long a, b;

    long add() { // instance method
        return a + b; // iv 사용
    }

    static long add(long a, long b) { // static method
        return a + b; // iv 사용X
    }
}
