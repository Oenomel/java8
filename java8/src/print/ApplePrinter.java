package print;

import java.util.List;
import java8.Apple;

public class ApplePrinter {
	public static void applePrinter(List<Apple> list, PrintApple p) {
		list.forEach((Apple a) -> System.out.println(p.print(a)));
	}
}
