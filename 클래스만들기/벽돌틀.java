package 클래스만들기;

public class 벽돌틀 {
	//하드웨어(물건) 개념
	//속성(성질 == property, attribute
	//기능(동작) == function, 함수
	//틀을 만들기위해서는 문걸들이 가지는 공통된 속성,성질을 정의해야함
	//속성 --> x,y
	public int x; //멤버변수는 자동초기화
	public int y;
	
	//동작 --> 쌓다.(동사형태)
	//public : 접근 제어자. 아무패키지나 다 접근 가능
	public void 쌓다() {
		//쌓다라는 어떤 것들을 처리해 준다(동작한다.)
		//정의. 여러줄 가능!!!
		System.out.println("벽돌을 쌓다.");
	}
}
