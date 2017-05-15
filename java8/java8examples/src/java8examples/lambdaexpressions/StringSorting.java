package java8examples.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSorting {

	//http://www.java-programming.info/tutorial/pdf/java/exercises/exercises-lambdas-1.pdf
	public static void main(String[] args) {
		String[] words=new String[2];
		words[0]="bbf";
		words[1]="asd";
		
		Arrays.sort(words, (s1,s2)->s1.compareTo(s2));
		
		System.out.println(Arrays.asList(words));
		
	}
}

