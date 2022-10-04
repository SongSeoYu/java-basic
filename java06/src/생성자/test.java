
package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test {
	static int count; //int count = 0;와 동일, 전역변수는 자동 초기화
	static final int PRICE = 5000; //상수는 final을 붙여서 변경불가능으로 설정
	
	private static JTextField t1;
	static JLabel result;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.setSize(800, 800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218:");
		lblNewLabel.setFont(new Font("바탕체", Font.PLAIN, 23));
		lblNewLabel.setBounds(47, 48, 120, 64);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(128, 128, 255));
		t1.setFont(new Font("바탕체", Font.PLAIN, 23));
		t1.setBounds(574, 48, 161, 64);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel center = new JLabel("");
		//라벨에 이미지를 변경하고 싶으면, 이미지부품을 만들고, 라벨에 아이콘을 셋팅
		ImageIcon img = new ImageIcon("짜장면.png");
		center.setIcon(img); //주소
//		Font font = new Font("굴림", Font.BOLD, 20);
//		center.setFont(font);
		center.setFont(new Font("굴림", Font.BOLD, 20));
		center.setBounds(91, 153, 616, 445);
		f.getContentPane().add(center);
		
		result = new JLabel("\uACB0\uC81C\uAE08\uC561");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBounds(124, 464, 555, 61);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("\uC9EC\uBF55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//주문량을 현재 카운트에 하나 플러스
				count++;// count = count + 1, 증감연산자
				//t1에 현재 주문량을 변경
				t1.setText(count + "개");
				//center라벨에 있는 이미지 변경
				//이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("짬뽕.png");
				center.setIcon(icon);
				//result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton.setBounds(12, 10, 142, 66);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				count++;// count = count + 1, 증감연산자
				//t1에 현재 주문량을 변경
				t1.setText(count + "개");
				//center라벨에 있는 이미지 변경
				//이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("우동.png");
				center.setIcon(icon);
				//result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(166, 10, 142, 66);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC9DC\uC7A5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				count++;// count = count + 1, 증감연산자
				//t1에 현재 주문량을 변경
				t1.setText(count + "개");
				//center라벨에 있는 이미지 변경
				//이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("짜장면.png");
				center.setIcon(icon);
				//result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(320, 10, 142, 66);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}