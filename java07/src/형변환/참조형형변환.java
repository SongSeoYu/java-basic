package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {
	public static void main(String[] args) {
		//배열의 단점: 고정된 크기, 같은 타입만 모을 수 있다.
		//ArrayList: 가변 크기, 다른 타입도 가능하다.
		
		ArrayList list = new ArrayList();
		list.add("홍길동");	//Object(큰) <-- String(작)		
		//큰 <-- 작(자동형변환, up casting)
		//큰 --> 작(강제형변환, dowun casting)
		
		list.add(100);
		list.add(0.2);
		list.add(true);
		list.add(new JButton());
		System.out.println(list.size());
		
		String name = (String)list.get(0);	//홍길동
		int num = (int)list.get(1);
		double d = (double)list.get(2);
		boolean t = (boolean)list.get(3);
		list.get(4);
	}
}
