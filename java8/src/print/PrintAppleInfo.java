package print;

import java8.Apple;

public class PrintAppleInfo implements PrintApple {
	public String print(Apple a) {
		return a.getColor() + " apple : " + a.getWeight() + "g from " + a.getFrom() + " " + a.getPrice() + " won";
	}
}
