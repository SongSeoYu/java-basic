package 크롤링;

import java.io.IOException;

import javax.lang.model.element.Element;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {
			//1.사이트에 연결해서, html 문서 소스를 다 가지고오자
			try {
				Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930").get();
				//System.out.println(doc);
			
				Elements list = doc.select(".blind");	//class가 nav인 태그를 찾아서 묶어서 가져와줘
				
				System.out.println(list.size());
//				for (int i = 0; i < list.size(); i++) {
//					org.jsoup.nodes.Element tag = list.get(i);
//					System.out.println(i + tag);
//				}
				//현재가
				org.jsoup.nodes.Element tag = list.get(16);
				System.out.println(tag.text());
				
				//전
			}
				 catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
//				
		}}
