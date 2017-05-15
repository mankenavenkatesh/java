package java8examples.interfacemethods;

public class Class4 implements Interface1, Interface2{

	@Override
	public void log(String str) {	
		System.out.println("ovverride log method-"+str);
	}

}
