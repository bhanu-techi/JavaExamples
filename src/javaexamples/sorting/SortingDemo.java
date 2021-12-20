package javaexamples.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortingDemo {
	
	public static void main(String args[]) {
	
//	Map<Student, String> mapObj = new HashMap<Student, String>();
	
	Student std1 = new Student(23,"Java","A");
	Student std2 = new Student(46,"Ruby","C");
	Student std3 = new Student(72,"Python","B");
	Student std4 = new Student(40,"Java","E");
	Student std5 = new Student(92,"C++","Z");
	
	List<Student> list = new ArrayList<>();
	
	list.add(std1);
	list.add(std2);
	list.add(std3);
	list.add(std4);
	list.add(std5);
	
	// By implementing anynamous implementation for Comparator Interface
	Comparator<Student> comp = new Comparator<Student>() {
		@Override
		public int compare(Student obj1, Student obj2) {
			if(obj1.getStudentId() > obj2.getStudentId()) {
				return 1;
			}else {
				return -1;
			}
		}
	};	
	Collections.sort(list, comp);
	
	// Using Lamda Expression
	//Collections.sort(list, (o1,o2) -> { return (o1.getStudentId( )> o2.getStudentId())?1:(o1.getStudentId()<o2.getStudentId())?-1:0;});
	
	// To sort the Coruse name using String1.compareTo(String2) method in String class inside Comparator Interface
	Collections.sort(list, (o1,o2) -> {return (o1.getCourseName().compareTo(o2.getCourseName()));
									});
	
	for (Student student : list) {
		System.out.println(student);
	}
	
	
	
	// Arrays.asList() will create fixed length of list Object, later on you an to increae the size of the list
	List<Student> asList = Arrays.asList(std1,std2,std3,std4);
	
	//asList.add(std5);
	
	System.out.println("---------------------------------------");
	for(Student student : asList) {
		System.out.println(student);
	}
	}
	

}
