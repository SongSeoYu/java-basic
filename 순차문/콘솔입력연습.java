package 순차문;

import java.util.Scanner;

public class 콘솔입력연습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력: ");
		String name = sc.next();
		System.out.print("입력받은 이름은 " + name + "입니다.");
	}
}
