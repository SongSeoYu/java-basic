package javavabasic;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class test {
	public static void main(String[] args) {
		String name = "�ۼ���";
		int age = 28;
		String hometown = "��õ";
		
		System.out.println("���� �̸��� " + name);
		System.out.println("���� ���̴� " + age);
		System.out.println("���� ������ " + hometown);
		
		//prinot(),�Է¿�
		String age1 = JOptionPane.showInputDialog("����� ���̸� �Է��ϼ���.");
		
		
		//alert()
		JOptionPane.showMessageDialog(null, "���� ���̴� " + age1);
	}
}
