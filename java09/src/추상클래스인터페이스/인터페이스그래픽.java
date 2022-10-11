package 추상클래스인터페이스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 인터페이스그래픽 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);;
		f.getContentPane().setLayout(new FlowLayout());
		
		JButton b1 = new JButton();
		b1.setText("나를 눌러요");
		JButton b2 = new JButton();
		b2.setText("나도 눌러요");
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		
		Font font = new Font("바탕", Font.BOLD,50);
		b1.setFont(font);
		b2.setFont(font);
		
		버튼1처리클래스 버튼1처리 = new 버튼1처리클래스();
		버튼2처리클래스 버튼2처리 = new 버튼2처리클래스();
		b1.addActionListener(버튼1처리);
		b2.addActionListener(버튼2처리);
		
		TextArea area = new TextArea(6,13);
		area.setFont(font);
		f.getContentPane().add(area);
		
		f.setVisible(true);
		
		
		
	}
}
