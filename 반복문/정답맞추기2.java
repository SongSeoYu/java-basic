package 반복문;

import java.util.Scanner;

public class 정답맞추기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int bigger = 0;
		int smaller = 0;

		while (true) {
			count += 1;
			System.out.print("정수입력: ");
			int a = sc.nextInt();
			System.out.print("정수입력: ");
			int b = sc.nextInt();

			if (a > b) {
				System.out.println("앞 숫자가 더 큽니다.");
				bigger += 1;
			} else if (a == b) {
				System.out.println("두 숫자의 크기는 같습니다.");
			} else {
				smaller += 1;
				System.out.println("뒷 숫자가 더 큽니다.");

			}

			System.out.println("종료할까요?(x) 계속할까요?(o)");
			String anser = sc.next();
			char anser2 = anser.charAt(0); // 첫번째 문자 1개를 가지고 오세요.
			if (anser.equals("x")) {
				System.out.println("도전 횟수: " + count);
				System.out.println("더 큰 횟수: " + bigger);
				System.out.println("더 작은 횟수: " + smaller);
				System.exit(0);
			}	//if
		}	//while
	}	//main
}	//class