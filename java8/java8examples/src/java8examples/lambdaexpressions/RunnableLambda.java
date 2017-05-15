package java8examples.lambdaexpressions;

public class RunnableLambda {

	public static void main(String[] args) {
		
		// Anonymous inner class
		Thread myThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Printed inside runnable");
			}
		});
		
		myThread.run();
		
		
		// Instead of passing anonymous inner class, we can pass lambda which matches the type of run method of runnable interface.
		// and thread constructor will accept lambda as well as inner classes.
		
		Thread lambdaThread=new Thread(()->System.out.println("Lambda Thread"));
		lambdaThread.run();
	}
}
