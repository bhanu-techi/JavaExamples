package javaexamples.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateTest1 {
	
	public static void isEmptyStr() {
		
	}

	public static void main(String[] args) {
		Predicate<String> predicate1 = (str) -> str.isEmpty();
		boolean test = predicate1.test("");
		
		System.out.println(test);
		
		String[] names = {"Arav","Sana","Sam","Varu","Kahan","avi","Sona","yesh"};
		
		Predicate<String> prdicate2 = (str) -> str.toLowerCase().startsWith("a");
		
		for(String s : names) {
			if(prdicate2.test(s))
				System.out.println(s);
			
		}
	}
}
