package java8examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ForeachTest {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");

		// Without foreach method
		// Iterator is used to iterate through collection. business logic will
		// be added inside loop
		// Business logic is tightly bound with loop.
		Iterator<String> itr = arr.iterator();
		while (itr.hasNext()) {
			// business logic goes inside the loop
			System.out.println(itr.next());
		}

		// Using forEach, we completely focus on business logic.
		arr.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println("java8 - " + t);
			};
		});

		// using external consumer inside for each.
		MyConsumer myConsumer = new MyConsumer();
		arr.forEach(myConsumer);

	}

}

class MyConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println("inside myconsumer-"+t);
	}

}