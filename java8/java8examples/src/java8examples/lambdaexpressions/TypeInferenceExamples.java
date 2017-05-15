package java8examples.lambdaexpressions;

public class TypeInferenceExamples {

	public static void main(String[] args) {
		
		StringLengthLambda myLambda=(String s)->s.length();
		
		// Above Lambda Expressions type is StringLenghtLambda.
		// So it will match the lambda type with interface method.
		
		int length=myLambda.getLength("Hello Lambda");
		System.out.println(length);
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}
}
