package �迭����;

import java.util.Random;

public class ���͹���ä��2 {
	public static void main(String[] args) {
		int[] ����� = new int[990];
		int[] ����� = new int[990];
		
		Random r = new Random();
		
		for (int i = 0; i < �����.length; i++) {
			�����[i] = r.nextInt(3) + 1;
			�����[i] = r.nextInt(3) + 1;
			
		}
		System.out.println("��ȣ\t��\t����");
		for (int i = 0; i < �����.length; i++) {
			System.out.println((i + 1) + "\t" + �����[i] + "\t" + �����[i]);
		}
		
		int jumsu = 0;
		for (int i = 0; i < �����.length; i++) {
			if (�����[i] == �����[i]) {
				jumsu++;
			}
		}
		
		System.out.println("����: " + jumsu);
		
	}
}
