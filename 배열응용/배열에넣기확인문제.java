package �迭����;

public class �迭���ֱ�Ȯ�ι��� {
	public static void main(String[] args) {
		String[] tour1 = {"�ٴ���", "���ֵ�", "�Ϻ�"};
		String[] tour2 = {"������", "���ֵ�", "���۳�����"};
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
