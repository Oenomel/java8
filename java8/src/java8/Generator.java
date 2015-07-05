package java8;

import java.util.ArrayList;
import java.util.List;

public class Generator {
	public static List<Apple> generator (int leng) {
		List<Apple> list = new ArrayList<>();
		
		while(list.size() < leng) {
			Apple a = new Apple();
			
			if((int)(Math.random()*10) % 2 == 0) {
				a.setColor("red");
			}
			else {
				a.setColor("green");
			}
			
			if((int)(Math.random()*10) % 2 == 0) {
				a.setFrom("kor");
			}
			else {
				a.setFrom("us");
			}
			
			a.setPrice((int)(Math.random()*1000 + 100));
			a.setWeight((int)(Math.random()*100 + 10));
			
			list.add(a);
		}
		
		return list;
	}
}
