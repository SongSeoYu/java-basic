package �ݺ���;

import java.util.Scanner;

public class �α���ǥ���α׷� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ������ = 0;
		int ���缮 = 0;
		int ��ź = 0;
		
		while (true) {
			System.out.println("�Է�(1)������, (2)���缮, (3)��ź, (4)���� >> ");
			int anser = sc.nextInt();
			
//			if (anser == 1) {
//				������ += 1;
//			} else if (anser == 2) {
//				���缮 += 1;
//			} else
//				��ź += 1;
//			
//			System.out.println("�� �� �� �ϽǷ���?(yes / no)");
//			String anser2 = sc.next();
//			if(anser2.equals("no")) {
//				System.out.println("��ǥ �����մϴ�.");
//				System.out.println("������: " + ������);
//				System.out.println("���缮: " + ���缮);
//				System.out.println("��ź: " + ��ź);
//				System.exit(0);
//			}
			
			if(anser == 4) {
				System.out.println("��ǥ �����մϴ�.");
				System.out.println("������: " + ������);
				System.out.println("���缮: " + ���缮);
				System.out.println("��ź: " + ��ź);
				System.exit(0);				
			}else if(anser == 1) {
				������++;
			}else if(anser == 2) {
				���缮++;
			}else if(anser == 3) {
				��ź++;
			}else System.out.println("���� ��ȣ�Դϴ�.");
			
		}	//while
		
	}	//main
}
