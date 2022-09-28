package 조건문;

public class IfElse테스트2 {
	public static void main(String[] args) {
			int jumsu = 88;
			
			String result = "";	//항상 초기화 해두기
			
			if (jumsu >= 90) {
				result = "A학점";
			}else if(jumsu >=85 && jumsu <= 90) {
				result = "B+학점";
			}else if(jumsu >=80) {
				result = "B학점";
			}else if(jumsu >=75 && jumsu <= 80) {
				result = "B-학점";
			}else if (jumsu >= 70) {
				result = "c학점";
			}else result = "D학점";
			
			System.out.println(result);
	}
}
