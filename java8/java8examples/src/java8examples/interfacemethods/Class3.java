package java8examples.interfacemethods;

public class Class3 implements Interface1, Interface2{

	@Override
	public void log(String str) {
		
		Interface1.super.log(str);
	}

	
}
