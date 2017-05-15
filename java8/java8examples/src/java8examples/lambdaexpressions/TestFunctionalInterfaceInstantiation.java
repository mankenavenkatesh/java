package java8examples.lambdaexpressions;

public class TestFunctionalInterfaceInstantiation {

	public static void main(String[] args) {
		// creating normal anonymous class
		FunctionalInterface1 f=new FunctionalInterface1() {
			
			@Override
			public void method(String str) {
				System.out.println("Functional Interface Anonymous class"+str);
				
			}
		};
		f.method("hello");
		
		
		// Create anonymous class using lambda expression 
		FunctionalInterface1 functionalInterface1= (s)->{System.out.println("Anonymous class using lambda expression"+s);};
		functionalInterface1.method("hello");
	}
}
