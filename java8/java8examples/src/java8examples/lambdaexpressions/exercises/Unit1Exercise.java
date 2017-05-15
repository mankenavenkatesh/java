package java8examples.lambdaexpressions.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> people=Arrays.asList(
				new Person("venkatesh", "mankena", 28),
				new Person("harvey", "specter", 37),
				new Person("mike", "ross", 30)
				
				);
		
		// sort by lastname
		Collections.sort(people,(p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
		printAll(people);
		
		System.out.println("----------");
		// print persons whose firstname starts with "m"
		performConditionally(people, p->p.getFirstName().startsWith("m"), (p)->System.out.println(p));
	}
	
	public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
		Iterator<Person> iterator=people.iterator();
		while(iterator.hasNext()){
			Person p=iterator.next();
			if(predicate.test(p)){
				consumer.accept(p);
			}
			
		}
	}
	
	
	
	public static void printAll(List<Person> people){
		Iterator<Person> iterator=people.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
}
