package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링연습 {
	public static void main(String[] args) {
		//1.사이트에 연결해서, html 문서 소스를 다 가지고오자
		try {
			Document doc = Jsoup.connect("http://www.naver.com").get();
			//System.out.println(doc);
			Elements list = doc.select(".nav");	//class가 nav인 태그를 찾아서 묶어서 가져와줘
			System.out.println(list.size());
//			System.out.println(list.get(0));
//			System.out.println(list.get(1));
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
