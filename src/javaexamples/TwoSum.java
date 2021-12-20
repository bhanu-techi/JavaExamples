package javaexamples;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] numArray = {2,3,4,6,7};
		int[] result = findTheTwoSum(numArray,1);
		System.out.println(result[0] +"," + result[1]);
		
	}
	public static int[] findTheTwoSum(int[] num, int target) {
		Map<Integer,Integer> mapObj = new HashMap<Integer,Integer>();
		int temp=1;
		int alpha;
		System.out.println(num.length);
		for(int i=0; i< num.length; i++) {
			alpha = target-num[i];
			if(mapObj.containsKey(alpha)){
				return new int[] {mapObj.get(alpha), i};
			}else
				mapObj.put(num[i],i);
		}
		
		return new int[] {-1,-1};
	
	}
}
