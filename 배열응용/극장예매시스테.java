package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 극장예매시스테 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(550, 750);
		f.setVisible(true);

		// 레이아웃 부품 지정
		// 물처럼 흐르듯 왼쪽부터 하나씩 순서대로 붙여주는 배치 부품을 만들어서 f에 설정
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

//		JButton b1 = new JButton("좌석1");
//		JButton b2 = new JButton("좌석2");
//		JButton b3 = new JButton("좌석3");
//		
//		f.add(b1);
//		f.add(b2);
//		f.add(b3);

		int[] seat = new int[500];

		for (int i = 0; i < 500; i++) {
			JButton b = new JButton("좌석");
			f.add(b);

			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s = e.getActionCommand(); // 버튼 위에 있는 글자를 가져다 준다.
					JOptionPane.showMessageDialog(f, s + "번 예약완료");
					b.setEnabled(false);	//.setEnabled(false)로 하면 한번만 눌러진다.
					b.setBackground(Color.red);
					int index = Integer.parseInt(s);
					seat[index] = 1; // 예약완료

					int count = 0;
					// 예약이 몇 개가 되었는지 확인
					for (int j : seat) {
						if (j == 1) {
							count++;
//							charge = 13000 * count;		반복문에 넣으면 시간복잡도만 올라감
						}
					}
					
					
					JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개이며 총비용은 " + charge + "입니다.");
					int charge = 13000 * count;
				}
			});
		}
		f.setVisible(true);

	}
}
