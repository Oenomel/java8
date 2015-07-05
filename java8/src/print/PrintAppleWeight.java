package print;

import java8.Apple;

public class PrintAppleWeight implements PrintApple {
	public String print(Apple a) {
		return a.getWeight() + " g";
	}
}
