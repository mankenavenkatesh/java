package java8examples.streamapi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// List<Integer> myList = new ArrayList<>();
		// for (int i = 0; i < 100; i++) {
		// myList.add(i);
		// }
		//
		//
		// // Getting Sequential Stream
		// Stream<Integer> sequentialStream = myList.stream();
		// Stream<Integer> highNum = sequentialStream.filter(p -> p > 90);
		// highNum.forEach(p -> System.out.println("High Numbs-" + p));
		//
		// // Getting Parallel Stream
		// Stream<Integer> parallelStream = myList.parallelStream();
		// Stream<Integer> highNumsSeq = parallelStream.filter(p -> p > 90);
		// highNumsSeq.forEach(p -> System.out.println("High Nums Parallel-" +
		// p));

		List<Integer> listOfNumbers = new LinkedList<>();
		for (int i = 0; i < 10000; i++) {
			listOfNumbers.add(i);
		}

		Stream<Integer> seqStream = listOfNumbers.stream();
		Stream<Integer> numbersGreaterThanThousand = seqStream.filter(p -> p > 9000);
		numbersGreaterThanThousand.forEach(p -> System.out.println("No" + p));

		Stream<Integer> parallelStream = listOfNumbers.parallelStream();
		Stream<Integer> noGreaterThanThousand = parallelStream.filter(p -> p > 9000);
		noGreaterThanThousand.forEach(p -> System.out.println("Parallel No-" + p));

	}
}
