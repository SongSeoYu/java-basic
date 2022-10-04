package 배열기본;

public class 배열만들기 {
	public static void main(String[] args) {
		//배열은 데이터 개수 + 배열길이까지 해서 데이터개수+1칸이 만들어진다.
		int[] s = {1, 2, 3, 4, 5,};	// 6개가 만들어짐
		System.out.println("s에 저장된 주소>> " + s);
		
		
		//배열은 공간을 만들면 자동초기화 된다. = 모든 공간에 0이 들어가있다.
		int[] s2 = new int[5];
		System.out.println("s2에 저장된 주소>> " + s2);
		System.out.println(s[0]);
		System.out.println(s[2]);
		System.out.println(s[5]);
		
		
		int[] num = new int[5];
		
		//for-each
		//인덱스 0부터 시작해서 1씩 증가하며 끝까지 하나씩 꺼내옴
		for(int i : num)
	}
}
