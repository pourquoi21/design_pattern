package ch07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
//		b.addActionListener(new EventHandler()); // 이걸 익명클래스로 바꾸려면
		b.addActionListener(new ActionListener() { // 조상이름으로 클래스만들고(클래스의 정의와 객체 생성을 동시에)
			public void actionPerformed(ActionEvent e) { // 내용 그대로 가져옴
				System.out.println("ActionEvent occurred!!");
			}
		});
	}
}

//class EventHandler implements ActionListener {
//	public void actionoPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occurred!!");
//	}
//}
