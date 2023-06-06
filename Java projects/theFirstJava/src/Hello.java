public class Hello {
    /* Hello라는 파일을 만들고
    터미널에서 javac Hello.java를 하면
    얘가 컴파일을 할 것이다(아무 메시지도 출력되지 않음)
    그 이후에 java Hello 를 하면 JVM이 Hello.class를 실행한다.
    Hello 파일 내부의 코드 실행 */
    public static void main(String[] args){
        int a = 5;
        float f = 6.235f;
        char ch = 'A';
        System.out.println("Hello!");
        for (int i = 2; i < 11; i++){
            System.out.printf("%d * %d = %d", a, i, 5*i).println();
        }
        System.out.printf("%d + %d + %d = %d", 5, 6, 7, 5 + 6 + 7 ).println();
        System.out.printf("%4.2f", f).println();
        System.out.println((int) ch);
    }

    void sayHelloWorld(int noOfTimes){
        for (int i = 1; i <= noOfTimes; i++){
            System.out.println("Hello World");
        }
    }

    void printMultiplicationTable(int n){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d", n, i, n * i).println();
        }
    }

    int sumOfNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }

    int sumOfNumbers(int firstNumber, int secondNumber, int thirdNumber){
        int sum = firstNumber + secondNumber + thirdNumber;
        return sum;
    }
}
