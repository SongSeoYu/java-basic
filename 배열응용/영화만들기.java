package �迭����;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ��ȭ����� {
	static int start = 2;
	public static void main(String[] args) {
		
		//��ȭ����
		String[] title = {"������� �׸��� ����", "�ƹ�Ÿ �������͸�", "����� �� Ÿ��" , "9���� ������",  
				"�� �ߵ� �ž�"};
		//����������
		String[] img = {"�����.jpg", "�ƹ�Ÿ.jpg", "�����.jpg", "����.jpg", "����.jpg"};
		
		//���� 
		double[] jumsu = {9.67, 9.64, 9.24, 8.09, 7.66};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(416, 425);
		
		JLabel top = new JLabel("\uC9F1\uAD6C");
		top.setBackground(Color.YELLOW);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("����", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel("77.9");
		under.setBackground(Color.YELLOW);
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("����", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//<<��ư�� Ŭ������ �� ó���ϰ� ���� ������ ������, 
				//actionPerformed()�Լ��ȿ� �־��ּ���.
				//������ ǥ�õ� �󺧿� ������ �����ؾ���.
				start = start - 1; // 1 = 2 -1
				top.setText(title[start]); //title[1]
				under.setText(jumsu[start] + "��");
				
				//����� �̹��� ��ǰ �ٽ� ��������.
				//��� �󺧿� ����� �̹��� ��ǰ�� ��������.
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			}
		});
		
		JButton btnNewButton = new JButton(">>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start++
				top.setText(title[start]); 
				under.setText(jumsu[start] + "��");
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("����", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
		
		
	}
}
