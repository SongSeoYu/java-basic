package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {
	public static void main(String[] args) {
		
		//키보드로 입력하는 부품을 ram에 가져다 놓음.
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		System.out.print("숫자 입력>> ");;
		int data = sc.nextInt();
		
		System.out.println("저장된 데이터는 " + data);
	}
}
