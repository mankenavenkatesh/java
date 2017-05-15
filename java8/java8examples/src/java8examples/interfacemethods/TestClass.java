package java8examples.interfacemethods;

public class TestClass {

	public static void main(String[] args) {
		// Class1 gets the default log method implementation of Interface 1
		Class1 c1=new Class1();
		c1.log("c1");
		
		// Class2 is not compiled as it implements both the interfaces. there is a conflict with log method between two interfaces
		
		// class3 gets the interface1 log method implementation though it implements both interfaces.
		Class3 c3=new Class3();
		c3.log("c3");
		
		// class4 has its own implemenation of log method. this will override default interface implementation 
		Class4 c4=new Class4();
		c4.log("c4");
		
		// class5 super class has log method. the interface default log method becomes irrelevant if same method is present in class hierarchy.
		Class5 c5=new Class5();
		c5.log("c5");
	}
}
