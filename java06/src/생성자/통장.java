package 생성자;

public class 통장 {
	//멤버변수
	//class아래에 선언(class전체에서 사용 가능)
	//글로벌변수(global)
	String name;
	String ssn;
	int money;
	
	
	//매소두 이름을 클래스이름과 동이랗게 void를 안씀
	//new 객체생성시 입력값을 자동초기화
	//객체생성할 때 필요한 값을 한정시킬 수 있음.
	//생성자 메서드(메서드 생략)=> 생성자(constructor)
	public 통장(String name, String ssn, int money) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
}
