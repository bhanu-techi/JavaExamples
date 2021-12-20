package javaexamples.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortingMap {
	
	public static void main(String args[]) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1,"USA");
		map.put(89, "China");
		map.put(23, "India");
		map.put(65, "Australia");
		
		
		
		
		List<Integer> mapKeys = new ArrayList<Integer>(map.keySet());
		Collections.sort(mapKeys);
		System.out.println(mapKeys);
		
		Map<Integer,String> treeObj = new TreeMap<Integer,String>();
		
		treeObj.putAll(map);
	
		
		for (Map.Entry<Integer,String> entry : treeObj.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
	}

}
