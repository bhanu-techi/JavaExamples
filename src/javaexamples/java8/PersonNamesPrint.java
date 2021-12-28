package javaexamples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PersonNamesPrint {

	public static void main(String[] args) {
		Person p1 = new Person("Sana", 23);
		Person p2 = new Person("Arav", 18);
		Person p3 = new Person("John", 40);
		Person p4 = new Person("Jack", 37);
		Person p5 = new Person("Lilly", 25);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);

		Predicate<Person> ageChkPredicate = (P) -> P.getAge() > 18;

		for (Person person : persons) {
			boolean isnotEligable = ageChkPredicate.negate().test(person); // performs reverse function 
			boolean isEligable = ageChkPredicate.test(person);
			if (isEligable) {
				System.out.println(person);
			}
		}
	}
}
