package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ������߱� {
	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);	//0~99
		int count = 0;		//int�� ���� 0���� �ʱ�ȭ������.
		int mis = 0; 
		//���������ִ� ������ ������ �ݺ��� �ȿ� ���� �ʴ´�.
			
		
		while (true) {
			String data = JOptionPane.showInputDialog("������ ���� �Է�");
			count = count + 1;
			int data2 = Integer.parseInt(data);
			if (data2 == target) {
				System.out.println("������ " + target);
				System.out.println("�����Դϴ�! �����մϴ�.");
				System.out.println("Ʋ�� Ƚ���� " + mis);
				System.out.println("��ü �õ�Ƚ���� " + count);
	
				//���� ������ ������ ó���� �ؾ���.
				break;	//while�� ����	//if�� �ȿ� ������  break�� �ݺ����� ���Ǵ� �����̱� ������ while�� break�̴�.
//				System.exit(0);	//���α׷� ����
			} else {
				mis += 1;
				System.out.println("������ �ƴմϴ�.");
				if (data2 > target) {
					System.out.println("�ʹ� Ŀ��.");
				} else {
					System.out.println("�ʹ��۾ƿ�.");
				}
			}	 //else
		}	//while
		
		JOptionPane.showMessageDialog(null, "������ �� �湮���ּ���.");		//exit(0)���� ���� �� �ٿ� ������ ������ ���� ���⶧���� �� �ٿ� ������ ���.
	}	//main
}	//class
