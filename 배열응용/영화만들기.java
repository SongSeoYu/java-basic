package 배열응용;

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

public class 영화만들기 {
	static int start = 2;
	public static void main(String[] args) {
		
		//영화제목
		String[] title = {"물방울을 그리는 남자", "아바타 리마스터링", "사랑은 비를 타고" , "9명의 번역가",  
				"다 잘된 거야"};
		//포스터파일
		String[] img = {"물방울.jpg", "아바타.jpg", "사랑은.jpg", "번역.jpg", "다잘.jpg"};
		
		//평점 
		double[] jumsu = {9.67, 9.64, 9.24, 8.09, 7.66};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(416, 425);
		
		JLabel top = new JLabel("\uC9F1\uAD6C");
		top.setBackground(Color.YELLOW);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel("77.9");
		under.setBackground(Color.YELLOW);
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//<<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면, 
				//actionPerformed()함수안에 넣어주세요.
				//제목이 표시된 라벨에 제목을 변경해야함.
				start = start - 1; // 1 = 2 -1
				top.setText(title[start]); //title[1]
				under.setText(jumsu[start] + "점");
				
				//변경된 이미지 부품 다시 만들어야함.
				//가운데 라벨에 변경된 이미지 부품을 넣으세요.
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			}
		});
		
		JButton btnNewButton = new JButton(">>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start++
				top.setText(title[start]); 
				under.setText(jumsu[start] + "점");
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
		
		
	}
}
