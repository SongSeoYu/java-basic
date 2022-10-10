package 추상클래스인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 모니터() {
		// TODO Auto-generated method stub
		System.out.println("바나나처럼 길쭉한 모니터");
	}

	@Override
	public void 자판() {
		// TODO Auto-generated method stub
		System.out.println("ㅈㅏㅍㅏㄴ");
	}

	@Override
	public void 마우스() {
		// TODO Auto-generated method stub
		System.out.println("딸깍딸깍");
	}

}
