package javaexamples;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseStr("Bhanu"));
	}
	public static String reverseStr(String str){
		StringBuffer reversedStr = new StringBuffer();
		
		char[] chr = str.toCharArray();
		 for(int i=str.length()-1; i>=0; i--) {
			 reversedStr = reversedStr.append(chr[i]);
			 
		 }
		
		return reversedStr.toString();
	}
}
