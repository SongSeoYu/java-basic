package ������;

import java.util.Scanner;

public class �ܼ��Է¿���02 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� ����");
		System.out.print("----------------");
		System.out.print("�̸� �Է�>> ");
		String name = sc.next();
		System.out.print("���� �Է�>> ");
		int age = sc.nextInt();
		System.out.print("��� �Է�>> ");
		String hobby = sc.next();
		System.out.print("----------------");
		System.out.print("���� �̸��� " + name);
		System.out.print("���� �̸��� " + age);
		System.out.print("���� �̸��� " + hobby);
		
		System.out.println();
		System.out.println("===============");
		System.out.println();
		
		System.out.print("���� �̸���?  ");
		String name2 = sc.next();
		System.out.print("���� Ű��? ");
		double tall = sc.nextDouble();
		System.out.print("���� �����Դ�? ");
		float weight = sc.nextFloat();
		System.out.print("���� ������ �Ծ�����? ");
		boolean dinner = sc.nextBoolean();
		sc.nextLine();
		System.out.print("���� �¿����? ");
		String motto = sc.nextLine();
		System.out.println("----------------");
		System.out.println("�� �̸��� " + name2 + "�Դϴ�.");
		System.out.println("�� ���� Ű�� " + (tall-10) + "�Դϴ�.");
		System.out.println("�� ���� �����Դ� " + (weight - 10) + "�Դϴ�.");
		System.out.println("���� ������ " + dinner + "�߽��ϴ�.");
		System.out.println("���� �������� " + motto + "�Դϴ�.");
		
	}
}
