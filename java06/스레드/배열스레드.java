package 스레드;


public class 배열스레드 extends Thread {
	@Override
	public void run() {
		String[] s = {"체리","연유라떼","수제버거","멸치국수","빵"};
		for (int i = 0; i < s.length; i++) {
			System.out.println("음식이름>> " + s[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}