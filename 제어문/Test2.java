package ���;

public class Test2 {
	public static void main(String[] args) {

		// 1~3
		char pw1 = 'p';
		char pw2 = 'p';
		float weight = 2.2f;

		if (pw1 == pw2) {
			System.out.println("PASS!");
			if (weight > 2) {
				System.out.println("���̾�Ʈ ����!");
				System.out.println("������ ����!");
			} else {
				System.out.println("�ø� �ٽ� ����!");
			}
		} else {
			System.out.println("���Է�!");
		}

		// 4
		int ü�� = 66, ���� = 77, ���� = 88, ���� = 99;
		int avr = (ü�� + ���� + ���� + ����) / 4;
		System.out.println(avr);

		// 5
		float pi = 3.14f;
		float radius = 2.2f;
		float area = pi * radius * radius;
		System.out.printf("%.2f", area);

	}
}
