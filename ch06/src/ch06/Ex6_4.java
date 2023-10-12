package ch06;

public class Ex6_4 {

    public static void main(String[] args) {
        MyMath mm = new MyMath();

        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        String result5 = mm.big(3L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.printf("divide(5L, 3L) = %3.3f \r\n", result4);
        System.out.println("big(5L, 3L) = " + result5);
    }

}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }

    public double divide(double l, double m) { // double끼리 나눠야 한다는 데에 유의
        double result = l / m;
        return result;
    }

    public long multiply(long l, long m) {
        long result = l * m;
        return result;
    }

    public long subtract(long l, long m) {
        long result = l - m;
        return result;
    }

    public String big(long l, long m) {
        String result;

        if (l > m)
            result = String.valueOf(l);
        else if (l < m)
            result = String.valueOf(m);
        else
            result = "They are same value";

        return result;
    }
}
