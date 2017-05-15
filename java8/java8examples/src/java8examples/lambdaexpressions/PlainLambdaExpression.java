package java8examples.lambdaexpressions;

public class PlainLambdaExpression {

	public static void main(String[] args) {
		MyLambda aBlockOfCode= () -> System.out.println("Hello World");
		aBlockOfCode.foo();
		
		MyLambaDup aBlockOfCode2=()->System.out.println("Hello World Again");
		
		aBlockOfCode2.yoo();
	}
	
	interface MyLambda{
		void foo();
	}
	
	interface MyLambaDup{
		void yoo();
	}
}
