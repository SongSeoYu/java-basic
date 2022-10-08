package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링 {
	public static void main(String[] args) {
		
		String[] code = {"005930", "000660", "047810"};
		String[] company = {"삼성전자", "sk하이닉스", "한국항공우주"};
		
//		for (int i = 0; i < company.length; i++) {
			try {
				Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
				System.out.println("-------------------");
				
//				
//				//시가
//				Elements list3 = doc.select("td.first").select(".blind");
//				Element tag3 = list.get(1);
//				System.out.println("시가: " + tag3.text());
				
				//사명
				Elements list4 = doc.select("div").select("h2").select("a");
				System.out.println(list4);
				Element tag4 = list4.get(1);
				System.out.println("사명: " + tag4.text());
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
//		}
	}
}
