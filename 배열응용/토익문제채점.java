package �迭����;

import java.util.Random;

public class ���͹���ä�� {
	public static void main(String[] args) {
		int[] ����� = new int[990];
		int[] ����� = new int[990];
		
		Random r = new Random();
		
		for(int i = 0; i < �����.length; i++) {
			�����[i] = r.nextInt(4)+1;	
			�����[i] = r.nextInt(4)+1;
		}
		System.out.println("��ȣ\t���\t����");
		System.out.println("----------------------");
		for (int i = 0; i < �����.length; i++) {
			System.out.println((i +1) + ":\t" +  �����[i] + "\t" + �����[i]);
		}
		
		int jumsu = 0;
		for (int i = 0; i < �����.length; i++) {
			if (�����[i] == �����[i]) {
				jumsu++;
			}
		}
		
		System.out.println(jumsu);
	}
}
