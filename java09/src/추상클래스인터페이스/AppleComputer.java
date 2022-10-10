package 추상클래스인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 모니터() {
		// TODO Auto-generated method stub
		System.out.println("애플 로고가 뜬다");
	}

	@Override
	public void 자판() {
		// TODO Auto-generated method stub
		System.out.println("자판자판");
	}

	@Override
	public void 마우스() {
		// TODO Auto-generated method stub
		System.out.println("마우스가 찍찍");
	}

}
