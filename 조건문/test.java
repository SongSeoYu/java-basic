package ���ǹ�;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ�� ��ÿ�:  ");
		String pw = sc.next();
		
		if (pw.equals("pass")) {
			System.out.println("��������");
		}
		else System.out.println("��������");
		
		
		System.out.print("����� �԰� ���� ���� �޴��� (¥���, ���, ȸ)");
		String menu = sc.next();
		switch (menu) {
		case "¥���":
			System.out.println("�߱������� ����");
			break;
		case "���":
			System.out.println("�н������� ����");
			break;
		case "ȸ":
			System.out.println("Ƚ������ ����");
			break;
		default: System.out.println("�׳� �ȸԾ��");
			break;
		}
	
	}
}
