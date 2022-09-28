package javavabasic;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class test {
	public static void main(String[] args) {
		String name = "송서유";
		int age = 28;
		String hometown = "인천";
		
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 고향은 " + hometown);
		
		//prinot(),입력용
		String age1 = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		
		
		//alert()
		JOptionPane.showMessageDialog(null, "나의 나이는 " + age1);
	}
}
