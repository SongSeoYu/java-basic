package 정적;

public class Day {
	
	//객체생서잇, 힙영역에 복사될 변수들
	//변수들에 해당 실제값이 들어감(실제변수, 인스턴스변수)
	String doing;
	int time;
	String location;
	static int count; //전역변수는 자동초기화
	static int t1;
	static int avr;
	
	//객체생성시, 3개 데이터 반드시 넣어서 객체생성하여세요!
	public Day(String doing, int time, String location) {
		t1 += time;
		count++;
		avr = t1 / count;
		this.doing = doing;
		this.time = time;
		this.location =location;
	}
	
	//일반메서드는 객체생성후, 주소로 접근해서 호출해야한다.
	//일반메서드는 객체생성후, 호출(사용)할 수 있다.
	//평균을 객체생서오가 상관없이 아무때나구하고 싶다!
	//객체생성과 상관없이 기능을 정의하고 싶으면, static!!으로 마들어야 한다.
	public static double getAvg() {
		//static메서드 안에 들어가는 전역변수는
		//객체생성하지 않아도 접근 가능해야 하므로
		//static변수만 가능
		return t1 / (double)count;
	}
	
	//객체생성후, 생성된 객체의 주소가 아닌, 그 주소가 가르키는 인스턴스변수의 값을 가지고 String으로 만들어주세요
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
