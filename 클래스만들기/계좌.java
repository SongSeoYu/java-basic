package 클래스만들기;

public class 계좌 {
	public String 이름;
	public String 상품이름;
	public int 금액;
	
	public void 계좌정보() {
		System.out.println("계좌 [ 이름=" + 이름 + ", " + "상품이름=" + 상품이름 + ", " + "금액=" + 금액 + "]");
	}
	public void 예금하다() {
		System.out.println(상품이름 + "에 " + 금액 + "원 입금되었습니다.");
	}
	
	public void 출금하다() {
		System.out.println(상품이름 + "에서 " + 금액 + "원 출금되었습니다.");
	}
}

