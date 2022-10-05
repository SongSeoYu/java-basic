package 정적;

public class 나의일지 {
	public static void main(String[] args) {
		//변수는 선언된 위치를 포함한 괄호안에서만 사용
		//day1, day2, day3은 메서드 안에서만 쓸 수 있음
		//main안에서만 쓸 수 있는 지역변수(local변수)
		//지역변수 <---> 전역변수
		//지역변수는 자동초기화X
		Day day1 = new Day("자바수업",8,"기숙사");
		System.out.println(day1); //주소대신 toString이 찍힘
		System.out.println(Day.count + "일차");
		
		Day day2 = new Day("잠",12,"침대");
		System.out.println(day2);
		System.out.println(Day.count + "일차");
		
		Day day3 = new Day("쇼핑",5,"서면");
		System.out.println(day3);
		System.out.println(Day.count + "일차");
		
		System.out.println("하는 일의 전체 시간은 " + Day.t1 + "시간이다.");
		System.out.println("평균 하는일 시간은 약 " + Day.avr + "시간이다.");
		System.out.println("평균 시간: " + Day.getAvg() + "시간");
	}
}
