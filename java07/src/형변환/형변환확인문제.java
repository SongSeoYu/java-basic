package 형변환;

import java.util.ArrayList;
import java.util.Iterator;

public class 형변환확인문제 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//Object <- 자동형변환 - Integer <- 오토박싱 - int
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add("남");
		
		//1번 전체목록 프린트
		System.out.println(list);
		
		//2번 정수형 더하기(다운캐스팅,오토언박싱)
		int money = (Integer)list.get(0) + 2000;
		System.out.println("돈" + money);
		
		//3번 실수형 더하기
		double hight = (double)list.get(1) + 10;
		System.out.println("키" + hight);
		
		//4번 불린 조건문
		boolean meal = (boolean)list.get(2);
		if (meal == false) {
			System.out.println("배고파요");
		}else {
			System.out.println("배불러요");
		}
		
		//5번 문자열 조건문
		String gender = (String)list.get(3);
		if (gender == "남") {
			System.out.println("주민번호는 1 또는 3이에요.");
		}else System.out.println("주민번호는 2 또는 4입니다.");
		
	}
}
