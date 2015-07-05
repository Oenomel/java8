package print;

import java8.Apple;

public class PrintAppleColor implements PrintApple {
	public String print(Apple a) {
		return "It's an" + a.getColor() + " apple.";
	}
}
