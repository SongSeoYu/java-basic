package 조건문;

import java.sql.Date;

public class SwitchCase테스트2 {
	public static void main(String[] args) {
		Date date = new Date(0);
//		int month = date.getMonth() + 1;	//getMonth를 하면 이전달이 온다.
//		int day = date.getDay();		//요일
		// 0이 일요일, 6이 토요일
//		switch (day) {
//		case 0: case 6:
//			System.out.println("놀자");
//			break;
//
//		default: System.out.println("자바 공부하러 가자.");
//			break;
//		}

		long time = date.getTime();
		if (time < 11) {
			System.out.println("Good morning");
		} else if (time <= 15) {
			System.out.println("Good afternoon");

		} else if (time <= 19) {
			System.out.println("Good night");

		}

		int month = date.getMonth() + 1;


		if (month == 1 || month == 4 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			for (int i = 1; i <= 31; i++) {
				System.out.println(month + "월");
				System.out.print(i + "");
			}
		} else if (month == 3 || month == 6 || month == 9 || month == 11) {
			for (int i = 1; i <= 30; i++) {
				System.out.println(month + "월");
				System.out.print(i + "");
			}
		} else {
			for (int i = 1; i <= 28; i++) {
				System.out.println(month + "월");
				System.out.print(i + "");
			}

		}
	}
}
