package 반복문;

public class For반복문연습2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum = sum +1;
		}
		
		System.out.println(sum);
		
		System.out.println("-------------");
		int sum2 = 0;
		for( int i = 3; i <= 11; i++) {
			sum2 = sum2 + 1;
			System.out.println(sum2);
		}
	}
}
