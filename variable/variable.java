package variable;

import javax.swing.JOptionPane;

public class variable {

	public static void main(String[] args) {
		byte age = 100; 	//127이하(1바이트)
		short wallet = 20000;	//3만(2바이
		int money = 500000000;	//21억(4바이트)
		long space = 10000000000L;	//21억 이상(8바이트)
		
		double height = 185.5;
		float weight = 88.8f;
		
		char gender = '남';
		
		boolean todayFinished = false;
		
		String name = "김이름";
		System.out.println(name);
		
	}

}
