package 추상클래스인터페이스;

public class 향상된액션처리클래스 implements MyAction {

	@Override
	public void click() {
		System.out.println("보안이 강회된 상태로 인터넷으로 연결");

	}

	@Override
	public void dbClick() {
		System.out.println("화면에 경고메세지를 띄운 후, 화면을 닫는 처리 구현");

	}

}
