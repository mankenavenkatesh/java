package java8examples.parallelarrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class TestParallelArrays {

	public static void main(String[] args) {
		long[] nums=new long[100000];
		Arrays.parallelSetAll(nums, index->ThreadLocalRandom.current().nextInt(100000));
		Arrays.stream(nums).limit(10).forEach(num->System.out.println(num));
		
		System.out.println("Sorting");
		Arrays.parallelSort(nums);
		Arrays.stream(nums).limit(10).forEach(i->System.out.println(i));
		
	}
}
