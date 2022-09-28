package 반복문;

public class For정리문제 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 22; i <= 222; i++) {
			sum += i;
		}
		System.out.println(sum);

		for (int i = 55; i <= 4500; i += 2) {
			i += i;
		}
		System.out.println(sum);

		for (int i = 0; i <= 6000; i += 5) {
			i += i;
		}
		System.out.println(sum);

		for (int i = 1; i <= 1000; i += 5) {
			sum += i;
			if (sum >= 100) {
				break;
			}
			if (i % 5 == 5) {
				continue;
			}
		}
		System.out.println(sum);

	}
}
