package 순차문;

import java.util.Scanner;

public class 콘솔입력연습02 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나에 대한 정보");
		System.out.print("----------------");
		System.out.print("이름 입력>> ");
		String name = sc.next();
		System.out.print("나이 입력>> ");
		int age = sc.nextInt();
		System.out.print("취미 입력>> ");
		String hobby = sc.next();
		System.out.print("----------------");
		System.out.print("나의 이름은 " + name);
		System.out.print("나의 이름은 " + age);
		System.out.print("나의 이름은 " + hobby);
		
		System.out.println();
		System.out.println("===============");
		System.out.println();
		
		System.out.print("나의 이름은?  ");
		String name2 = sc.next();
		System.out.print("나의 키는? ");
		double tall = sc.nextDouble();
		System.out.print("나의 몸무게는? ");
		float weight = sc.nextFloat();
		System.out.print("나는 저녁을 먹었나요? ");
		boolean dinner = sc.nextBoolean();
		sc.nextLine();
		System.out.print("나의 좌우명은? ");
		String motto = sc.nextLine();
		System.out.println("----------------");
		System.out.println("내 이름은 " + name2 + "입니다.");
		System.out.println("내 내년 키는 " + (tall-10) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (weight - 10) + "입니다.");
		System.out.println("나는 저녁을 " + dinner + "했습니다.");
		System.out.println("나의 좌유명은 " + motto + "입니다.");
		
	}
}
