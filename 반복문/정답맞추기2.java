package �ݺ���;

import java.util.Scanner;

public class ������߱�2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int bigger = 0;
		int smaller = 0;

		while (true) {
			count += 1;
			System.out.print("�����Է�: ");
			int a = sc.nextInt();
			System.out.print("�����Է�: ");
			int b = sc.nextInt();

			if (a > b) {
				System.out.println("�� ���ڰ� �� Ů�ϴ�.");
				bigger += 1;
			} else if (a == b) {
				System.out.println("�� ������ ũ��� �����ϴ�.");
			} else {
				smaller += 1;
				System.out.println("�� ���ڰ� �� Ů�ϴ�.");

			}

			System.out.println("�����ұ��?(x) ����ұ��?(o)");
			String anser = sc.next();
			char anser2 = anser.charAt(0); // ù��° ���� 1���� ������ ������.
			if (anser.equals("x")) {
				System.out.println("���� Ƚ��: " + count);
				System.out.println("�� ū Ƚ��: " + bigger);
				System.out.println("�� ���� Ƚ��: " + smaller);
				System.exit(0);
			}	//if
		}	//while
	}	//main
}	//class