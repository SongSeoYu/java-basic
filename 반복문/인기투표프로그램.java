package 반복문;

import java.util.Scanner;

public class 인기투표프로그램 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int 아이유 = 0;
		int 유재석 = 0;
		int 방탄 = 0;
		
		while (true) {
			System.out.println("입력(1)아이유, (2)유재석, (3)방탄, (4)종료 >> ");
			int anser = sc.nextInt();
			
//			if (anser == 1) {
//				아이유 += 1;
//			} else if (anser == 2) {
//				유재석 += 1;
//			} else
//				방탄 += 1;
//			
//			System.out.println("한 번 더 하실래요?(yes / no)");
//			String anser2 = sc.next();
//			if(anser2.equals("no")) {
//				System.out.println("투표 감사합니다.");
//				System.out.println("아이유: " + 아이유);
//				System.out.println("유재석: " + 유재석);
//				System.out.println("방탄: " + 방탄);
//				System.exit(0);
//			}
			
			if(anser == 4) {
				System.out.println("투표 감사합니다.");
				System.out.println("아이유: " + 아이유);
				System.out.println("유재석: " + 유재석);
				System.out.println("방탄: " + 방탄);
				System.exit(0);				
			}else if(anser == 1) {
				아이유++;
			}else if(anser == 2) {
				유재석++;
			}else if(anser == 3) {
				방탄++;
			}else System.out.println("없는 번호입니다.");
			
		}	//while
		
	}	//main
}
