package java8;

import java.util.List;

import print.ApplePrinter;
import print.PrintAppleInfo;

public class LamdaTest {
	public static void main(String[] args) {
		List<Apple> apples = Generator.generator(10);
		
		for(Apple a : apples) {
			System.out.println(a);
		}
		
		System.out.println("----------------------------");
		
		for(Apple a : AppleFilter.filterApples(apples, (Apple apple) -> apple.getWeight() > 65)) {
			System.out.println(a);
		}
		
		System.out.println("----------------------------");
		
		ApplePrinter.applePrinter(apples, new PrintAppleInfo());
	}
}
