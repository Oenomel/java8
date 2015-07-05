package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleFilter {
	public static List<Apple> filterApples(List<Apple> list, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		list.forEach((Apple a) -> {if(p.test(a))result.add(a);});
	
		return result;
	}
}