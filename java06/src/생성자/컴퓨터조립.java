package 생성자;

public class 컴퓨터조립 {
	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(10000, "A회사", 18);
		컴퓨터 com2 = new 컴퓨터(400000, "B회사", 22);
		//com1은 주소가 들어있음.
		//컴퓨터 클래스에 toString() 메서드를 생성해주면
		//주소를 프린트할 때 toString()메서드가 자동 호출되어
		//return한 스트리이을 주소대신에 프린트해준다.
		//주소가 가르키는 힙영역의 멤버변수값을 프린트!
		System.out.println("가격:" + com1.가격 + "\t제조회사: " + com1.제조회사 + "\t모니터크기: " + com1.모니터크기 + "in");
		System.out.println("가격:" + com2.가격 + "\t제조회사: " + com2.제조회사 + "\t모니터크기: " + com2.모니터크기 + "in");
		
		
	}
}
