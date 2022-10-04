package 배열응용;

public class 배열여러개응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] 식구 = {"아버지", "어머니", "나"};
		int[] 나이 = {100, 50, 20};
		double[]키 = {177.7, 132.2, 155.3};
		
		System.out.println(식구[2] + " " + 나이[2] + " " + 키[2]);
		
		System.out.println("식구\t나이\t키");
		System.out.println("---------------------");
		for (int i = 0; i < 식구.length; i++) {
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i]);
		}
	}

}

