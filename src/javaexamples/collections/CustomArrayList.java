package javaexamples.collections;

import java.util.ArrayList;
/* This class is a customeArrayList to override the add method to avoid the duplicates in custom arraylist */
public class CustomArrayList extends ArrayList<String> {
	
	@Override
	public boolean add(String e) {
		if(this.contains(e))
			return true;
		else
		return super.add(e);
	}
	

	public static void main(String[] args) {
		CustomArrayList customObj = new CustomArrayList();
		
		customObj.add("Sara");
		customObj.add("Sara");
		customObj.add("Ara");
		customObj.add("Sara");
		customObj.add("Sara");
		
		System.out.println(customObj);
	}

}

/* OUT PUT is : [Sara, Ara]*/
