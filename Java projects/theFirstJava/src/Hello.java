public class Hello {
    /* Hello라는 파일을 만들고
    터미널에서 javac Hello.java를 하면
    얘가 컴파일을 할 것이다(아무 메시지도 출력되지 않음)
    그 이후에 java Hello 를 하면 JVM이 Hello.class를 실행한다.
    Hello 파일 내부의 코드 실행 */
    public static void main(String[] args){
        System.out.println("Hello!");
        for (int i = 2; i<11; i++){
            System.out.printf("5 * %d = %d", i, 5*i).println();
        }
    }
}
