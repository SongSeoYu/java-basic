package 배열응용;

public class 배열에넣기확인문제 {
	public static void main(String[] args) {
		String[] tour1 = {"다대포", "제주도", "일본"};
		String[] tour2 = {"정동진", "제주도", "자작나무숲"};
		int count = 0;
		
		for (int i = 0; i < tour1.length; i++) {
			for (int j = 0; j < tour2.length; j++) {
				if (tour1[i].equals(tour2[j])) {
					
					count++;
					System.out.println(tour1[i]);
					System.out.println(count);
				}
			}
		}
	}
}
