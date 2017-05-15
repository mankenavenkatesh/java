package java8examples.interfacemethods;

public interface Interface1 {

	default public void log(String str){
		System.out.println("I1 Logging-"+str);
	}
}
