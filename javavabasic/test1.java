package javavabasic;

import javax.swing.JOptionPane;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hobby = JOptionPane.showInputDialog("����� ��̸� �Է����ּ���");
		String name = JOptionPane.showInputDialog("����� �̸��� �Է����ּ���");
		
		JOptionPane.showMessageDialog(null, name + "���� ��̴� " + hobby + "�Դϴ�.");
	}

}
