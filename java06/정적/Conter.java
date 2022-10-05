package 정적;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Conter {
	static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.getContentPane().setBackground(new Color(128, 128, 255));
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 9));
		f.setSize(331,338);
		f.getContentPane().setLayout(null);
		
		JLabel num = new JLabel("0");
		num.setFont(new Font("굴림", Font.BOLD, 120));
		num.setBounds(12, 73, 262, 165);
		f.getContentPane().add(num);
		
		JButton b3 = new JButton("1 뺴기");
		b3.setBackground(new Color(128, 255, 128));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				num.setText(count + "");
						
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 12));
		b3.setBounds(228, 9, 77, 23);
		f.getContentPane().add(b3);
		
		JButton b2 = new JButton("0으로 초기화");
		b2.setFont(new Font("굴림", Font.PLAIN, 12));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count=0;
				num.setText(count + "");
						
			}
		});
		b2.setBounds(105, 9, 111, 23);
		f.getContentPane().add(b2);
		
		JButton b1 = new JButton("1 더하기");
		b1.setBackground(new Color(128, 255, 255));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				num.setText(count + "");
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 12));
		b1.setBounds(12, 9, 84, 23);
		f.getContentPane().add(b1);
		
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(num);
		
		f.setVisible(true);
	}
}
