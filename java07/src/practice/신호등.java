package practice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class 신호등 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setSize(650,650);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton b1 = new JButton("빨간불");
		b1.setFont(new Font("바탕체", Font.BOLD, 30));
		b1.setBackground(Color.red);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("노란불");
		b2.setFont(new Font("바탕체", Font.BOLD, 30));
		b2.setBackground(Color.yellow);
		f.getContentPane().add(b2);

		JButton b3 = new JButton("파란불");
		b3.setFont(new Font("바탕체", Font.BOLD, 30));
		b3.setBackground(Color.green);
		f.getContentPane().add(b3);
		

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("image/red.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("image/yellow.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("image/green.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		f.setVisible(true);
	}
}
