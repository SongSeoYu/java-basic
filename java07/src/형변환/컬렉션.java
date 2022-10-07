package 형변환;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import javax.management.Query;

public class 컬렉션 {
	public static void main(String[] args) {
		HashSet member = new HashSet();
		member.add("디자이너");
		member.add("프로그래머");
		member.add("DB관리자");
		System.out.println(member);
		
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.add("미래우유");
		milk.remove();
		System.out.println(milk);
		
		//3. list -> ArrayLIst
		ArrayList ski = new ArrayList();
		ski.add("김이름");
		ski.add("최이름");
		ski.add("이이름");
		ski.add("정이름");
		ski.remove(1);
		System.out.println(ski);
	}
}
