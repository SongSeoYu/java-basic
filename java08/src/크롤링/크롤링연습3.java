package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습3 {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://news.naver.com/?viewType=pc\r\n"
					+ "").get();

			Elements list = doc.select(".Nitem_link_menu"); // class가 nav인 태그를 찾아서 묶어서 가져와줘

			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(i + ": " + tag.text());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
