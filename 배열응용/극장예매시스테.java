package �迭����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ���忹�Žý��� {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(550, 750);
		f.setVisible(true);

		// ���̾ƿ� ��ǰ ����
		// ��ó�� �帣�� ���ʺ��� �ϳ��� ������� �ٿ��ִ� ��ġ ��ǰ�� ���� f�� ����
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

//		JButton b1 = new JButton("�¼�1");
//		JButton b2 = new JButton("�¼�2");
//		JButton b3 = new JButton("�¼�3");
//		
//		f.add(b1);
//		f.add(b2);
//		f.add(b3);

		int[] seat = new int[500];

		for (int i = 0; i < 500; i++) {
			JButton b = new JButton("�¼�");
			f.add(b);

			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s = e.getActionCommand(); // ��ư ���� �ִ� ���ڸ� ������ �ش�.
					JOptionPane.showMessageDialog(f, s + "�� ����Ϸ�");
					b.setEnabled(false);	//.setEnabled(false)�� �ϸ� �ѹ��� ��������.
					b.setBackground(Color.red);
					int index = Integer.parseInt(s);
					seat[index] = 1; // ����Ϸ�

					int count = 0;
					// ������ �� ���� �Ǿ����� Ȯ��
					for (int j : seat) {
						if (j == 1) {
							count++;
//							charge = 13000 * count;		�ݺ����� ������ �ð����⵵�� �ö�
						}
					}
					
					
					JOptionPane.showMessageDialog(f, "����� �¼��� " + count + "���̸� �Ѻ���� " + charge + "�Դϴ�.");
					int charge = 13000 * count;
				}
			});
		}
		f.setVisible(true);

	}
}
