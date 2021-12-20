package javaexamples;

public class RemoveWhiteSpace {
	
	public static String removeWhiteSpace(String str) {
		String result ="";
		for(int i=0; i<str.length();i++){
		if(str.charAt(i) != ' ' &&  str.charAt(i) != '\t') {
			result = result + str.charAt(i);
		}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(removeWhiteSpace(" hello	  world"));
		
	}

}
