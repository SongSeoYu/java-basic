package 제어문;

public class Test2 {
	public static void main(String[] args) {

		// 1~3
		char pw1 = 'p';
		char pw2 = 'p';
		float weight = 2.2f;

		if (pw1 == pw2) {
			System.out.println("PASS!");
			if (weight > 2) {
				System.out.println("다이어트 성공!");
				System.out.println("오늘은 성공!");
			} else {
				System.out.println("냉리 다시 도전!");
			}
		} else {
			System.out.println("재입력!");
		}

		// 4
		int 체육 = 66, 수학 = 77, 영어 = 88, 국어 = 99;
		int avr = (체육 + 수학 + 영어 + 국어) / 4;
		System.out.println(avr);

		// 5
		float pi = 3.14f;
		float radius = 2.2f;
		float area = pi * radius * radius;
		System.out.printf("%.2f", area);

	}
}
