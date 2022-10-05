package 정적;

public class 직원 {
	String name;
	int age;
	String sex;
	static int totalAge;
	static int count;
	static double avr;
	
	public 직원(String name, int age, String sex) {
		count++;
		totalAge +=age;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	
	@Override
	public String toString() {
		return "직원 [성명=" + name + ", 나이=" + age + ", 성별=" + sex + "]";
	}


	public static double getAvg() {
		return totalAge / (double)count;
	}
	
}
