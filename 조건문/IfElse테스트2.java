package ���ǹ�;

public class IfElse�׽�Ʈ2 {
	public static void main(String[] args) {
			int jumsu = 88;
			
			String result = "";	//�׻� �ʱ�ȭ �صα�
			
			if (jumsu >= 90) {
				result = "A����";
			}else if(jumsu >=85 && jumsu <= 90) {
				result = "B+����";
			}else if(jumsu >=80) {
				result = "B����";
			}else if(jumsu >=75 && jumsu <= 80) {
				result = "B-����";
			}else if (jumsu >= 70) {
				result = "c����";
			}else result = "D����";
			
			System.out.println(result);
	}
}
