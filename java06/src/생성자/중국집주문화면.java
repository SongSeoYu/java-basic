package 생성자;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.font.ImageGraphicAttribute;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class 중국집주문화면 {
	static int count;
//	static final int PRICE = 5000;
	static int price;
	
	private static JTextField t1;
	static JLabel center;
	static int 짜장count = 0;
	static int 짬뽕count = 0;
	static int 우동count = 0;
			
	public static void main(String[] args) {
		JFrame f = new JFrame("주문 화면");
		f.setSize(800,800);
		f.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("개수: ");
		lblNewLabel.setFont(new Font("바탕체", Font.PLAIN, 23));
		lblNewLabel.setBounds(500, 53, 94, 59);
		f.getContentPane().add(lblNewLabel);
		
		JLabel t1 = new JLabel("");
		t1.setBackground(new Color(128, 128, 255));
		t1.setFont(new Font("바탕체", Font.PLAIN, 23));
		t1.setBounds(574, 48, 161, 64);
		f.getContentPane().add(t1);
		

		JLabel center = new JLabel();
		//라벨에 이미지를 변경하고 싶으면, 이미지부품을 만들고, 라벨에 아이콘을 셋팅
		ImageIcon img1 = new ImageIcon("C:/JavaDev/eclipse-workspace/java06/src/image/짜장.jpg");
		center.setIcon(img1);	//주소
//		center.setIcon(new ImageIcon("C:\\JavaDev\\eclipse-workspace\\java06\\src\\image\\짜장.jpg"));
		center.setFont(new Font("굴림", Font.BOLD, 20));
		
		center.setBounds(91, 153, 616, 445);
		f.getContentPane().add(center);
		
		
		JLabel t2 = new JLabel("");
		t2.setFont(new Font("바탕체", Font.PLAIN, 20));
		t2.setBounds(47, 630, 643, 59);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("결제금액: ");
		lblNewLabel_1.setFont(new Font("바탕체", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(47, 699, 150, 59);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel result = new JLabel("");
		result.setFont(new Font("바탕체", Font.PLAIN, 23));
		result.setBackground(new Color(128, 128, 255));
		result.setBounds(149, 694, 209, 64);
		f.getContentPane().add(result);
		
		JButton btn1 = new JButton("짜장면");
		btn1.setFont(new Font("바탕체", Font.PLAIN, 23));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				짜장count++;
				count++;
				t2.setText("짜장(5000): " + 짜장count + "개    짬뽕(6000): " + 짬뽕count + "개    우동(3000): " + 우동count + "개");
				t1.setText(count + "개");
				price = price + (짜장count * 5000);
				result.setText(price + "원");
				ImageIcon icon = new ImageIcon("짜장.jpg"); 	//result라벨에 있는 결제금액 변경
				Image img = icon.getImage();
				Image changeImg = img.getScaledInstance(616, 445, Image.SCALE_SMOOTH);
				ImageIcon changeIcon = new ImageIcon(changeImg);
				center.setIcon(changeIcon);
			}
		});
		btn1.setBounds(47, 48, 120, 64);
		f.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("짬뽕");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				짬뽕count++;
				count++;// count = count + 1, 증감연산자
				//t1에 현재 주문량을 변경
				t2.setText("짜장(5000): " + 짜장count + "개    짬뽕(6000): " + 짬뽕count + "개    우동(3000): " + 우동count + "개");
				t1.setText(count + "개");
				price = price + (짜장count * 6000);
				result.setText(price + "원");
				//center라벨에 있는 이미지 변경
				//이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("C:/JavaDev/eclipse-workspace/java06/src/image/짬뽕.jpg");
				Image img = icon.getImage();
				Image changeImg = img.getScaledInstance(616, 445, Image.SCALE_SMOOTH);
				ImageIcon changeIcon = new ImageIcon(changeImg);
				center.setIcon(changeIcon);
				//result라벨에 있는 결제금액 변경
//				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btn2.setBounds(190, 48, 120, 64);
		btn2.setFont(new Font("바탕체", Font.PLAIN, 23));
		f.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("우동");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				우동count++;
				count++;
				t2.setText("짜장(5000): " + 짜장count + "개    짬뽕(6000): " + 짬뽕count + "개    우동(3000): " + 우동count + "개");
				t1.setText(count + "개");
				price = price + (짜장count * 4000);
				result.setText(price + "원");
//				result.setText( count * PRICE + "원");
				ImageIcon icon = new ImageIcon("C:/JavaDev/eclipse-workspace/java06/src/image/우동2.jpg"); 	//result라벨에 있는 결제금액 변경
				Image img = icon.getImage();
				Image changeImg = img.getScaledInstance(616, 445, Image.SCALE_SMOOTH);
				ImageIcon changeIcon = new ImageIcon(changeImg);
				center.setIcon(changeIcon);
			}
		});		
		btn3.setFont(new Font("바탕체", Font.PLAIN, 23));
		btn3.setBounds(333, 48, 120, 64);
		f.getContentPane().add(btn3);
		
		f.setVisible(true);
		
	}
}
