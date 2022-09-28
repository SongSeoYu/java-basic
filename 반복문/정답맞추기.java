package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {
	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);	//0~99
		int count = 0;		//int는 보통 0으로 초기화시켜줌.
		int mis = 0; 
		//누적시켜주는 변수의 선언은 반복문 안에 넣지 않는다.
			
		
		while (true) {
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count = count + 1;
			int data2 = Integer.parseInt(data);
			if (data2 == target) {
				System.out.println("정답은 " + target);
				System.out.println("정답입니다! 축하합니다.");
				System.out.println("틀린 횟수는 " + mis);
				System.out.println("전체 시도횟수는 " + count);
	
				//무한 루프를 끝내는 처리를 해야함.
				break;	//while문 종료	//if문 안에 있지만  break는 반복문에 사용되는 문법이기 때문에 while의 break이다.
//				System.exit(0);	//프로그램 종료
			} else {
				mis += 1;
				System.out.println("정답이 아닙니다.");
				if (data2 > target) {
					System.out.println("너무 커요.");
				} else {
					System.out.println("너무작아요.");
				}
			}	 //else
		}	//while
		
		JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요.");		//exit(0)문을 쓰면 이 줄에 영원히 도달할 일이 없기때문에 이 줄에 오류가 뜬다.
	}	//main
}	//class
