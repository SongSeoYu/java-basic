package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습4 {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930").get();

			Elements list = doc.select("td.first").select(".blind"); // class가 nav인 태그를 찾아서 묶어서 가져와줘

			//전일가
			System.out.println(list);
			Element tag = list.get(0);
			System.out.println("전일가" + tag.text());
			String yesterday = tag.text();
			
			//현재가
			Elements list2 = doc.select("div.today").select(".blind");
			System.out.println(list2);
			Element tag2 = list2.get(0);
			System.out.println("현재가" + tag2.text());
			String today = tag2.text();
			
			//고가
//			Elements list3 = doc.select(".no_up").select(".blind");
//			System.out.println(list3);
//			Element tag3 = list3.get(0);
//			System.out.println("고가" + tag3.text());
//			String high = tag3.text();
			
			//시가
			Elements list3 = doc.select(".no_up").select(".blind");
			Element tag3 = list3.get(1);
			System.out.println("고가" + tag3.text());
			
//			for (int i = 0; i < list.size(); i++) {
//				Element tag = list.get(i);
//				System.out.println(i + ": " + tag.text());
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}