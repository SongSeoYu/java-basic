package 배열응용;

import java.util.Random;

public class 랜덤한값배열에넣기 {
	public static void main(String[] args) {
		int[] lotto = new int[1000];
		
		Random r = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
			
		}
		
		for(int x : lotto) {
			System.out.println(x + " ");
		}
	}
}
