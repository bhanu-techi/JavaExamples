package javaexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FIndTheTimesOfDuplicatesInString {

	public static void main(String[] args) {
		 Map<Character, Integer> results = findTheNumberOfDuplicateOccurances("JAVA  ");
		 
		 System.out.println(results);
		 System.out.println(results.keySet());
		 System.out.println(results.values());
//		 Set<Entry<Character, Integer>> s = results.entrySet();
//		 Iterator it = s.iterator();
//		 
//		 while(it.hasNext()) {
//			 Map.Entry<Character,String> m1 = (Map.Entry)it.next();
//			// System.out.println(m1.getKey());
//		 }
		 
		 for (Map.Entry<Character, Integer> entry : results.entrySet()) {
			System.out.println(entry.getKey());
		}
		 
	}

	public static Map<Character, Integer> findTheNumberOfDuplicateOccurances(String str) {
		Map<Character, Integer> mapObj = new HashMap<>();
		int temp = 1;
		char[] ch = str.toCharArray();

		for (int i = 0; i <= str.length() - 1; i++) {
			if (mapObj.containsKey(ch[i])) {
				mapObj.put(ch[i], mapObj.get(ch[i]) + 1);
			} else
				mapObj.put(ch[i], temp);

		}
		System.out.println(mapObj.size());
		return mapObj;
	}

}
