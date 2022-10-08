package 컬렉션;

import java.util.HashMap;

public class HashMap확인문제 {
	public static void main(String[] args) {
		HashMap c = new HashMap();
		c.put(100, "김데이");
		c.put(200, "김사전");
		c.put(300, "김구조");
		c.put(400, "김자료");
		c.remove(200);
		c.put(300, "김충성");
		System.out.println(c);
	}
}
