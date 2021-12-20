package javaexamples;

public class RemoveSpace {
	
	public static void maiin(String[] args) {
	removeSpce("  Java Is difficult");
	}

	private static String removeSpce(String str) {
		
		str.trim();
		String nospaceStr = null;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ' && str.charAt(i) != '\t') {
				nospaceStr = nospaceStr + str.charAt(i);
			}
		}
		
		return nospaceStr;
	}
}
