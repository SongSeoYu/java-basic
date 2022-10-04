package 클래스만들기;


public class 내가게 {
	public static void main(String[] args) {
	
		계산기2 cal2 = new 계산기2();
		int result = cal2.add(200,100);
		double result2 = cal2.add(100, 22.2);
		double result3 = cal2.add(11.1, 22.2);
		String result4 = cal2.add("ok", 100);
		//메서드를 호출하고, 처리값을 main이 받아와서
		//이래코드 받아온 값을 이용해야 하는 경우, return해야함
		int result5 = cal2.add(3000, 4);
		double result6 = cal2.add(result2, 4);
		
		System.out.println("x" + result2 +"y = 4 결과는 " + result6 );
	}
	
}
