package javaexamples;

public class StringPalindrome {
	
	public static void main(String[] args) {
		System.out.println(chkPalindrome("civic"));
		String str1 = "civic";
		System.out.println(str1.length());
	}
	
	public static boolean chkPalindrome(String str) {
		char[] charArray = str.toCharArray();
		System.out.println(charArray.length);
		int j= str.length()-1;
		for(int i=0; i<= str.length()-1; i++) {
			if(charArray[i] != charArray[j]) {
				return false;
			}
			j--;
		}
		
		return true;
	}

}
