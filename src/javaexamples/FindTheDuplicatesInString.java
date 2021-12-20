package javaexamples;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicatesInString {

	public static void main(String[] args) {
		Set<Character> resultSet = findtheDuplicates("Java");
		
		for (Character character : resultSet) {
			System.out.println(character);
		}
	}
	public static Set<Character> findtheDuplicates(String str) {
		Set<Character> setObj = new HashSet<>();
		char[] ch = str.toCharArray();
		
		for(int i=0 ; i<str.length()-1; i++) {
			
			setObj.add(ch[i]);
		}
		
		return setObj;
	}
}
