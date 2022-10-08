package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주식크롤링 {
	private static JTextField textField;
	//버튼을 누를 때마다 textArea부분에 결과를 넣어주려면
	//아무곳에서나 접근이 가능해야함.
	//전역변수로 선언해주어야 함.
	static JTextArea textArea;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().setBackground(new Color(183, 183, 255));
		f.setSize(514,650);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("code:");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(95, 262, 161, 57);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setFont(new Font("굴림", Font.BOLD, 40));
		textField.setBackground(Color.pink);
		textField.setBounds(182, 262, 225, 50);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.BLUE);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 30));
		textArea.setBounds(41, 389, 416, 214);
		f.getContentPane().add(textArea);
		
		
		JButton btn1 = new JButton("삼성전자");
		btn1.setFont(new Font("굴림", Font.PLAIN, 40));
		btn1.setBounds(95, 23, 312, 57);
		f.getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code를 주면서, 크롤링 해달라고 하자.
				//크롤링연습 6의 naver(code)호출!
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005930");
				textArea.setText(result);
				
			}
		});
		
		JButton btn2 = new JButton("sk하이닉스");
		btn2.setFont(new Font("굴림", Font.PLAIN, 40));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code를 주면서, 크롤링 해달라고 하자.
				//크롤링연습 6의 naver(code)호출!
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("000660");
				textArea.setText(result);
			}
		});
		btn2.setBounds(95, 110, 312, 57);
		f.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("한국항공우주");
		btn3.setFont(new Font("굴림", Font.PLAIN, 40));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code를 주면서, 크롤링 해달라고 하자.
				//크롤링연습 6의 naver(code)호출!
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("047810");
				textArea.setText(result);
			}
		});
		btn3.setBounds(95, 190, 312, 57);
		f.getContentPane().add(btn3);
		
		JButton btnNewButton = new JButton("크롤링 시작");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 25));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textFild에 입력한 code를 가지고 와라.
				String code = textField.getText();			
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("code");
				textArea.setText(result);
			}
		});
		btnNewButton.setBounds(95, 328, 312, 36);
		f.getContentPane().add(btnNewButton);
		
		
		f.setVisible(true);
	}
}
