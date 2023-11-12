package ch06;

public class StaticBlockTest {
	// 명시적 초기화: 여기에서는 배열생성만 가능하고 배열 내의 요소를 채우지는 못함
	static int[] arr = new int[10];

	static { // 클래스 초기화 블럭 - 배열 arr을 난수로 채운다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}
}
