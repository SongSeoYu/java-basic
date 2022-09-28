package javavabasic;

import javax.swing.JOptionPane;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hobby = JOptionPane.showInputDialog("당신의 취미를 입력해주세요");
		String name = JOptionPane.showInputDialog("당신의 이름를 입력해주세요");
		
		JOptionPane.showMessageDialog(null, name + "님의 취미는 " + hobby + "입니다.");
	}

}
