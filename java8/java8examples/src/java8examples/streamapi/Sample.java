package java8examples.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class Sample {

	public static List<Person> createPeople() {
		return Arrays.asList(new Person("venky", Gender.MALE, 22), new Person("shashank", Gender.MALE, 25),
				new Person("sara", Gender.FEMALE, 24));

	}

	public static void main(String[] args) {
		List<Person> people = createPeople();

		// Withought Stream
		// get in uppercase the names of all females older than age 18
		List<String> names = new ArrayList<>();
		for (Person person : people) {
			if (person.getAge() > 18 && person.getGender() == Gender.FEMALE) {
				names.add(person.getName());
			}
		}

		System.out.println(names);
		// With Stream
		List<String> names2 = people.stream().filter(p -> p.getAge() > 18).filter(p -> p.getGender() == Gender.FEMALE)
				.map(p -> p.getName()).map(name -> name.toUpperCase()).collect(toList());
		System.out.println(names2);

	}
}
